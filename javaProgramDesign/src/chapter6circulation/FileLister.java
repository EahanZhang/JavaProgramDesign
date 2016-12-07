package chapter6circulation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class FileLister {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the file path: ");
		String path = bufferedReader.readLine();
		
		FileReader fileReader = new FileReader(path);
		
		BufferedReader fileIn = new BufferedReader(fileReader);
		String currentLine = fileIn.readLine();
		
		while (currentLine != null) {
			System.out.println(currentLine);
			currentLine = fileIn.readLine();
		}
		
		//关闭文件流
		fileIn.close();
	}

}
