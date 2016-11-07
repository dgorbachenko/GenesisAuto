package lesson9a;

/**
 * @author dgorbachenko
 */
public class Main {

    public static void main(String[] args) {

        Footballer footballer = new Footballer("Dynamo ", 17);
        System.out.println(footballer.getInfo());

        Schoolboy schoolboy = new Schoolboy("Scholl #1 ",5);
        System.out.println(schoolboy.getInfoSchoolboy());

        Student student = new Student("BIO",1);
        System.out.println(student.getInfoStudent());
    }
}
