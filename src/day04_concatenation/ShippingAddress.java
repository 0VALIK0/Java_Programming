package day04_concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        String name="\tAaron Kissinger\n";
        String buildingNumber= "\t13621A";
        String streetName = " Legacy Circle\n";
        String city="\tFairfax, ";
        String state= "VA ";
        String zipcode= "22030";
        String fullshippingaddress=(name+buildingNumber+streetName+city+state+zipcode);
        System.out.println("Your Shipping address is:\n"+fullshippingaddress);


    }


}
