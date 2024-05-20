import java.util.Arrays;
import java.util.Optional;

public class School {
    private Student[] studentuSarasas = new Student[1];

    /**
     * pridėti mokinį į masyvą.
     *
     * @param student
     */
    public void addStudent(Student student) {
        if (studentuSarasas[0] == null){
            studentuSarasas[0] = student;
        } else {
            Student[] naujasMasyvas = Arrays.copyOf(studentuSarasas, studentuSarasas.length + 1);
            naujasMasyvas[studentuSarasas.length] = student;
            studentuSarasas = naujasMasyvas;
        }
    }

    /**
     * apskaičiuoja vidurkį mokiniui pagal nurodytą vardą.
     *
     * @param name
     */
    public double calculateAverage(String name) {
        for (Student s : studentuSarasas){
            if (s.getName().equalsIgnoreCase(name)){
                System.out.println(Arrays.toString(s.getGrades()));

            }
        }
        return 0;
    }

    public Student[] gautiStudentuSarasa(){
        return studentuSarasas;
    }

    public void getStudentuSarasas() {
        for (Student s : studentuSarasas){
            System.out.println(s);
        }
    }

    /**
     * Atspauzdina mokinio pazymius pagal varda
     *
     * @param name - Perduodamas mokinio vardas
     */
    public void printStudentGrades(String name) {
        Optional<Student> optionalStudent = Arrays.stream(gautiStudentuSarasa())
                .filter(Student -> Student.getName().equalsIgnoreCase(name))
                .findFirst();

        if (optionalStudent.isPresent()){
            Student student = optionalStudent.get();
            System.out.println(student.getName() + " " + Arrays.toString(student.getGrades()));
        } else {
            System.err.println(name + " nerasta!");
        }
    }

    /**
     * spausdina visus studentus kurių vidurkis aukštesnis nei 8.5
     */
    public void printTOP10Students() {

    }

    /**
     * grąžina surikiuotą masyvąpagal order ("ASC", "DESC")
     *
     * @param order
     */
    public Student[] resortList(String order) {

        return null;
    }
}
