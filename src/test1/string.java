package test1;
import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class string {
	public static void main (String [] args) {
		String[] words =  "This is interview question".split(" ");

		/**
		 * String rev = "";
		 * for(int i = words.length - 1; i >= 0 ; i--)
		{
		   rev += words[i] + " ";
		}
		 */
		

		//rev = "question interview is This "

		/*
		 * //can also use StringBuilder: StringBuilder revb = new StringBuilder();
		 * for(int i = words.length - 1; i >= 0 ; i--) { revb.append(words[i]);
		 * revb.append(" "); } System.out.println (revb.toString());
		 */
		
		String sentence = "This is interview question";
		
		ArrayUtils.reverse(words);
		String reversedSentence = StringUtils.join(words, " ");
		System.out.println (reversedSentence);
	}
	
	
	

}
