package com.mridani.training.firstMaven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        int summ = sum(3,3);
        
        System.out.println("sum: "+summ);
    }
    
    public static int sum ( int a, int b){
    	return a+b;
    }
}
