import java.util.LinkedList;
public class Task7 {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.add(" hi ");
        list.add(" hlo ");
        list.add(" hwr ");
        list.add(" hope good");
        list.add(" c u later");

        for(String name: list){
            System.out.print( name);
        }
        for(int i=0;i< list.size();i++){
            System.out.println("list: " + list.get(i));
        }

    }
}
