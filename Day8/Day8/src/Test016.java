enum WeekDays{
    sunday,Monday,tuesday,wednesday,thursday,friday,saturday
}
public class Test016 {
    public static void main(String[] args) {
        WeekDays obj = WeekDays.Monday;
        System.out.println(obj);
        System.out.println("Number of days in a week : ");
        for (WeekDays obj1:WeekDays.values()) {
            System.out.println(obj1);
        }
    }
}
