import java.util.Scanner;

public class StrPanduan {
    public  static  String insretString(String src,String dec,int t){
        StringBuffer s = new StringBuffer(src);
        return s.insert(t,dec).toString();
    }
    /*
    public static String Stringinsert(String a,String b,int t){ //a原字符串 b要插入字符串 t位置
        return a.substring(0,t)+b+a.substring(t+1,a.length());
    }
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        int sum = 0;
        for(int i = 0; i<=s1.length();i++){
            String s = insretString(s1,s2,i);
            //System.out.println(s);
            StringBuffer ss = new StringBuffer(s);
            StringBuffer sss = ss.reverse();
            //System.out.println("SSS"+"="+sss);
            String ssss = sss.toString();
            //System.out.println("ssss"+"="+ssss);
            if( s.compareTo(ssss) == 0 ){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
