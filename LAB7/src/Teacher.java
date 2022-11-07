public class Teacher extends Person{
    private double salary;


    public Teacher(String name, int birthyear , double salary) {
        super(name, birthyear);
        this.salary=salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher: \n" +
                "salary: " + salary +'\n'+
                ", name: " + name + '\n' +
                ", birthyear: " + birthyear;
    }
}
