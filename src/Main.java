
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Petras");
        Student s2 = new Student("Ona");
        Student s3 = new Student("asd");
        s1.addGrade(1);
        s2.addGrade(3);
        s2.addGrade(9);
        s2.addGrade(10);
        s3.addGrade(13);

        School school = new School();
        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);

        //school.getStudentuSarasas();

        //school.calculateAverage("Ona");

        school.printStudentGrades("Ona");
    }
}