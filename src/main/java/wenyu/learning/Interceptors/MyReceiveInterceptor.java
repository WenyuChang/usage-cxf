package wenyu.learning.Interceptors;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

public class MyReceiveInterceptor extends AbstractPhaseInterceptor<Message> {

	public MyReceiveInterceptor() {
		super(Phase.RECEIVE);
	}
	
	public void handleMessage(Message message) throws Fault {
		System.out.println("=================Phase: RECEIVE (" + this.getId() + ")=================");
		
		// List all the interceptors before this one
		System.out.print("Before Interceptor Ids: [");
		Iterator<String> ids = this.getAfter().iterator();
		String idStr = "";
		while(ids.hasNext()) {
			idStr += ids.next() + ",";
		}
		if(idStr.length()>0) {
			System.out.println(idStr.substring(0,	idStr.length()-1) + "]");
		} else {
			System.out.println("]");
		}
		
		// List all the interceptors after this one
		System.out.print("After Interceptor Ids: [");
		ids = this.getBefore().iterator();
		idStr = "";
		while(ids.hasNext()) {
			idStr += ids.next() + ",";
		}
		if(idStr.length()>0) {
			System.out.println(idStr.substring(0,	idStr.length()-1) + "]");
		} else {
			System.out.println("]");
		}
		
		// List all content in the Message
		Set<Entry<String, Object>> values = message.entrySet();
		Iterator<Entry<String, Object>> iter = values.iterator();
		while(iter.hasNext()) {
			Entry<String, Object> value = (Entry<String, Object>) iter.next();
			String key = value.getKey();
			Object val = value.getValue();
			if(val!=null) {
				System.out.println(key + ": " + val.toString());
			} else {
				System.out.println(key + ": null");
			}
		}
		System.out.println("================================================");
		
	}

}
