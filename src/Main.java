public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "jaggu");
        Student s2 = new Student(1, "jaggu");
        System.out.println(s1.hashCode() + "   " + s2.hashCode()+"  "+s1.equals(s2));

        System.out.println("Jaggu Royal".hashCode() + " " + "Jaggu Royal".hashCode());


    }
}

class Student {
    private int rollNo;
    private String Name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        Name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}