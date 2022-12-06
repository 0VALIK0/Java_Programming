package day08;

public class Elevator {
    public static void main(String[] args) {




        int floorNumber = 2;
        String result="Invalid Floor";

        if (floorNumber>=1 && floorNumber<=3){
            result= "Floor "+floorNumber+" is selected Companies: ";
            if (floorNumber==1){
               result+="Lobby,Verizon,Starbucks";
            } else if (floorNumber==2) {
                result+="Cydeo,NASA,Intelsat";

            } else {
               result+="Lyft,Bofa,Stake House";

            }

            System.out.println(result);


        }


    }
}
