package day17Class_Object;

public class dog {
    public String name;
public String breed;
public String size;
public int age;
public char gender;
public String color;

public void eat(){

    System.out.println(name+ " is eating dog food");
}
public void sleep(){

    System.out.println(name + " is drinking water");
}

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                '}';
    }


}
