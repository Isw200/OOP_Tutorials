package Q1;

public class Student implements Printable {
    private String name;
    private String[] grades= new String[5];

    public Student(String name, String[] grades) {
        this.name = name;
        this.grades = grades;
    }

    @Override
    public void print() {
        System.out.println("Name: "+name);
        for (String grade: grades){
            System.out.println("Grade: "+grade);
        }
    }
}
