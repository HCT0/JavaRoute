package com.how2java.j2se;

/**
 * Hello world!
 *
 */
public class App 
{ 
	public static void main( String[] args ) throws ClassNotFoundException
{
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("初始化驱动成功");
    System.out.println( "Hello World!" );
}
}
