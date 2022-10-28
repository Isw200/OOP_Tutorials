package BarCode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("""
                (A) to ZIP code to BAR Code
                (B) to BAR code to ZIP Code
                Enter:""");
        String answer = input.nextLine();

        if (answer.equals("A")){
            System.out.print("Enter ZIP code: ");
            int zipcode = input.nextInt();

            //Find the check digit
            String zipCode = String.valueOf(zipcode);
            int sum = 0;
            for (int j = 0; j < zipCode.length(); j++){
                sum += Integer.parseInt(String.valueOf(zipCode.charAt(j)));
            }
            int mul10 = 0;
            int rem = sum % 10;
            if(rem > 5) {
                mul10 = sum + (10 - rem);
            }
            int checkDigit = mul10 - sum;


            String fullBarcode = "1" + getBarCode(zipcode) + getBarCode(checkDigit) + "1";

            System.out.println("Bar Code");
            System.out.println(codeToBarCode(fullBarcode));
        }
        else {
            System.out.print("Enter BAR code: ");
            String barCode = input.nextLine();
            System.out.println("Zip Code");
            System.out.println(barCodeToZip(String.valueOf(barCode)));
        }
    }

    public static String getBarCode(int zipcode){
        //  7  4  2  1  0
        String barCode = "";
        String zipCode = String.valueOf(zipcode);
        for (int i = 0; i < zipCode.length(); i++){
            int balance = Integer.parseInt(String.valueOf(zipCode.charAt(i)));
            String barCodePart = "";

            if (balance == 0){
                barCodePart = "11000";
            }
            else {
                barCodePart = String.valueOf(balance/7);
                balance = balance % 7;
                barCodePart += String.valueOf(balance/4);
                balance = balance % 4;
                barCodePart += String.valueOf(balance/2);
                balance = balance % 2;
                barCodePart += String.valueOf(balance);

                if (found1TwoTimes(barCodePart)){
                    barCodePart += "0";
                }
                else {
                    barCodePart += "1";
                }
            }
            barCode += barCodePart;
        }
        return barCode;
    }

    public static boolean found1TwoTimes(String barCodePart){
        int foundTimes = 0;
        for (int i = 0; i < barCodePart.length(); i++){
            if (String.valueOf(barCodePart.charAt(i)).equals("0")){
                foundTimes ++;
            }
        }
        if (foundTimes == 2){
            return true;
        }
        else {
            return false;
        }
    }

    public static String codeToBarCode(String fullBarcode){
        String BarCode = "";
        for (int i = 0; i < fullBarcode.length(); i++){
            if (String.valueOf(fullBarcode.charAt(i)).equals("1")){
                BarCode += "|";
            }
            else {
                BarCode += ":";
            }
        }
        return BarCode;
    }


    public static int barCodeToZip(String barCode){
        String zipCode = "";
        barCode = barCode.substring(1,barCode.length()-6);

        for (int i = 0; i < 5; i++){
            String digit = barCode.substring(0,5);
            digit = digit.substring(0,4);
            int sum = 0;
            if (!digit.equals("||::")){
                if (String.valueOf(digit.charAt(0)).equals("|")){
                    sum += 7;
                }
                if (String.valueOf(digit.charAt(1)).equals("|")){
                    sum += 4;
                }
                if (String.valueOf(digit.charAt(2)).equals("|")){
                    sum += 2;
                }
                if (String.valueOf(digit.charAt(3)).equals("|")){
                    sum += 1;
                }
            }
            zipCode += sum;
            barCode = barCode.substring(5);
        }
        return Integer.parseInt(zipCode);
    }
}
