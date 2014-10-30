package wenyu.learning.RESTful.Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import wenyu.learning.Model.CodeFirstModel;

// If @Path is set, it will add the value 
// to the url after address value which is 
// set in the spring configuration
// @Path("/restfulService")
@Produces("application/xml")
public class RestfulServiceImpl implements IRestfulService {

	@GET
	@Path("/simpleExecute/")
	@Consumes("application/xml")
	public void simpleExecute() {
		System.out.println("RESTful Service method [simpleExecute] invoke.");
	}
	
	@GET
	@Path("/simpleExecute/{url_str}/")
	@Consumes("application/xml")
	public String simpleExecute(@PathParam("url_str") String str) {
		System.out.println("RESTful Service method [simpleExecute] invoke.");
		System.out.println("String from url: " + str);
		return str;
	}
	
	@GET
	@Path("/modelExecution/")
	@Consumes("application/xml")
	public String modelExecution() {
		CodeFirstModel model = new CodeFirstModel();
		System.out.println("RESTful Service Method [executeModel] invoke.");
		System.out.println(model.toString());
		
		return model.execute();
	}
	
	@POST
	@Path("/modelExecutionPost/")
	@Consumes("application/xml")
	public String modelExecution(CodeFirstModel model) {
		System.out.println("RESTful Service Method [executeModel] invoke.");
		System.out.println(model.toString());
		
		return model.execute();
	}
//
//	@GET
//	@Path("/returnModel/{id}/{name}")
//	public MyModel returnModel(@PathParam("id") String id, @PathParam("name") String name) {
//		System.out.println("RESTful Service Method [returnModel] invoke.");
//		MyModel model = new MyModel();
//		model.modelId = id;
//		model.modelName = name;
//		System.out.println(executeModel(model));
//		return model;
//	}
	
	

}
