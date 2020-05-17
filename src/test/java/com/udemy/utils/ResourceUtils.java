package com.udemy.utils;

public class ResourceUtils {

	public static String getResourcePath(String fileName) {
		return getBasePath() + fileName;
	}

	public static String getBasePath() {

		String s = ResourceUtils.class.getClassLoader().getResource(".").getPath();
		System.out.println(s);
		return s;
	}

}
