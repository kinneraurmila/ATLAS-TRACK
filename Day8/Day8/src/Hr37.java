public class Hr37 extends Emp37{
    public static void main(String[] args){
        Hr37 h = new Hr37();
        h.setPwd(1703);
        h.salary = 50000;
        h.empid= 1001;
        System.out.println("Salary : " + h.salary);
        System.out.println("Emp Id : " + h.empid);
        System.out.println("Password : " + h.getPwd());
    }
}
