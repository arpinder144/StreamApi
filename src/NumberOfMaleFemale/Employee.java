package NumberOfMaleFemale;

public class Employee {
    private int ID;
    private String name;
    private String gender;
    private double salary;

    public Employee(int ID, String name, String gender, double salary) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
