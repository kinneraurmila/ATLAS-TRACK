class Student {
    public int roll_no = 10;
    //private int roll_no = 10; // this code breaks...
    public int getRoll() {
        System.out.println("getRoll method");
        return roll_no;
    }
    public void setRoll(int roll) {
        if(!(roll > 100))
            roll_no = roll;

    }
}
class Task5 {
    public static void main(String[] args) {
        Student sobj = new Student();
        sobj.roll_no = 10; // we are not following the rule of Student class roll no > 100..
        //sobj.roll_no = 110;
        System.out.println("the roll no of student is "+ sobj.roll_no); // 110 // private - error //10
    }
}

