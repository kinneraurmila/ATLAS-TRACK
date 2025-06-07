public class Para {
    void add(int x, int y) {
        System.out.println("Values of x & y" + x + y);
    }
    void add(int x, int y ,int z){
        System.out.println("Values of x&y&z :" + x + "" + y +"" + z + "");
    }
    public static void main(String[] args){
        Para obj =new Para();
        obj.add (2,4);
        obj.add(4,6,8);

    }
}
