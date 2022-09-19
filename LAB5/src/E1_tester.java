public class E1_tester {
    public static void main(String[] args) {
        E1 tallycounter=new E1(2);
        tallycounter.click();
        tallycounter.click();
        tallycounter.click();
        System.out.println(tallycounter.getCount());
        tallycounter.undo();
        tallycounter.undo();
        tallycounter.undo();
        tallycounter.undo();
        tallycounter.undo();
        System.out.println(tallycounter.getCount());


    }
}
