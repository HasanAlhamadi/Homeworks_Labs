public class Student extends Person{
    private String major;

    public Student(String name, int birthyear, String major) {
        super(name, birthyear);
        this.major=major;
    }


    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student: \n" +
                "major :" + major + '\n' +
                ", name: '" + name + '\n' +
                ", birthyear=" + birthyear;
    }
}
