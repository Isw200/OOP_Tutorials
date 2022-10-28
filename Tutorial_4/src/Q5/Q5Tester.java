package Q5;

public class Q5Tester {
    public static void main(String[] args) {
        DriverLicense driverLicense = new DriverLicense("Bernard",2026);

        System.out.println("Is Driver licence Expired: "+driverLicense.isExpired());
        System.out.println(driverLicense.format());

        System.out.println(".........................................");

        CreditCard creditCard = new CreditCard("Lily",20210062,1234);
        System.out.println(creditCard.format());

        System.out.println(".........................................");

        Passport passport = new Passport("Zen","London", 2030);
        System.out.println(passport.format());
    }
}
