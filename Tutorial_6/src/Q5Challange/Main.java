package Q5Challange;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = {4,7,1,3,9,2,7,8,5};
        int[] sorted = Arrays.stream(array).sorted().toArray();

        System.out.println("Missing: " + findMissing(sorted));
        System.out.println("Duplicated: " + findDuplicate(sorted));
    }

    public static int findMissing(int [] array){
        int missing = 0;
        for (int i = 0; i < array.length-1; i++){
            if (array[i] != array[i+1] && array[i+1] != array[i]+1){
                missing = array[i]+1;
            }
        }
        return missing;
    }
    public static int findDuplicate(int [] array){
        int duplicate = 0;
        for (int i = 0; i < array.length-1; i++){
            if (array[i] == array[i+1]){
                duplicate = array[i];
            }
        }
        return duplicate;
    }

}
