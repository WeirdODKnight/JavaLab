package com.craft.knowledges.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputOutputClass3 {
	public static void main(String[] args) throws IOException{
      
            FileWriter writer = new FileWriter("MyFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
 
            bufferedWriter.write("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.write("See You Again!");
 
            bufferedWriter.close();
      
	}
    }

