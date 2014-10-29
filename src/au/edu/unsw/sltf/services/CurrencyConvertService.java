

/**
 * CurrencyConvertService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package au.edu.unsw.sltf.services;

    /*
     *  CurrencyConvertService java interface
     */

    public interface CurrencyConvertService {
          

        /**
          * Auto generated method signature
          * 
                    * @param currencyConvert0
                
             * @throws au.edu.unsw.sltf.services.CurrencyConvertFaultException : 
         */

         
                     public au.edu.unsw.sltf.services.CurrencyConvertResponseDocument currencyConvert(

                        au.edu.unsw.sltf.services.CurrencyConvertDocument currencyConvert0)
                        throws java.rmi.RemoteException
             
          ,au.edu.unsw.sltf.services.CurrencyConvertFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param currencyConvert0
            
          */
        public void startcurrencyConvert(

            au.edu.unsw.sltf.services.CurrencyConvertDocument currencyConvert0,

            final au.edu.unsw.sltf.services.CurrencyConvertServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    