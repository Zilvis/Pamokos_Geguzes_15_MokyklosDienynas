import java.util.Arrays;

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

    public void getStudentuSarasas() {
        for (Student s : studentuSarasas){
            System.out.println(s);
        }
    }

    /**
     * spausdina visus mokinio pažymius.
     *
     * @param name
     */
    public void printStudentGrades(String name) {

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
