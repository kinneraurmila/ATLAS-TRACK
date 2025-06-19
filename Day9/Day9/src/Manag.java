// Concrete class representing a Manager, inheriting from Employee

class Manag extends Emp {
    private int numberOfSubordinates;

    public Manag(String name, int age, String employeeId, String department, int numberOfSubordinates) {
        super(name, age, employeeId, department);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Subordinates: " + numberOfSubordinates;
    }
}