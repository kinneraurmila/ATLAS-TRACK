package ProtoTypeDP;


public class Main {
    public static void main(String[] args) {


        Book baseBook = new Book("DesignPatterns", "Krish", "Standard edition");
        System.out.println("Book :" + baseBook);
//clone for student copy
        Book student = baseBook.clone();
        student.setTitle("Students edition");
        student.setAuthor("Siri");
        student.setCategory("paperbook");
        System.out.println("Student Book :" + student);

        //clone for digital copy

        Book digital=baseBook.clone();
        digital.setTitle("Digital Edition");
        digital.setAuthor("KK");
        digital.setCategory("Digital version");
        System.out.println("This book :" + digital);
    }
}
