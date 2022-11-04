package Q5;

public abstract class Card {
    private final String name;


    public Card() {
        name = "";
    }
    public Card(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public abstract boolean isExpired();

    public String format() {
        return "Card holder: " + name;
    }
}
