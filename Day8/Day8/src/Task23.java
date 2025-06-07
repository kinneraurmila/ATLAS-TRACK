class Student{
    public int roll_no;
    public String name;
    Student(int roll_no,String name){
        this.roll_no = roll_no;
        this.name =name;
    }
}
public class Task23 {
    public static void main(String[] args) {
        Student[] arr;
        arr = new Student[4];
        arr[0] = new Student(1, "kk");
        arr[1] = new Student(1, "sk");
        arr[2] = new Student(1, "siri");
        arr[3] = new Student(1, "kkr");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at :" + i + " :  {" + arr[i].roll_no + " " + arr[i].name + " }");
        }
    }
}

