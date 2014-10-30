/**
 * SoapServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wenyu.learning.SOAP.Service.ContractFirst;

@SuppressWarnings({"serial","rawtypes"})
public class SoapServiceSoapBindingSkeleton implements wenyu.learning.SOAP.Service.ContractFirst.ISOAPService, org.apache.axis.wsdl.Skeleton {
    private wenyu.learning.SOAP.Service.ContractFirst.ISOAPService impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("simpleExecute", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://ContractFirst.Service.SOAP.learning.wenyu/", "simpleExecute"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("simpleExecute") == null) {
            _myOperations.put("simpleExecute", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("simpleExecute")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ContractFirst.Service.SOAP.learning.wenyu/", "model"), wenyu.learning.SOAP.Service.ContractFirst.Model.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("executeModel", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ContractFirst.Service.SOAP.learning.wenyu/", "executeModel"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("executeModel") == null) {
            _myOperations.put("executeModel", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("executeModel")).add(_oper);
    }

    public SoapServiceSoapBindingSkeleton() {
        this.impl = new wenyu.learning.SOAP.Service.ContractFirst.SoapServiceSoapBindingImpl();
    }

    public SoapServiceSoapBindingSkeleton(wenyu.learning.SOAP.Service.ContractFirst.ISOAPService impl) {
        this.impl = impl;
    }
    public void simpleExecute() throws java.rmi.RemoteException
    {
        impl.simpleExecute();
    }

    public java.lang.String executeModel(wenyu.learning.SOAP.Service.ContractFirst.Model arg0) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.executeModel(arg0);
        return ret;
    }

}
