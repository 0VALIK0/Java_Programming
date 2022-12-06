package day11;

public class StringMethods2 {
    public static void main(String[] args) {

        String sentence= "I like camping.usually i am camping with my friends";

        sentence=sentence.replace("camping","drinking");

        System.out.println(sentence);
        //**********


        String letter="Parashapa";
                letter=letter.replace(('a'),'u');
        System.out.println(letter);
        //****************


        String sentence4= "I love Java Programming";
        sentence4=sentence4.substring(7, 10+1);
        System.out.println(sentence4);


        //***************************
        String sentence6="I love Java Programming";
        String r1=sentence6.substring(7,sentence6.length());
        System.out.println(r1);

        //**************

        String sentence7="Today is sunday,tommorow is Monday";
        String tommorow=sentence7.substring(sentence7.lastIndexOf(' ')+1);
        System.out.println(tommorow);






    }
}
