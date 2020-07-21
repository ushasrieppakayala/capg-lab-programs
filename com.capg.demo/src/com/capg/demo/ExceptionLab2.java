<<<<<<< HEAD
package com.capg.demo;

import java.util.Scanner;

public class ExceptionLab2 {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter age:");
			int age=sc.nextInt();
			try {
			if(age<15)
			   throw new AgeException("age should be above 15");
			System.out.println("Age is:"+age);
			
			}
			catch(AgeException e) {
			System.out.println(e);
			}


	}

}
=======
package com.capg.demo;

import java.util.Scanner;

public class ExceptionLab2 {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter age:");
			int age=sc.nextInt();
			try {
			if(age<15)
			   throw new AgeException("age should be above 15");
			System.out.println("Age is:"+age);
			
			}
			catch(AgeException e) {
			System.out.println(e);
			}


	}

}
>>>>>>> branch 'master' of https://github.com/ushasrieppakayala/capg-lab-programs.git
