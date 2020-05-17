package com.udemy.LearnCucumber;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( App.class.getClassLoader().getResource(".").getPath());
        
        
        System.out.println(System.getProperty("user.dir"));
    }
}
