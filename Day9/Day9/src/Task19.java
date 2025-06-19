
class OutrClass {
    int x = 10;

    static class InnClass {
        static int y = 5;
    }
}

public class Task19 {
    public static void main(String[] args) {
        OutrClass.InnClass myInner = new OutrClass.InnClass();
        System.out.println(myInner.y);

    }
}


