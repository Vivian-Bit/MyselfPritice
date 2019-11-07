import java.util.Scanner;

public class StringFanzhuan {

    static String s=" q";
    static String ss=" q";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        String s1 = scanner.next();
        String s2 = scanner.next();
        char[] ss1 = s1.toCharArray();
        char[] ss2 = s2.toCharArray();
        for(int i = 0;i<ss1.length;i++){
            ss1.
        }
        */
        StringBuffer s1 = new StringBuffer(scanner.next());
        StringBuffer s2 = new StringBuffer(scanner.next());
        int sum = 0;

        for(int i = 0;i<s1.length();i++){
           StringBuffer a=s1.insert(i,s2);
           System.out.println(a);/*
           String s =a.toString(); //插入
           String ss =(a.reverse()).toString() ; //反转

            if(s==ss){ //判断
               sum++;
           }*/
       }
        System.out.println(sum);
        }
        }
