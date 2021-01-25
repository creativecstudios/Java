package oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Str {
	
	
	//user input the string
	public void userinput() {
		Scanner z = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = z.next();
		System.out.println(s);
	}
	
	//to check the word e is in umbrella
	public void checking() {
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
	public void wordcheck() {
		String s = "This is a word";
		if(s.contains("word")) {
			System.out.println("true");
		}
		else {
			System.out.println("Not found");
		}
	}
	
	
	//Print the name ex P.R.lastword
	public void nameacronym() {
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
	public String findvowels() {
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
	
	
	//Palindrome
	public void palindrome() {
		String s = "Madam";
		StringBuffer sb = new StringBuffer(s);
		sb = sb.reverse();
		String T = sb.toString();
		if(s.equalsIgnoreCase(T)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

	
	//Finding Largest and Smallest word in the string
	public String LargeSmall() {
		String s = "A set of words that is complete is itself";
		s = s.toLowerCase()+" ";
		
		String word="";
		String[] words = new String[100];
		int length=0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				word = word+s.charAt(i);
			}
			else {
				words[length] = word;
				length++;
				word ="";
			}
		}
		
		String small="",large="";
		small = large = words[0];
		
		for(int j=0; j<length; j++) {
			if(small.length()>words[j].length()) {
				small = words[j];
			}
			if(large.length()<words[j].length()) {
				large = words[j];
			}
		}
		System.out.println(s);
		System.out.println("Smallest  "+small);
		System.out.println("Largest word  "+large);
		return s;
	}
	
	
	//array ascending order
	void array() {
		String arr[] = {"prem","kumar","ranjith"};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));	
	}
	
	//palindrome replaces *
	void palindromestar() {
		String s = "madam how are you what about radar.";
		s = s+" ";
		String rev="";
		String word ="";
		String array[] = new String[100];
		int length=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				word = word+s.charAt(i);
			}
			else
			{
				array[length] = word;
				length++;
				StringBuffer obj = new StringBuffer(word);
				obj.reverse();
				rev = obj.toString();
				if(rev.equalsIgnoreCase(word)) {
					for(int j=0; j<rev.length(); j++) {
						System.out.print("*");
					}
					System.out.print(" ");
				}
				else {
					System.out.print(word+" ");
				}
				word = "";
			}
			
		}
	}

	//replace string
	void replacing() {
		String s = "A batman with ball";
		if(s.contains("ball"))
		{
			s.replaceAll("ball", "bat");
		}
		
	}
}










































