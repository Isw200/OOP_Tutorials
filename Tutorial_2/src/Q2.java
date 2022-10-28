public class Q2 {
    public static void main(String[] args) {
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";

        String sentence1 = article.concat(" ").concat(animal1).concat(" ").concat(action).concat(" ").concat(animal2);
        System.out.println(sentence1);

        System.out.println("");

        String sentence2 = animal1+" "+animal2+" "+article+" "+action;
        System.out.println(sentence1);
    }
}
