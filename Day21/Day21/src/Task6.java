
class Student1 {
    private int roll_no = 0;
    public int getRoll() {
        System.out.println("getRoll method");
        return roll_no;
    }
    public void setRoll(int roll) {
        if(!(roll > 100))
        roll_no = roll;
    }
}
class Task6 {
    public static void main(String[] args) {
        Student1 sobj = new Student1();// Person pobj = new Student(); // person got a bonus
        sobj.setRoll(10);
        System.out.println("the roll no of student is "+ sobj.getRoll());
    }
}

