package lc338;

public class KItemsWithMaxSum {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int cnt=0;
        while(k>0){
            if(numOnes>0){
                cnt+=1;
                numOnes--;
            }else if(numZeros>0){
                numZeros--;
            }else{
                cnt-=1;
                numNegOnes--;
            }
            k--;
        }

        return cnt;
    }
}
