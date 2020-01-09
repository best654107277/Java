package Demo02;

public class Demo06StringPractise {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        String str2 = fromarrayP(array);
        System.out.println(str2);
    }
    public static String fromarrayP(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i ==array.length - 1){
                str+="word" + "]";
            }else{
                str +="word" + array[i]+ "#";
            }
        }
        return str;

    }
}
