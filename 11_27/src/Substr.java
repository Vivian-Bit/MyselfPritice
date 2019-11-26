public class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        int len = s.length();
        boolean[]  bool= new boolean[len];
        int j = 0;
        for( int i = 0;i<p.length;i++,j++){
            String ss = p[i];
            if(s.contains(ss)){
                bool[j] = true;
            }
            else{
                bool[j] = false;
            }
        }
        return bool;
    }
}