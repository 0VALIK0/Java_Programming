package day17Class_Object;

public class TestDogObjects {
    public static void main(String[] args) {

dog dog1=new dog();

dog1.name="Max";
dog1.breed="Husky";
dog1.age=4;
dog1.size="Large";
dog1.color="Gray";
dog1.gender='M';

dog dog2=new dog();
        dog2.name="bella";
        dog2.breed="Jorik";
        dog2.age=6;
        dog2.size="Medium";
        dog2.color="Brown";
        dog2.gender='F';


        System.out.println(dog1);
        System.out.println(dog2);

    }
}
