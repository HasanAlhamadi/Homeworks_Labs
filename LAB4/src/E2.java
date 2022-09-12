public class E2 {
    public static void main(String[] args) {
        String text="Mississippi";
        text = text.replace("i","ii");
        System.out.println(text.length());
        text= text.replaceAll("ss","s");
        System.out.println(text.length());
    }
}
