package VendingMachine;

public class VendingMachine {
    private int cans;
    private int tokens;

    public VendingMachine(int cans) {
        this.cans = cans;
    }
    public VendingMachine() {
        this.cans = 10;
    }

    public int getCans() {
        return cans;
    }
    public int getTokens() {
        return tokens;
    }

    public void fillCans(int cans) {
        this.cans +=  cans;
    }

    public void insertTokens() {
        this.tokens += 1;
        this.cans -= 1;
    }
}
