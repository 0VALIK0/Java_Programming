package day16continueLoop;

public class FrequencyOftehWord {
    public static void main(String[] args) {
        String sent= "java JAVA jAvA JAva";//JAVA jAvA JAva
        String word="Java";

         sent=sent.toLowerCase();
         word = word.toLowerCase();

        int count= 0;

        while (sent.contains("java")){
            count++;
            sent= sent.replaceFirst("java", "");

        }
        System.out.println(count);

    }
}
