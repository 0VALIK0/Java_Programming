package day13CustomMethods;

public class Frequency {
    public static void main(String[] args) {

        String s = "Java java jAvA python python";
        String w = "java";

        System.out.println( frequencyOfWord(s, w) );

    }

    public static int frequencyOfWord(String sentence, String word){
        sentence = sentence.toLowerCase();
        word =  word.toLowerCase();
        String temp = sentence.replace( word,  "a".repeat(word.length()-1) );

        int frequency = sentence.length() - temp.length();

        return frequency;

    }

}
