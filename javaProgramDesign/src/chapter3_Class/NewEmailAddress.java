package chapter3_Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewEmailAddress {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader newin =				//输入流 
				new BufferedReader(new InputStreamReader(System.in));
		
		//提示用户输入信息
		System.out.println("Email Address Harvester");
		System.out.println("Input line: ");
		String string = newin.readLine();
		
		int at_location = string.indexOf("@", 0);
		String stringBeforeAt = string.substring(0, at_location);
		String stringAfterAt = string.substring(at_location + 1, string.length());
		int space_before_at = stringBeforeAt.lastIndexOf(" ");
		int space_after_at = stringAfterAt.indexOf(" ");
		System.out.println(space_before_at + " " + space_after_at);
		System.out.println(stringBeforeAt);
		String emailAddress = string.substring(
				space_before_at + 1, 
				at_location + space_after_at + 2);
		
		System.out.println("Extracted email address: " + emailAddress);
	}

}
