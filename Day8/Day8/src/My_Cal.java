
    public class My_Cal extends Calculation31 {
        public void multiplication(int x,int y){
            z = x*y;
            System.out.println("Multiplication :" + z );
        }
        public static void main(String[] args){
            int x=5,y=2;
            My_Cal obj = new My_Cal();
            obj.addition(x,y);
            obj.subtraction(x,y);
            obj.multiplication(x,y);
        }
    }
