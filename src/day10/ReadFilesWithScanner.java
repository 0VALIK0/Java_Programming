package day10;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
public class ReadFilesWithScanner {
    public static void main(String[] args) throws IOException {

        Scanner scan=new Scanner(Path.of("src/day10/Task.txt"));
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());







    }
}
