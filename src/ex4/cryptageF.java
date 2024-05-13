package ex4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class cryptageF {
	public static void main(String[] args) throws IOException {
        String sourceFile = "C:\\DSI23 PART2\\SEM 2\\JAVA\\tp5_2fichier\\in.txt";
        String destinationFile = "C:\\DSI23 PART2\\SEM 2\\JAVA\\tp5_2fichier\\out.txt";
        cryptage(sourceFile, destinationFile);
    }

    public static void cryptage(String sourcePath, String destinationPath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
        BufferedWriter writer = new BufferedWriter(new FileWriter(destinationPath));

        int character;
        while ((character = reader.read()) != -1) {
            char encryptedChar = (char) (character + 1);
            writer.write(encryptedChar);
        }

        reader.close();
        writer.close();

        System.out.println("Fichier crypté avec succès.");
    }
}
