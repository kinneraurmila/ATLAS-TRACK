import javax.swing.plaf.synth.SynthOptionPaneUI;
enum Color{
    red,whiTE,YELLOW,BLACK
}
public class Task16 {
    public static void main(String[] args){
        System.out.println("Available colors: ");
       /* for (Color c: Color.values()){
            System.out.println(c);
        } */
        Color c= Color.YELLOW;
        System.out.println(c);
    }
}
