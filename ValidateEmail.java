package com.simplilearn.emailid;

import java.util.regex.Matcher;

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ValidateEmail {
	public static void main(String[] args) {
		ArrayList <String> email = new ArrayList<>();
		email.add("pavithra12@gmail.com");
		email.add("nandu1891@gmail.com");
		email.add("sivesh45@gmail.com");
		email.add("sivesh@gmail.com");
		email.add("pavinandu@gmail.com");
		email.add("tar-ru@gmail.com");
		email.add("nandu_pavi@gmail.com");
		email.add("123-pavithra@gmail.com");
		
		Scanner sc= new Scanner(System.in);
		
			String regex=("[a-zA-Z0-9-_]*@+[gmail].+[com]");
		
	
	Pattern pattern = Pattern.compile(regex);
	System.out.println("Enter the EmailId :");
	
            String input=sc.next();
		Matcher matcher = pattern.matcher(input);
		if(matcher.matches())
			System.out.println("User Entered Valid Email Id");
		else
			System.out.println("invalid email");

if(input.equals(matcher)==email.contains(1))
{
	System.out.println("User Entered Email-Id is in  "+email.lastIndexOf(input)+"  position of array");
}
else if(input.equals(matcher)!=email.contains(0))
{
	System.out.println("Email-Id is not Entered in the Array");	
}
else {
	System.out.println("Email-Id is not Entered in the Array");
}
}
}