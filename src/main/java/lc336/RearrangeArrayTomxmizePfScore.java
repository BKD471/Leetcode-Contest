package lc336;
import java.util.Arrays;
public class RearrangeArrayTomxmizePfScore {
    public int maxScore(int[] nums) {
        int n=nums.length,l=0;
        Arrays.sort(nums);
        int[] res=new int[n];
        for(int i=n-1;i>=0;i--){
            res[l]=nums[i];
            l++;
        }

        long ps=0;
        int mx=0;
        for(int e:res){
            ps+=(long)e;
            if(ps>0){
                mx+=1;
            }else{
                ps=0;
            }
        }

        return mx;
    }
}
