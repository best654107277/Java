package cn.itcast.day04.demo04;
/*
对于功能累的方法来说，因为参数列表不一样，却需要记住那么多不用的方法名称，太麻烦。

方法的重载(OverLoad)多个方法的名称一样，但是参数列表不同；
好处：只需要记住唯一一个方法名称，就可以实现类似的多个功能。
        穿n个参数就用n个参数的方法。如果参数超出就报错
方法重载与下列因素相关：
1.参数个数不用
2.参数类型不同
3.参数的多类型顺序不同

方法重载与下列因素无关：
1.与参数的名称无关；
2.与方法的返回值类型无关
*/

public class Demo01MethodOverLoad {
    public static void main(String[] args) {
        System.out.println(sum(1.5,3));

    }
    public static int sum(int x, int y){
        System.out.println("有两个参数");
        return x + y;
    }
    public static int sum(double a, int b){
        System.out.println("有两个参数 第一个是double，第二个是int");
        return (int)(a + b);
    }
    public static int sum(int a, double b){
        System.out.println("有两个参数 第一个是int，第二个是double");
        return (int)(a + b);
    }
    public static int sum(double a, double b){
        System.out.println("有两个参数 第一个是double，第二个是double");
        return (int)(a + b);
    }
    public static int sum(int a, int b,int c){
        System.out.println("有三个参数");
        return a + b + c;
    }
    public static int sum(int a, int b,int c, int d){
        System.out.println("有四个参数");
        return a + b + c + d;
    }
}
