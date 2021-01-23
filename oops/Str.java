package oops;

import java.util.Scanner;
public class Str {
	
	
	//user input the string
	void userinput() {
		Scanner z = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = z.next();
		System.out.println(s);
	}
	
	
	//finding the character
	void finding() {
		String s = "Umberlla";
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='e') {
				System.out.println(i+"the character is"+s.charAt(i));
			}
		}
	}
	
	
	//to check the word e is in umberlla
	void checking() {
		String s = "Umberlla";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='e') {
				System.out.println("found");
			}
			else {
				System.out.println("Not found");
			}
		}
	}
	
	
	//checking the word in the sentence
	void wordcheck() {
		String s = "This is a word";
		if(s.contains("word")) {
			System.out.println("true");
		}
		else {
			System.out.println("Not found");
		}
	}
	
	
	//Print the name ex P.R.lastword
	void nameacronym() {
		String name = "Robert Jonn Britto";
		String A = ""+name.charAt(0)+".";
		for(int i=0; i<name.length(); i++) {
			if((name.charAt(i)==' ')&&(name.charAt(i+1)!=' ')&&(i+1<name.length())) {
				A = (A+name.charAt(i+1)).toUpperCase()+".";
			}
		}
		//last word
		String B = "";
		for(int j=name.length()-1; j>=0; j--) {
			if(name.charAt(j)==' ') {
				B = name.substring(j+1);
				break;
			}
		}
		//to remove last dot
		A = A.substring(0,A.length()-2);
		A = A+B;
		System.out.println(A);	
	}
	
	
	//find the number of vowels
	String findvowels() {
		int vowels=0,consonants=0,numbers=0,spaces=0,symbols=0;
		String s = "This is Premganesh form Ece department";
		s = s.toLowerCase();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == 'a' || ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				++vowels;
			}
			else if(ch>='a'&&ch<='z') {
				++consonants;
			}
			else if(ch>='0'&&ch<='9') {
				++numbers;
			}
			else if(ch==' ') {
				++spaces;
			}
			else {
				++symbols;
			}
		}
		System.out.println(s);
		System.out.println("vowels = "+vowels);
		System.out.println("consonants = "+consonants);
		System.out.println("numbers = "+numbers);
		System.out.println("spaces = "+spaces);
		System.out.println("symbols = "+symbols);
		return s;
	}
}










































