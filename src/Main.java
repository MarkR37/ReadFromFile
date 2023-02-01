import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        readFileWithScanner();
        printString();
    }
    private static void readFileWithScanner() throws FileNotFoundException {
        File file = new File("C:\\Users\\Mark\\IdeaProjects\\ReadFromFile\\src\\readFile.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }

    private static String readFileAsString(String fileName) throws IOException {
        String data= "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    private static void printString() throws IOException {
        String data = readFileAsString("C:\\Users\\Mark\\IdeaProjects\\ReadFromFile\\src\\wafflesAreKing.txt");
        System.out.println(data);
    }
}