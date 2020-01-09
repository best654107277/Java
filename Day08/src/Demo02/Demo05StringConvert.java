package Demo02;
/*
public char[] toCharArray(); //将当前字符串拆分为字符数组作为返回值
public byte[] getBytes();获得当前字符串底层的字节数组
public String replace(CharSequence oldString, CharSequence newString);
将所有出现的老字符串替换成为新的字符串，返回替换之后的结果（新字符串）
 */
public class Demo05StringConvert {
    public static void main(String[] args) {
        //转换成为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);//H
        System.out.println(chars.length);//5
        System.out.println("==================");

        //转换成为字节数组
        byte[] bytes = "ABC".getBytes();
        System.out.println("指定打印索引位置的字符字节："+bytes[0]);
        System.out.println("直接打印变量名得到的是数组地址"+bytes);
        //使用循环全部打印
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

    }
}
