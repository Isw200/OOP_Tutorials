package Q1;

public class InterfaceTester {
    public static void main(String[] args) {
        Letter letter = new Letter("This is my sample letter");
        String[] grades =  {"A","B","C","D","E"};
        Student student = new Student("Anne", grades);


        letter.print();
        student.print();
    }
}
