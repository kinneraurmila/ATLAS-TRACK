public class Task32 extends My_Cal {

    public void Division(int x, int y) {
        z = x / y;
        System.out.println("Division :" + z);
    }

    public static void main(String[] args) {
        int x = 5, y = 2;
        Task32 obj = new Task32();
        obj.addition(x, y);
        obj.subtraction(x, y);
        obj.multiplication(x, y);
        obj.Division(x, y);
    }
}
