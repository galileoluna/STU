package servicios;

import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;


public class Discovery {
	private static String fromFileToClassName(final String fileName) {
		return fileName.substring(0, fileName.length() - 6).replaceAll("/|\\\\", "\\.");
	}

	
	private static List<Class> findDataBases(File path) {
		List<Class> classes = new ArrayList<Class>();
	

		try {
			if (path.canRead()) {
				JarFile jar = new JarFile(path);
				Enumeration<JarEntry> en = jar.entries();
				while (en.hasMoreElements()) {
					JarEntry entry = en.nextElement();
					if (entry.getName().endsWith("class")) {
						String className = fromFileToClassName(entry.getName());
						Class claz = Class.forName(className);
						classes.add(claz);
					}
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("Failed to read classes from jar file: " + path, e);
		}

		return classes;
	}
	
	public static void main (String [ ] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException { 
		File f = new File("C:\\Users\\Galileo\\eclipse-workspace\\SiTU\\services\\MongoProyect.jar");
		
		Class conexion =findDataBases(f).get(0);
		
		System.out.println(findDataBases(f).size());
}
}

