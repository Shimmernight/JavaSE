package javaSE.oop.Demo;

public class Demo {

    public static void main(String[] args) {

        Pet dog = new Pet();
        dog.name = "旺财";
        dog.age = 1;
        dog.shot();

        System.out.println(dog.name);
        System.out.println(dog.age);

    }
}
