package Q5;

public class CreditCard extends Card {
    private int number;
    private int pinNumber;

    public CreditCard(String n,int number, int pinNumber){
        super(n);
        this.number = number;
        this.pinNumber = pinNumber;
    }

    @Override
    public boolean isExpired() {
        return false;
    }

    @Override
    public String format() {
        return super.format() + "\nCard Number: "+ this.number + "\nPin Number: " + this.pinNumber;
    }
}
