import java.util.ArrayList;

public class Lottery {

    public static boolean isSame(ArrayList<Integer> arr, int rand){
        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i) == rand)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList <Integer> lucky_Nums = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            if (lucky_Nums.isEmpty()) {
                int rand = (int) Math.round(Math.random() * 49);
                lucky_Nums.add(rand);
            }
            else {
                int rand = (int) Math.round(Math.random() * 49);
                boolean bool = isSame(lucky_Nums, rand);
                while (bool == true){
                    rand = (int) Math.round(Math.random() * 49);
                    bool = isSame(lucky_Nums, rand);
                }
                lucky_Nums.add(rand);

        }
    }
        System.out.println("......................");
        for (int j : lucky_Nums){
            System.out.println(j);
        }
}}
