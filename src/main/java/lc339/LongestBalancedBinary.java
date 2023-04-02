package lc339;

public class LongestBalancedBinary {
    public int findTheLongestBalancedSubstring(String s) {
        int n=s.length();
        int mxCnt=0;
        for(int i=0;i<n;i++){
            int cnt0=0,j=i;
            while(j<n && s.charAt(j)=='0') {
                cnt0++;
                j++;
            }
            int cnt1=0;
            while(j<n && s.charAt(j)=='1'){
                cnt1++;
                j++;
            }
            mxCnt=Math.max(mxCnt,Math.min(cnt0,cnt1));
            i=j-1;
        }


        return mxCnt*2;
    }
}
