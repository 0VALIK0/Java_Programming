package day12CustomMethods;
import java.util.Scanner;
public class TripCalculator {
    public static void main(String[] args) {

      Scanner input=new Scanner(System.in);
        System.out.println("Split or Not split?(Yes or No");
        String yesNo= input.next().toLowerCase();
        System.out.println("Enter the number of people: ");
        int numberOfPeople= input.nextInt();

        System.out.println("Enter the check amount: ");
        double amount= input.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/good/Fair/Poor");
        String service= input.next().toLowerCase();









    }
}
