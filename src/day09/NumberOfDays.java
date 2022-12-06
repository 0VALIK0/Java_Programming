package day09;

public class NumberOfDays {
    public static void main(String[] args) {

        int months=12;
        String result="";

        switch (months){
            case 2:
                result= "28 dsyd'";
                break;
            case 1:case 3:case 5:case 7:case 8:  case 10:case 12:
                result="31 days";
                break;
            case 4: case 6: case 9: case 11:
            result="30 days";
            break;
            default:
                result="Invalid Month'";


        }
        System.out.println(result);


    }

}
