public class Task34 {
   static void add(int x, int y){
        System.out.println("Values of x & y : " + x + " " + y);
    }
    static void  add(int x, int y, int z){
        System.out.println("Values of x & y & z are :" + x + " " + y + " " + z );
    }
    public static void main(String[] args ){
        add(10,20,30);
        add(50,100);
    }
}
