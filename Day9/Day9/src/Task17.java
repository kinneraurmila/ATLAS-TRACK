
class OuterClas {
    int a = 10;
    static class inClas{
        int b = 8;
    }
}

public class Task17 {
    public static void main(String[] args) {
        OuterClas myOuter = new OuterClas();
       // OuterClas.inClas myInner = myOuter.new inClas();
        System.out.println( myOuter.a);
        //System.out.println(myInner.a + myOuter.b);

    }
}


