import java.util.ArrayList;
import java.util.List;

class Animal3 {
    void sound() {
        System.out.println(" sounds of different animals");
    }
}

class Cat3 extends Animal3{
    @Override
    void sound() {
        System.out.println(" Meow is the sound of cat");
    }
    void addAcat(List<? super Cat3> cats) {
        cats.add(new Cat3());
    }

}
public class Task4 {

    public static void main(String[] args) {
        List<Animal3> animals = new ArrayList<>();
        Cat3 c=new Cat3();
       c.addAcat(animals);


    }
}


