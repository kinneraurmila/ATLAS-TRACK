class OuteerClass {
        int x = 10;
        class InnerClass {
            int y = 5;
        }
    }

    public class Task15 {
        public static void main(String[] args) {
            OuteerClass myOuter = new OuteerClass();
            OuteerClass.InnerClass myInner = myOuter.new InnerClass();
            System.out.println(myInner.y + myOuter.x);
        }
    }

