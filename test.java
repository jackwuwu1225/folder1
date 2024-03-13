public class test{
    int x = 5;
    double PI = 3.14;
    static double Multiply(int x, double y){
        return (double)x * y;
    }
    String str1 = "Helloworld!";
    public static void main(String[] args){
        test myObj = new test();
        System.out.println(myObj.x);
        System.out.println(myObj.PI);
        double z = Multiply(myObj.x, myObj.PI);
        System.out.println(z);
        String str_copy = myObj.str1[::-1];
    }
}
/*
 public單獨用代表需要object去導向所需的attributes
 static當讀用代表可以直接使用不需導向
 public static代表可以被公用的意思
 method就是函式
 constructor是初始化，名稱需要和檔名（也就是class）的名稱相同
 想到再補充...
 */