package lc1;

import java.util.HashMap;
import java.util.Map;

public class CountBeautifulSubArraysLC2588 {
        public long beautifulSubarrays(int[] nums) {
            int n=nums.length;
            int[] ps=new int[n+1];
            ps[0]=0;
            for(int i=1;i<=n;i++){
                ps[i]=ps[i-1]^nums[i-1];
            }

            Map<Integer,Integer> hash=new HashMap<>();
            long res=0;
            for(int i=0;i<n+1;i++){
                int v=ps[i];
                if(hash.containsKey(v)){
                    int cnt=hash.get(v);
                    res+=cnt;
                    hash.put(v,cnt+1);
                }else{
                    hash.put(v,1);
                }
            }
            return res;
        }
}
