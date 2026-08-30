class Solution {
    public String toLowerCase(String s) {
        char a[]=s.toCharArray();
         for(int i=0;i<a.length;i++){
            int si=a[i];
            if(si>64 && si<91){
                a[i]=(char)(si+32);
            }
        }
        return String.valueOf(a);
        //return  s.toLowerCase();
    }
}