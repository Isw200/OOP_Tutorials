public class Q1 {
    public static void main(String[] args) {
        String river = "Mississippi";
        String bigRiver = river.toUpperCase();

        String smallRiver = new String(bigRiver.toLowerCase());
        System.out.println(smallRiver);
    }
}