/*
 * An XML document type.
 * Localname: currencyConvert
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.CurrencyConvertDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services.impl;
/**
 * A document containing one currencyConvert(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public class CurrencyConvertDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.CurrencyConvertDocument
{
    
    public CurrencyConvertDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENCYCONVERT$0 = 
        new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "currencyConvert");
    
    
    /**
     * Gets the "currencyConvert" element
     */
    public au.edu.unsw.sltf.services.CurrencyConvertDocument.CurrencyConvert getCurrencyConvert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrencyConvertDocument.CurrencyConvert target = null;
            target = (au.edu.unsw.sltf.services.CurrencyConvertDocument.CurrencyConvert)get_store().find_element_user(CURRENCYCONVERT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "currencyConvert" element
     */
    public void setCurrencyConvert(au.edu.unsw.sltf.services.CurrencyConvertDocument.CurrencyConvert currencyConvert)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrencyConvertDocument.CurrencyConvert target = null;
            target = (au.edu.unsw.sltf.services.CurrencyConvertDocument.CurrencyConvert)get_store().find_element_user(CURRENCYCONVERT$0, 0);
            if (target == null)
            {
                target = (au.edu.unsw.sltf.services.CurrencyConvertDocument.CurrencyConvert)get_store().add_element_user(CURRENCYCONVERT$0);
            }
            target.set(currencyConvert);
        }
    }
    
    /**
     * Appends and returns a new empty "currencyConvert" element
     */
    public au.edu.unsw.sltf.services.CurrencyConvertDocument.CurrencyConvert addNewCurrencyConvert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrencyConvertDocument.CurrencyConvert target = null;
            target = (au.edu.unsw.sltf.services.CurrencyConvertDocument.CurrencyConvert)get_store().add_element_user(CURRENCYCONVERT$0);
            return target;
        }
    }
    /**
     * An XML currencyConvert(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public static class CurrencyConvertImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.CurrencyConvertDocument.CurrencyConvert
    {
        
        public CurrencyConvertImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EVENTSETID$0 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "eventSetId");
        private static final javax.xml.namespace.QName TARGETCURRENCY$2 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "targetCurrency");
        
        
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
        
        /**
         * Gets the "targetCurrency" element
         */
        public java.lang.String getTargetCurrency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETCURRENCY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "targetCurrency" element
         */
        public org.apache.xmlbeans.XmlString xgetTargetCurrency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETCURRENCY$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "targetCurrency" element
         */
        public void setTargetCurrency(java.lang.String targetCurrency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETCURRENCY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETCURRENCY$2);
                }
                target.setStringValue(targetCurrency);
            }
        }
        
        /**
         * Sets (as xml) the "targetCurrency" element
         */
        public void xsetTargetCurrency(org.apache.xmlbeans.XmlString targetCurrency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETCURRENCY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETCURRENCY$2);
                }
                target.set(targetCurrency);
            }
        }
    }
}
