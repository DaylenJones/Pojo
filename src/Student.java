public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String major;


    public Student() {
        this.studentId = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.major = "";
    }


    public Student(String studentId, String firstName, String lastName, int age, String major) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.major = major;
    }


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + firstName + " " + lastName + ", Age: " + age + ", Major: " + major;
    }
}

import java.util.ArrayList;
import java.util.List;

public class StudentEnrollment {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();


        Student student1 = new Student("12345", "John", "Doe", 20, "Computer Science");
        Student student2 = new Student("23456", "Jane", "Smith", 21, "Mathematics");
        Student student3 = new Student("34567", "Bob", "Johnson", 19, "Physics");


        students.add(student1);
        students.add(student2);
        students.add(student3);


        for (Student student : students) {
            System.out.println(student);
        }


        student1.setMajor("Data Science");


        System.out.println("\nUpdated Major for Student ID: " + student1.getStudentId());
        System.out.println(student1);
    }
}


}
