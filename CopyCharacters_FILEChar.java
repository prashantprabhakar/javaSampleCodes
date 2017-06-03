package main.java.com.gemini.training;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;

public class CopyCharacters_FILEChar {
    public static void main(String[] args) throws IOException{

        FileReader inputStream = null;
        FileWriter outputStream = null;

        Path p = Paths.get("src/com/gemini/training/input.txt");
        File file = new File("src/com/gemini/training/input.txt");
        System.out.println(p.getNameCount()+" : "+p.getFileName()+" ::: "+p.toAbsolutePath());
        try {
            inputStream = new FileReader("src/main/java/com/gemini/training/input.txt");
            outputStream = new FileWriter("src/main/java/com/gemini/training/output.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
        
        readerExample("src/main/java/com/gemini/training/input.txt");
    }
    
    
    public static void readerExample(String filepath) {
    	try {
			BufferedReader br = new BufferedReader(new FileReader(new File(filepath)));
			String line ="";
			while((line = br.readLine()) != null){
				System.out.println("Line:::"+line);
				StringTokenizer st = new StringTokenizer(line);
				
				while(st.hasMoreTokens()){
					System.out.println("Token::"+st.nextToken());
				}
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}