

import java.io.File;
import java.io.IOException;
import java.net.URI;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse;


/**
 * Servlet implementation class ControlServlet
 */
@WebServlet(name="ControlServlet",urlPatterns={"/home"})
public class NewControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public NewControlServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eventSetId;
		String eventSetIdD;
		String targetCurrency;
		String[] downloadRequest;
		String[] importRequest;
		String[] summaryRequest;
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());
		if(request.getParameter("currencyService") != null){
			
			eventSetId = request.getParameter("eventSetId");
			targetCurrency = request.getParameter("targetCurrency");
			System.out.println(eventSetId +" " + targetCurrency);
			String[] params = new String[2];
			params[0] = eventSetId;
			params[1] = targetCurrency;
			WebServiceClient.setInputEventSetId(eventSetId);
			WebServiceClient.setInputTargetCurrency(targetCurrency);
			WebServiceClient.main(null);
			getServletContext().setAttribute("outputEventSetId", WebServiceClient.getOutputEventSetId());
			response.sendRedirect("../NewSoapServices/home#currency");
			
		}	else if(request.getParameter("downloadService") != null){
			
			eventSetIdD = request.getParameter("downloadEventSetId");
			downloadRequest = new String[2];
			downloadRequest[0] = "download";
			downloadRequest[1] = eventSetIdD;
			String outputdataSourceURL = ImportDownloadWebServiceClient.main(downloadRequest);
			System.out.println(outputdataSourceURL);
			getServletContext().setAttribute("outputDataSourceURL", outputdataSourceURL);
			response.sendRedirect("../NewSoapServices/home#import");
			
		}	else if(request.getParameter("importService") != null){
			importRequest = new String[5];
			importRequest[0] = "import";
			importRequest[1] = request.getParameter("sec");
			importRequest[2] = request.getParameter("startDate");
			importRequest[3] = request.getParameter("endDate");
			importRequest[4] = request.getParameter("dataSourceURL");
			
			String outputImportEventSetId = ImportDownloadWebServiceClient.main(importRequest);
			getServletContext().setAttribute("outputImportEventSetId", outputImportEventSetId);
			response.sendRedirect("../NewSoapServices/home#import");
			
		}	else if(request.getParameter("summaryService") != null){
			summaryRequest = new String[1];
			summaryRequest[0] = request.getParameter("summaryEventSetId");
			SummaryMarketDataResponse res = NewSummaryDataWebServiceClient.main(summaryRequest);
			getServletContext().setAttribute("outputSummaryEventSetId", res.getEventSetId());
			getServletContext().setAttribute("outputSummaryStartDate", res.getStartDate());
			getServletContext().setAttribute("outputSummaryEndDate", res.getEndDate());
			getServletContext().setAttribute("outputSummaryMarketType", res.getMarketType());
			getServletContext().setAttribute("outputSummaryCurrencyCode", res.getCurrencyCode());
			getServletContext().setAttribute("outputSummaryFileSize", res.getFileSize());
			response.sendRedirect("../NewSoapServices/home#summary");
		}
		else if(request.getParameter("xml-convert") != null){
			String evID = request.getParameter("eventIdToXML");
			String resp = "no event id specified";
			if (evID != null) {
				resp = service.path("events").path(evID).header("Auth", "abc123").put(String.class);
			}	
			getServletContext().setAttribute("toXMLOutput",resp);
			response.sendRedirect("../NewSoapServices/home#currency");
		}
		else if (request.getParameter("xml-query") != null) {
			String evID = request.getParameter("eventIdToQuery");
			String type = request.getParameter("queryType");
			String resp1 = "no event id specified";
			if (evID != null && type != null) {
				resp1 = service.path("events").path(evID).path(type).header("Auth", "abc123").get(String.class);
			}
			getServletContext().setAttribute("toQueryOutput", resp1);
			response.sendRedirect("../NewSoapServices/home#currency");
		}
		else{
				request.getRequestDispatcher("homepage.jsp").forward(request, response);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	private static URI getBaseURI() {
		return UriBuilder.fromUri(
				"http://localhost:8080/DataService").build();
	}

}
