package wenyu.learning.Mocks;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;

import wenyu.learning.RESTful.Service.IRestfulService;

/**
 * JAX-RS doesn't provide a standard 
 * approach for creating RESTful clients. 
 * The CXF framework provides two approaches 
 * for creating clients.
 *   1. Proxy-based API
 *   2. HTTP centric clients
 */

public class MockRestfulClient {
	
	public void proxyBasedClient() {
		// Failed...
		IRestfulService service = JAXRSClientFactory.create("http://localhost:8080/CXFLearning", IRestfulService.class);
		service.simpleExecute();
	}
	
	public void webClient() {
		WebClient client = WebClient.create("http://localhost:8080/CXFLearning/");
		String str = client.path("restfulService/simpleExecute/").path("123456/").accept("application/xml").get(String.class);
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		MockRestfulClient client = new MockRestfulClient();
		
		client.proxyBasedClient();
		//client.webClient();
		
//		MyModel model = new MyModel();
//		model.modelName = "MyFirstModel";
//		model.modelId = UUID.randomUUID().toString();
//		
//		WebClient client = WebClient.create("http://localhost:8080/CXFLearning/myRestfulService");
//		client.path("executeModel1").accept("application/xml").post(model);
	}
}
