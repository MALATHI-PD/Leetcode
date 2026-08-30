class Solution {
    public void rotate(int[][] m) {
        int b[][]=new int[m[0].length][m.length];
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                b[j][m[0].length-i-1]=m[i][j];
            }
        }
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                m[i][j]=b[i][j];
            }
        }
    }
}