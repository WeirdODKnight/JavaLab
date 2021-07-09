package com.craft.knowledges.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputOutputClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String fileinputName = "C:\\Users\\Dj\\Desktop\\file\\input.txt";
		String fileinputName = "/home/weirdo/Music/JavaFile/JavaFile/a.txt";
		//FileInputStream input = new FileInputStream("/home/weirdo/Music/JavaFile/JavaFile/a.txt");
		
	//	FileOutputStream output = new FileOutputStream("/home/weirdo/Music/JavaFile/JavaFile/b.txt");
		
//		String fileoutputName = "C:\\Users\\Dj\\Desktop\\file\\output.txt";
		try {
			//FileReader fr= new FileReader("C:\\Users\\Dj\\Desktop\\file\\input.txt");
              FileReader fr = new FileReader("/home/weirdo/Music/JavaFile/JavaFile/a.txt");
			BufferedReader br = new BufferedReader(fr);

			
			String line;
			while((line= br.readLine()) != null) {
				System.out.println(line);

			}
			br.close();
		}
		catch(IOException e) {
			System.out.println("Error while reading from a file: " + e.getMessage());
		}
		
	}

}
