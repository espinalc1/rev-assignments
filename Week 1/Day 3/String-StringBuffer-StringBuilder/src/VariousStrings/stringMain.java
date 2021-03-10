package VariousStrings;

import java.util.Arrays;
import java.util.Scanner;

//Assignments - String,StringBuffer,StringBuilder
//1)Take a sentence as input and convert all the last chars to upper case of every word
//2)Take a sentence as input and for the word with length odd convert the middle character to uppercase and for the word length even convert the
//first character to uppercase.
//3)Take a sentence as input and print the word with maximum letters and also print the word with minimum letters.

public class stringMain {
	public static void main(String[] args) {
		// VinayStringBufferDemo.showResults();

		System.out.println("Type in a sentence:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();

		String[] wordsArray = s.split(" ");

		// Assignment 1
		System.out.println("\n\nHere, we'll convert the last characters of each word to uppercase:");
		for (String word : wordsArray) {
			StringBuffer wBuffer = new StringBuffer(word.substring(0, word.length() - 1));
			wBuffer.append(("" + word.charAt(word.length() - 1)).toUpperCase());
			System.out.println(wBuffer);
		}
		System.out.println("\n\nHere, we'll convert the first character of words with an even length to uppercase"
				+ " and the middle character to uppercase for words with an odd number of characters!");
		// Assignment 2
		for (String word : wordsArray) {
			StringBuilder wBuilder = new StringBuilder(word);
			if (word.length() % 2 == 0) {
				StringBuilder firstLet = new StringBuilder(("" + word.charAt(0)).toUpperCase());
				System.out.println("Even Word : " + firstLet.append(wBuilder.substring(1, wBuilder.length())));
			} else {
				int midIndex = word.length() / 2;
				String midChar = ("" + word.charAt(midIndex)).toUpperCase();
				wBuilder.replace(midIndex, midIndex + 1, midChar);
				System.out.println("Odd Word : " + midIndex + " " + wBuilder);
			}
		}

		// Assignment 3
		System.out.println("\n\nHere, we'll print the words with the maximum and minimum number of characters");
		int longestLen = Integer.MIN_VALUE;
		int shortestLen = Integer.MAX_VALUE;
		
		// find the largest and smallest lengths
		for (String word : wordsArray) {
			if (word.length() > longestLen) {
				longestLen = word.length();
			} 
			
			if (word.length() < shortestLen) {
				shortestLen = word.length();
			}
		}
		
		// find the longest and shortest words
		String[] shortestWords = new String[wordsArray.length];
		String[] longestWords = new String[wordsArray.length];
		int count = 0;
		
		for (String word : wordsArray) {
			if (word.length() == shortestLen) {
				shortestWords[count] = word;
				count++;
			} else if (word.length() == longestLen) {
				longestWords[count] = word;
				count++;
			}
		}
		
		System.out.println("The following are the longest words: ");
		for (String word: longestWords) {
			if (word != "" && word != null) {
				System.out.println(word);
			}
		}
		
		System.out.println("The following are the shortest words: ");
		for (String word: shortestWords) {
			if (word != "" && word != null) {
				System.out.println(word);
			}
		}

		/*
		*/

	}
}
