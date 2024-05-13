package ex1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCopy {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("C:\\DSI23 PART2\\SEM 2\\JAVA\\tp5_2fichier\\in.txt");
		File outputFile = new File("C:\\DSI23 PART2\\SEM 2\\JAVA\\tp5_2fichier\\out.txt");
        FileReader reader = new FileReader(inputFile);
        FileWriter writer = new FileWriter(outputFile);

        int byt;
        while ((byt = reader.read()) != -1) {
        	writer.write(byt);
        	System.out.println((char)byt);
        }

        reader.close();
        writer.close();
	}

}
