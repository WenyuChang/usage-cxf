/**
 * SoapService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wenyu.learning.SOAP.Service.ContractFirst;

public interface SoapService extends javax.xml.rpc.Service {
    public java.lang.String getSoapServicePortAddress();

    public wenyu.learning.SOAP.Service.ContractFirst.ISOAPService getSoapServicePort() throws javax.xml.rpc.ServiceException;

    public wenyu.learning.SOAP.Service.ContractFirst.ISOAPService getSoapServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
