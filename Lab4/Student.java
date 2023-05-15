import java.util.Arrays;
import java.util.Comparator;

public class Student {
    private String name;
    private int age;
    private String grade;
    private String school;
    private String idNumber;

    public Student(String name, int age, String grade, String school, String idNumber) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.school = school;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public String getSchool() {
        return school;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("John Connor", 18, "A", "School№1", "S001");
        students[1] = new Student("Jessica Chastain", 17, "B", "School№2", "S002");
        students[2] = new Student("Mark Wahlberg", 19, "A", "School№3", "S003");
        students[3] = new Student("Robert Paulson", 18, "B", "School№4", "S004");
        students[4] = new Student("Saul Goodman", 17, "C", "School№5", "S005");

        System.out.println("Sorting by age (висхідний):");
        Arrays.sort(students, Comparator.comparing(Student::getAge));
        for (Student student : students) {
            System.out.println(student.getName() + " - Age: " + student.getAge());
        }

        System.out.println("\nSorting by grade (спадання):");
        Arrays.sort(students, Comparator.comparing(Student::getAge, Comparator.reverseOrder()));
        for (Student student : students) {
            System.out.println(student.getName() + " - Grade: " + student.getAge());
        }
    }
}
