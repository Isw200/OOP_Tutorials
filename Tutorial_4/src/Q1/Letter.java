package Q1;

public class Letter implements Printable {
    private String textField;

    public Letter(String textField) {
        this.textField = textField;
        hi();
    }

    @Override
    public void print() {
        System.out.println(textField);
    }
}
