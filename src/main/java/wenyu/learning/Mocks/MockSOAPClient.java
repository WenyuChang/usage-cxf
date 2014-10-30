package wenyu.learning.Mocks;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * CXF provides an alternate way to build a 
 * web service client dynamically. It delivers 
 * the concept of dynamic client through the 
 * use of the JaxWsDynamicClientFactory 
 * factory class. CXF also provides a non JAX-WS 
 * class named DynamicClientFactory. This is 
 * useful if your service component is developed 
 * using any non JAX-WS API.
 */
public class MockSOAPClient {
	
	public void SOAPClient(String wsdlPath, String operationName, Object ...args) {
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
		Client client = dcf.createClient(wsdlPath);
		Object[] response = null;
		try {
			response = client.invoke(operationName, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int i=0;
		for(Object obj : response) {
			System.out.println("Response[" + ++i + "]: " + obj.toString());
		}
	}
	
	public static void main(String[] args) {
		MockSOAPClient client = new MockSOAPClient();
		
		String wsdlPath = "http://localhost:8080/CXFLearning/soapService?wsdl";
		String operationName = "simpleExecute";
		
		client.SOAPClient(wsdlPath, operationName);
	}

}
