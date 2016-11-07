package lesson9a;

/**
 * @author dgorbachenko
 */
public class Schoolboy extends Student {

    private String school ;
    private int numberClass;

    public Schoolboy(String school, int numberClass) {
        this.school = school;
        this.numberClass = numberClass;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getNumberClass() {
        return numberClass;
    }

    public void setNumberClass(int numberClass) {
        this.numberClass = numberClass;
    }

    public String getInfoSchoolboy(){
        return name + " " + surname + " " + getSchool() + getNumberClass();
    }


}
