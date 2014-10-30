package wenyu.learning.SOAP.Service.CodeFirst;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import org.apache.cxf.interceptor.InInterceptors;

import wenyu.learning.Model.CodeFirstModel;

/**
 * @WebService
 *    name: <wsdl:portType>
 *    targetNamespace
 *    serviceName: <wsdl:service>
 *    wsdlLocation
 *    endpointInterface
 *    portName: <wsdl:port>
 */

/**
 * @SOAPBinding
 *    style: Style.DOCUMENT/Style.RPC (default: DOCUMENT)
 *    use: Use.LITERAL/Use.ENCODED (default: LITERAL)
 *    parameterStyle: ParameterStyle.WRAPPED/ParameterStyle.BARE (default: WRAPPED)
 */

/** 
 * @WebMethod
 *    operationName: <wsdl:operation>
 *    action: <soap:operation>
 *	  exclude: true/false (default: false)
 */

@WebService(name="SoapServicePort", serviceName="SoapService", portName="SoapServicePort")
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL, parameterStyle=ParameterStyle.WRAPPED)
@InInterceptors(interceptors={"wenyu.learning.Interceptors.MyReceiveInterceptor" })
public class SOAPServiceImpl implements ISOAPService {
	@WebMethod (operationName="SimpleExecuteOp", action="SimpleExecuteAction", exclude=false)
	public void simpleExecute() {
		System.out.println("=== In the Simple Execute Method ===");
		
	}
	
	@WebMethod (operationName="ExecuteModelOp", action="ExecuteModelAction", exclude=true)
	public String modelExecution(CodeFirstModel model) {
		System.out.println("=== In the Simple Execute Method ===");
		System.out.println("    Pass-in model is: " + model.toString());
		String str = model.execute();
		return str;
	}
	
	@WebMethod (exclude=true)
	public void otherMethod() {
		System.out.println("=== In the Other Method ===");
	}
}
