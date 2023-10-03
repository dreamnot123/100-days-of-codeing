class Solution {
    public int xorOperation(int n, int start) {
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            //a[i]=start;
            a[i]=start+2*i;
        }
        int c=0;
        for(int i=0;i<n;i++){
            c=c^a[i];
        }
        return c;
        
    }
}
