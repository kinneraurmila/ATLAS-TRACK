
class OutClas{
    int x = 50;
    class  InClass {
        public int innerMethod() {
            return x;
        }
    }
}

public class Task18 {
    public static void main(String[] args){
        OutClas myOuter = new OutClas();
        OutClas.InClass myInner = myOuter.new InClass();
        System.out.println(myInner.innerMethod());
    }
}


