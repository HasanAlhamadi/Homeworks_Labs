public class E4 {
    public static void main(String[] args) {
        int IntialBalance=1000;
        double YearIntrest= 0.05;
        int intrest=0;
        double SalaryAfter3Years=0;
        int year=1;
        do{
           intrest+=IntialBalance*YearIntrest;
           year++;
        }
        while(year<=3);
        SalaryAfter3Years=IntialBalance+intrest;
        System.out.println(SalaryAfter3Years);
    }
}
