
package com.simplilearn.session4;
 import java.util.regex.*;
 import java.util.Scanner;
public class Regex4 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String regex=("[a-z]*@+.+!+");
	System.out.println("write any statement");
	String input=sc.next();
	Pattern pattern=Pattern.compile(regex);
	Matcher matcher=pattern.matcher(input);
	if(matcher.find())
		System.out.println("statement is valid");
	else
		System.out.println("invalid statement");
	sc.close();
	
}
}
