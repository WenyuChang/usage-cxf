package wenyu.learning;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.cxf.transport.servlet.CXFServlet;

@SuppressWarnings("serial")
public class MyServlet extends CXFServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Request handled by " + this.getClass().getSimpleName());
		try {
			String url = request.getRequestURI();
			System.out.println("Request URL: " + url);
			
			super.doPost(request, response);
			
		} catch (ServletException ex) {
			System.out.println("A ServletException has been thrown:\n" + ex);
		}
		System.out.println("Done with request handling in POST!");
	}
}