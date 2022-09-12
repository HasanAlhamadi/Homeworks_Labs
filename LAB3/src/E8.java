import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        PaycheckE8 emp= new PaycheckE8();
        String Name;
        float Salary;
        float h;
        System.out.println("Enter the employee name:");
        Name= in.next();
        System.out.println("Enter the Salary per hour");
        Salary= in.nextFloat();
        System.out.println("Enter the number of hours:");
        h=in.nextFloat();

        emp.setName(Name);
        emp.setSalary(Salary);
        emp.setHours(h);

        System.out.println(emp.calculation());
    }
}
