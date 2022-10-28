package VendingMachine;

public class VendingMachineTester {
    public static void main(String[] args)
    {
        VendingMachine machine = new VendingMachine();
        machine.fillCans(10); // fill up with ten cans
        machine.insertTokens();
        machine.insertTokens();
        System.out.print("Token count = ");
        System.out.println(machine.getTokens());
        System.out.print("Can count = ");
        System.out.println(machine.getCans());
    }
}
