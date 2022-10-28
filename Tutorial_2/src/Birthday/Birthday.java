package Birthday;

import java.util.ArrayList;

public class Birthday {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        while (true){
            int date = (int) (Math. random()*(364)) + 1;
            if (!list.isEmpty()){
                boolean found = find(list,date);
                if (found){
                    break;
                }
                else {
                    list.add(date);
                    list.add(date);
                    list.add(date);
                }
            }
            else {
                list.add(date);
            }

        }
        System.out.println("Number of people: "+ list.size());
    }
    static boolean find(ArrayList<Integer> list, int date){
        boolean found = false;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == date){
                found = true;
            }
            else {
                found = false;
            }
        }
        return found;
    }
}
