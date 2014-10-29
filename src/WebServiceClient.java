
import au.edu.unsw.sltf.services.CurrencyConvertDocument.CurrencyConvert;
import au.edu.unsw.sltf.services.CurrencyConvertFaultDocument;
import au.edu.unsw.sltf.services.CurrencyConvertFaultDocument.CurrencyConvertFault;
import au.edu.unsw.sltf.services.CurrencyConvertResponseDocument.CurrencyConvertResponse;
import au.edu.unsw.sltf.services.CurrencyConvertServiceStub;
import au.edu.unsw.sltf.services.CurrencyConvertFaultException;
import au.edu.unsw.sltf.services.CurrencyConvertDocument;
import au.edu.unsw.sltf.services.CurrencyConvertResponseDocument;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Web service client that connects to the CurrencyConvertServices
 * Web service.
 */
public class WebServiceClient {

	private static String inputEventSetId;
	private static String inputTargetCurrency;
	private static String outputEventSetId;
    public static void main(String[] args) {
        String wsURL = "http://54.68.53.198/axis2/services/CurrencyConvertService";
        try {
        	CurrencyConvertServiceStub stub = new CurrencyConvertServiceStub(wsURL);
            outputEventSetId = callCurrencyConvertMarketDataOperation(stub,inputEventSetId,inputTargetCurrency);
            System.out.println(outputEventSetId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


	private static String callCurrencyConvertMarketDataOperation(CurrencyConvertServiceStub stub, String eventSetId, String targetCurrency) throws Exception {
        // Ready the request for rdthImport operation.
        CurrencyConvertDocument reqDoc = CurrencyConvertDocument.Factory.newInstance();
        CurrencyConvert req = reqDoc.addNewCurrencyConvert();
        req.setEventSetId(eventSetId);
        req.setTargetCurrency(targetCurrency);        

        String result = "";
        try {
        	CurrencyConvertResponseDocument respDoc = stub.currencyConvert(reqDoc);
            CurrencyConvertResponse resp = respDoc.getCurrencyConvertResponse();
            result += resp.getEventSetId();
        } catch (CurrencyConvertFaultException ce) {
        	CurrencyConvertFaultDocument faultDoc = ce.getFaultMessage();
        	CurrencyConvertFault fault = faultDoc.getCurrencyConvertFault();
        	String faultType = fault.getFaultMessage();
        	result = "Fault type: " + faultType;
        }

        return result;
    }

	public static String getOutputEventSetId() {
		return outputEventSetId;
	}
	
	 public static String getInputEventSetId() {
		return inputEventSetId;
	}

	public static void setInputEventSetId(String inputEventSetId) {
		WebServiceClient.inputEventSetId = inputEventSetId;
	}

	public static String getInputTargetCurrency() {
		return inputTargetCurrency;
	}

	public static void setInputTargetCurrency(String inputTargetCurrency) {
		WebServiceClient.inputTargetCurrency = inputTargetCurrency;
	}

}