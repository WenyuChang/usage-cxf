package wenyu.learning.Mocks;

import javax.xml.ws.Endpoint;

public class MockSOAPServer{

	private Thread codeFirstServiceServer = new Thread() {
		@Override
		public void run() {
			System.out.println("============== Starting Server ==============");
			String address = "http://localhost:8080/CodeFirst/ISOAPService";
			wenyu.learning.SOAP.Service.CodeFirst.ISOAPService service = new wenyu.learning.SOAP.Service.CodeFirst.SOAPServiceImpl();
			Endpoint.publish(address, service);
		}
	};
	
	public static void main(String[] args) throws Exception {
		MockSOAPServer servers = new MockSOAPServer();
		
		servers.codeFirstServiceServer.setDaemon(true);
		servers.codeFirstServiceServer.start();
		servers.codeFirstServiceServer.join();
	}

}
