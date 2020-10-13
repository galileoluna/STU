package servicios;

import java.io.File;
import java.util.HashSet;
import java.util.Set;


public class Discovery {
	public interface SomeInterface {
	    public void someInterfaceMethod();
	}
	
	static Set<Object> findClasses(String path) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Set<Object> result = new HashSet<>();
		for (File f : new File(path).listFiles()) {
		if (!f.getName().endsWith(".class")) continue;
			Class c = Class.forName(f.getName());
		
		
		result.add(c.newInstance());
		}
		return result;
		}
	
	public static void main (String [ ] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		 
		System.out.println(findClasses("C:\\Users\\Galileo\\eclipse-workspace\\SiTU\\services\\mongo").size());
		

	}
}

