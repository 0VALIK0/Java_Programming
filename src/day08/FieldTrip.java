package day08;

public class FieldTrip {
    public static void main(String[] args) {

      int grade =5;
      String location ="Uknown";
      int numbOfgroups =0;
      String teacher="Uknown";
      if (grade>=1 && grade<=6){
          if (grade ==1){
              location="Apple orchard";
              numbOfgroups=3;
              teacher= "Ms.Smith";
          } else if (grade==2) {
              location ="Zoo";
              numbOfgroups=7;
              teacher="Ms.Lee";
          } else if (grade==3) {
              location="Aquarium";
              numbOfgroups=5;
              teacher="M.Wilson";

          } else if (grade==4) {
              location="Movie theater";
              numbOfgroups=2;
              teacher="M.Lize";
          } else if (grade==5) {
              location="Museum";
              numbOfgroups=5;
              teacher="M.Lela";
          }else {
              location="Six Flags";
              numbOfgroups=8;
              teacher="M.Watt";
          }
      }
        System.out.println("Grade is: "+grade);
        System.out.println("Location is: "+location);
        System.out.println("Number of groups is: "+numbOfgroups);
        System.out.println("Teacher is: "+teacher);

    }
}
