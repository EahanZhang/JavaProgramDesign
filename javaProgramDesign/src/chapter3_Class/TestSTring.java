package chapter3_Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestSTring {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//String str1 = "Hello World";
		//String str2;
		//System.out.println();
		
		String[] nameArray = {
				"first name", 
				"last name"
				};
		String name = "";
		BufferedReader stdin = 
				new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println("Enter your " + nameArray[i] + " :");
			name += stdin.readLine();
			name += " ";
		}
		
		System.out.println("Your name is " + name + ".");
	}

}
