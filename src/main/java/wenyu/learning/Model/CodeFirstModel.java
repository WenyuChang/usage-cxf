package wenyu.learning.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CodeFirstModel {
	public String modelName;
	public String modelId;
	
	@Override
	public String toString() {
		String str = "";
		str += "Model Class Name:" + this.getClass().getSimpleName() + "\n";
		str += "Model Instance Name: " + modelName + "\n";
		str += "Model Instance Id: " + modelId + "\n";
		
		return str;
	}
	
	public String execute() {
		String str = "";
		str += "Model(:" + this.hashCode() + ")" + this.getClass().getSimpleName();
		str += " [" + modelName + "/" + modelId + "]"; 
		return str;
	}
}
