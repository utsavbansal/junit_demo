package junit_demo;

import java.util.ArrayList;
import java.util.List;

public class junit_example {
	  private List<String> students = new ArrayList<String>(); 
	  
	  public void remove(String name) {  
	        students.remove(name);  
	    }  
	      
	    public void add(String name) {  
	        students.add(name);  
	    }  
	      
	    public void removeAll(){  
	        students.clear();  
	    }  
	      
	    public int sizeOfStudent() {  
	        return students.size();  
	    }  
	  
}
