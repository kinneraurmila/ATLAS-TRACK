package BuilderDP;

public class Main {
    public static void main(String[] args){
        Sandwich sandwich=new SandwichBuilder()
                .setSize(12)
                .setCheese("morzilla")
                .setPepper("black")
                .build();
        System.out.println(sandwich);
    }
}
