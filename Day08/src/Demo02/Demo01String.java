package Demo02;

public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();
        System.out.println("str1的字符串是空的："+str1);

        //根据字符数组创建字符串
        char[] charArray = {'A','B','C'};
        String str2 = new String(charArray);
        System.out.println("str2接收的是一个char类型的数组"+str2);

        //根据字节数组创建字符串、
        byte[] byteArray = {65, 66, 67, 97, 98, 99};

        String str3 = new String(byteArray);
        System.out.println("str3是byte字节类型数组"+str3);

        //直接创建
        String str4 = "str4";
        System.out.println("直接输出的str4".equals(str4)+str4);
    }
}
