package com.udemy.classLoader;

import java.net.URL;
import java.nio.file.Paths;

public class getAbsPath {

	
	public static void main(String[] args) {
		
		
		Class cls=getAbsPath.class;
		ClassLoader cL=cls.getClassLoader();
		URL url=cL.getResource(".");
		System.out.println(url.toString());
		System.out.println(cls.getResource("getAbsPath.class").getPath());
		
	System.out.println(Paths.get("src","test","resources"));
		
		
	}
	
	
}
