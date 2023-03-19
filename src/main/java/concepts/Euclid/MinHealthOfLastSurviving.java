package concepts.Euclid;

public class MinHealthOfLastSurviving {
    public int mnHealth(int[] nums){
        int n=nums.length;
        int mnHlth=nums[0];
        for(int i=1;i<n;i++) mnHlth=Gcd.gcd(mnHlth,nums[i]);
        return mnHlth;
    }
}
