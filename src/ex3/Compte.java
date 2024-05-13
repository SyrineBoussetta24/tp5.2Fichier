package ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Compte {
	public static void main(String[] args) throws IOException {
        String filePath = "C:\\DSI23 PART2\\SEM 2\\JAVA\\tp5_2fichier\\in.txt";
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        int lines = 0;
        int words = 0;
        int characters = 0;
        String line;

        while ((line = reader.readLine()) != null) {
            lines++;
            characters += line.length();
            words += new StringTokenizer(line).countTokens();
        }

        reader.close();

        System.out.println("Nombre de lignes : " + lines);
        System.out.println("Nombre de mots : " + words);
        System.out.println("Nombre de caractères : " + characters);
    }
}
