package Basics;
public class Q2Employee {
	private int id;
    private String firstName;
    private String lastName;
    private int salary;
    // Constructor
    public  Q2Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    // Getter methods
    public int getID() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return firstName + " " + lastName;
    }
    public int getSalary() {
        return salary;
    }
    // Setter method
    public void setSalary(int salary) {
        this.salary = salary;
    }
    // Method to calculate annual salary
    public int getAnnualSalary() {
        return salary * 12;
    }
    // Method to raise salary by a specified percentage
    public int raiseSalary(int percent) {
        if (percent >= 0) {
            double increase = (percent / 100.0) * salary;
            salary += (int) increase;
        }
        return salary;
    }
    // Override toString method
    public String toString() {
        return "Employee[id-" + id + ", name-" + getName() + ", salary=" + salary + "]";
    }
    public static void main(String[] args) {
    	 Q2Employee employee = new  Q2Employee(7, "Rakesh", "Kumar", 50000);
        System.out.println("Employee ID: " + employee.getID());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());
        System.out.println("Annual Salary:" + employee.getAnnualSalary());
        // Increase salary by 12%
        int newSalary = employee.raiseSalary(12);
        System.out.println("New Salary after raise: " + newSalary);
        // Print employee details using toString()
        System.out.println(employee.toString());
    }
}
	