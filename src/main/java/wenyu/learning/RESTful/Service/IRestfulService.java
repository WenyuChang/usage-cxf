package wenyu.learning.RESTful.Service;

import wenyu.learning.Model.CodeFirstModel;

public interface IRestfulService {
	/**
	 * Simple execute method
	 * which will just print sth
	 */
	public void simpleExecute();
	public String simpleExecute(String str);
	
	/**
	 * Passed in a model and then excute model
	 * @param model
	 * @return model toString
	 */
	public String modelExecution();
	public String modelExecution(CodeFirstModel model);
}
