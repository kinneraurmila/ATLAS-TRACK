import java.util.ArrayList;
import java.util.List;

class Animal1 {
    void sound() {
        System.out.println(" sounds of different animals");
    }
    void printList(List<?>  list) {
        for(Object variables: list) {
            System.out.println(variables);
        }
    }

}
class Cat1 extends Animal1{
    @Override
    void sound() {
        System.out.println(" Meow is the sound of cat");
    }

}
class Task2{
    public static void main(String[] args) {
        List<Cat1> list = new ArrayList<>();

        list.add(new Cat1());
        list.add(new Cat1());

        Animal1 obj = new Cat1();
        obj.sound(); //Meow is the sound of cat
        obj.printList(list);
    }
}
