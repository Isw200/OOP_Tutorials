package Q5;

import java.util.Date;

public class DriverLicense extends Card {
    private int expirationYear;

    public DriverLicense(String n,int expirationYear){
        super(n);
        this.expirationYear = expirationYear;
    }

    @Override
    public boolean isExpired() {
        Date date = new Date();
        String yearStr = String.valueOf(date);
        yearStr = yearStr.substring(24);
        int yearInt = Integer.parseInt(yearStr);

        if (expirationYear >= yearInt)
            return false;
        else
            return true;
    }

    @Override
    public String format() {
        return super.format() + "\nExpiration Year: "+ this.expirationYear;
    }
}
