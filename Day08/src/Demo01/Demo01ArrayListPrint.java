package Demo01;

import java.util.ArrayList;
import java.util.Random;

public class Demo01ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(100)+1;
            bigList.add(num);
        }
        ArrayList result = printList(bigList);
        int size = result.size();
        System.out.println(result+"\n偶数总和有："+size);
    }

    public static ArrayList<Integer> printList(ArrayList<Integer> samllList){
        ArrayList<Integer> samll = new ArrayList<>();
        for (int i = 0; i < samllList.size(); i++) {
            int num = samllList.get(i);

            if(num % 2 == 0){
                samll.add(num);
            }
        }
        return samll;
    }
}
