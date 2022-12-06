package day16continueLoop;

public class Frequencyy_of_character {
    public static void main(String[] args) {

        String str ="acbacbc";
        char ch='c';

        int count=0;

        for (int i = 0; i <str.length(); i++) {//index number of string str
            if (str.charAt(i)==ch){//if the character of the string is equal to given character,it means the given character is in the string.
                count++;
            }
        }
        System.out.println(count);
    }
}
