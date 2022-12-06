package day10;
import java.util.Scanner;
public class ShippingAddress {
    public static void main(String[] args) {

      Scanner input=new Scanner(System.in) ;
        System.out.println("Enter yoiur full name: ");
        String fullnsme=input.nextLine();
        System.out.println("Enter building number: ");
        String building_number=input.nextLine();

        System.out.println("Enter Street name: ");
        String streetName=input.nextLine();

        System.out.println("Enter city name: ");
        String cityname=input.nextLine();

        System.out.println("Enter state : ");
        String stateName=input.nextLine();

        System.out.println("Enter zipcode : ");
        String zipcode=input.nextLine();

        System.out.println("Your shipping address is:");
      System.out.println("\t"+fullnsme);
      System.out.println("\t"+building_number+" "+streetName);
      System.out.println("\t"+cityname+","+stateName+" "+zipcode);

      input.close();




    }
}
