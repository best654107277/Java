package Demo02;

public class Demo03StringGet {
    public static void main(String[] args) {
        //获取字符串的长度
        int length = "asdasasdasdasdasd".length();
        System.out.println(length);

        //凭借字符串
        String str1 = "Hello";
        String str2 = "Java";
        String str3 = str1.concat(str2);


        //获取自定索引位置的单个字符
        char ch = "Hello".charAt(0);
        System.out.println(ch);

        //查找字符第一次出现的索引位置
        String ori = "HelloJava";
        int orig = ori.indexOf("llo");
        System.out.println(orig);
    }
}
