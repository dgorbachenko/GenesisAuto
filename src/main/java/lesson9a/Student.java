package lesson9a;

/**
 * @author dgorbachenko
 */
public class Student extends People {
    private String university ;
    private int course;

    public Student(String university, int course) {
        this.university = university;
        this.course = course;
    }

    public Student() {
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


    public String getInfoStudent(){
        return name + " " + surname + " " +" "+ age + " "+ getUniversity()+ getCourse()+ " " + gender;
    }
}
