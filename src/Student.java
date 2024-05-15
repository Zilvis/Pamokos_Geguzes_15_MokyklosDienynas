import java.util.Arrays;

public class Student {
    private String name;
    public Integer[] grades = new Integer[1];

    public Student(String name) {
        this.name = name;
    }

    public void addGrade (int grade){
            if (grades[0] == null){
                grades[0] = grade;
            } else {
                Integer[] newGrades = Arrays.copyOf(grades,grades.length +1);
                newGrades[grades.length] = grade;
                grades = newGrades;
            }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer[] getGrades() {
        return grades;
    }

    public void setGrades(Integer[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return String.format("%s,%s",name, Arrays.toString(grades));
    }
}
