/**
 * SoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wenyu.learning.SOAP.Service.ContractFirst;

@SuppressWarnings("serial")
public class SoapServiceLocator extends org.apache.axis.client.Service implements wenyu.learning.SOAP.Service.ContractFirst.SoapService {

    public SoapServiceLocator() {
    }


    public SoapServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SoapServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SoapServicePort
    private java.lang.String SoapServicePort_address = "http://localhost:8080/CXFLearning/soapService";

    public java.lang.String getSoapServicePortAddress() {
        return SoapServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SoapServicePortWSDDServiceName = "SoapServicePort";

    public java.lang.String getSoapServicePortWSDDServiceName() {
        return SoapServicePortWSDDServiceName;
    }

    public void setSoapServicePortWSDDServiceName(java.lang.String name) {
        SoapServicePortWSDDServiceName = name;
    }

    public wenyu.learning.SOAP.Service.ContractFirst.ISOAPService getSoapServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SoapServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSoapServicePort(endpoint);
    }

    public wenyu.learning.SOAP.Service.ContractFirst.ISOAPService getSoapServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            wenyu.learning.SOAP.Service.ContractFirst.SoapServiceSoapBindingStub _stub = new wenyu.learning.SOAP.Service.ContractFirst.SoapServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSoapServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSoapServicePortEndpointAddress(java.lang.String address) {
        SoapServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    @SuppressWarnings("rawtypes") 
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (wenyu.learning.SOAP.Service.ContractFirst.ISOAPService.class.isAssignableFrom(serviceEndpointInterface)) {
                wenyu.learning.SOAP.Service.ContractFirst.SoapServiceSoapBindingStub _stub = new wenyu.learning.SOAP.Service.ContractFirst.SoapServiceSoapBindingStub(new java.net.URL(SoapServicePort_address), this);
                _stub.setPortName(getSoapServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    @SuppressWarnings("rawtypes") 
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SoapServicePort".equals(inputPortName)) {
            return getSoapServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ContractFirst.Service.SOAP.learning.wenyu/", "SoapService");
    }

    @SuppressWarnings("rawtypes") 
    private java.util.HashSet ports = null;

    @SuppressWarnings({ "rawtypes", "unchecked" }) 
    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ContractFirst.Service.SOAP.learning.wenyu/", "SoapServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SoapServicePort".equals(portName)) {
            setSoapServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
