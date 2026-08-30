class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;int k=0,l=0,q=0,g=0;
        int max=Integer.MIN_VALUE;
        if(nums.length==1){
            return 1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                k=i;}
            if(nums[i]>max){
                max=nums[i];
                l=i;}
        }
        int n=nums.length;
     q=Math.max(k,l)+1;
     g=n-(Math.min(k,l));
   int c = (k + 1) + (n - l);

        int d = (l + 1) + (n - k);     return Math.min(Math.min(q,g),Math.min(c,d));
    }
}