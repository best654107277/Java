package Demo02;

public class Demo04Substring {
    public static void main(String[] args) {
        String str1 = "HelloJava";
        String str2 = str1.substring(5);
        System.out.println(str2);//Java
        System.out.println(str1);//HelloJava

        String str3 = str1.substring(3,str1.length()-3);
        System.out.println(str3);//loj
    }
}
