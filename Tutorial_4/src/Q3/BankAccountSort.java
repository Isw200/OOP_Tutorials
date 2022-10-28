package Q3;

import java.util.ArrayList;
import java.util.Collections;

public class BankAccountSort {
    public static void main(String[] args) {
        BankAccount bal1 = new BankAccount(1700);
        BankAccount bal2 = new BankAccount(7900);
        BankAccount bal3 = new BankAccount(3300);

        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        list.add(bal1);
        list.add(bal2);
        list.add(bal3);

        System.out.println(bal1.compareTo(bal2));

        Collections.sort(list);

        for (BankAccount b : list)
            System.out.println(b.getBalance());
    }
}
