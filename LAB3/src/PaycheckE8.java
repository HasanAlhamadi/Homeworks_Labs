public class PaycheckE8 {
    private float all_salary;
    private String name;
    private float salary;
    private float hours;
    void setName(String Name) {
        name = Name;
    }
    void setSalary(float Salary){
        salary=Salary;
    }
    void setHours(float h){
        hours=h;
    }
    float calculation(){
        if(hours<40)
            all_salary = salary * hours;
        else{
            all_salary=salary*40;
            hours-=40;
            all_salary+=((150.0/100)*salary)*hours;
        }
        return all_salary;
    }

}
