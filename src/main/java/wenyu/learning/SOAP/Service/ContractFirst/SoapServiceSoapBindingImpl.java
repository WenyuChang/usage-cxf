/**
 * SoapServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wenyu.learning.SOAP.Service.ContractFirst;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(name="SoapServicePort", serviceName="SoapService", portName="SoapServicePort")
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL, parameterStyle=ParameterStyle.WRAPPED)
public class SoapServiceSoapBindingImpl implements wenyu.learning.SOAP.Service.ContractFirst.ISOAPService{
    @WebMethod
	public void simpleExecute() throws java.rmi.RemoteException {
    	System.out.println("=== In the Simple Execute Method (Contract First) ===");
    }
    @WebMethod
    public java.lang.String executeModel(wenyu.learning.SOAP.Service.ContractFirst.Model arg0) throws java.rmi.RemoteException {
    	System.out.println("=== In the Simple Execute Method (Contract First) ===");
		System.out.println("    Pass-in model is: " + arg0.toString());
		String str = arg0.execute();
		return str;
    }

}
