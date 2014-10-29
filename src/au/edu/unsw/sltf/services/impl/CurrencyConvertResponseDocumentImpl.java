/*
 * An XML document type.
 * Localname: currencyConvertResponse
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.CurrencyConvertResponseDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services.impl;
/**
 * A document containing one currencyConvertResponse(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public class CurrencyConvertResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.CurrencyConvertResponseDocument
{
    
    public CurrencyConvertResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENCYCONVERTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "currencyConvertResponse");
    
    
    /**
     * Gets the "currencyConvertResponse" element
     */
    public au.edu.unsw.sltf.services.CurrencyConvertResponseDocument.CurrencyConvertResponse getCurrencyConvertResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrencyConvertResponseDocument.CurrencyConvertResponse target = null;
            target = (au.edu.unsw.sltf.services.CurrencyConvertResponseDocument.CurrencyConvertResponse)get_store().find_element_user(CURRENCYCONVERTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "currencyConvertResponse" element
     */
    public void setCurrencyConvertResponse(au.edu.unsw.sltf.services.CurrencyConvertResponseDocument.CurrencyConvertResponse currencyConvertResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrencyConvertResponseDocument.CurrencyConvertResponse target = null;
            target = (au.edu.unsw.sltf.services.CurrencyConvertResponseDocument.CurrencyConvertResponse)get_store().find_element_user(CURRENCYCONVERTRESPONSE$0, 0);
            if (target == null)
            {
                target = (au.edu.unsw.sltf.services.CurrencyConvertResponseDocument.CurrencyConvertResponse)get_store().add_element_user(CURRENCYCONVERTRESPONSE$0);
            }
            target.set(currencyConvertResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "currencyConvertResponse" element
     */
    public au.edu.unsw.sltf.services.CurrencyConvertResponseDocument.CurrencyConvertResponse addNewCurrencyConvertResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrencyConvertResponseDocument.CurrencyConvertResponse target = null;
            target = (au.edu.unsw.sltf.services.CurrencyConvertResponseDocument.CurrencyConvertResponse)get_store().add_element_user(CURRENCYCONVERTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML currencyConvertResponse(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public static class CurrencyConvertResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.CurrencyConvertResponseDocument.CurrencyConvertResponse
    {
        
        public CurrencyConvertResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EVENTSETID$0 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "eventSetId");
        
        
        /**
         * Gets the "eventSetId" element
         */
        public java.lang.String getEventSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSETID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "eventSetId" element
         */
        public org.apache.xmlbeans.XmlString xgetEventSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSETID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "eventSetId" element
         */
        public void setEventSetId(java.lang.String eventSetId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSETID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTSETID$0);
                }
                target.setStringValue(eventSetId);
            }
        }
        
        /**
         * Sets (as xml) the "eventSetId" element
         */
        public void xsetEventSetId(org.apache.xmlbeans.XmlString eventSetId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSETID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTSETID$0);
                }
                target.set(eventSetId);
            }
        }
    }
}
