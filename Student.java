public class Student {

    private String name;
    private String major;
    private int grade;
    private double average;

    public Student(String nam, String majo, int grad, double averag) {
        name = nam;
        major = majo;
        grade = grad;
        average = averag;
    }
    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("Grade: " + grade);
        System.out.println("Average: " + average);
    }
}

