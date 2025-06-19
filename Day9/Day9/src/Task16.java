class OutClass {
    int x = 10;
  private   class InnerClass {
        int y = 5;
    }
}

public class Task16 {
    public static void main(String[] args) {
        OuteerClass myOuter = new OuteerClass();
        OuteerClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println( myInner.y  + myOuter.x);
    }
}


