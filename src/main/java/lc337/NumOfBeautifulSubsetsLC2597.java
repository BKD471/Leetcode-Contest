package lc337;

public class NumOfBeautifulSubsetsLC2597 {
    public int NumOfBeautifulSubset(int[] nums,int[] hash,int index,int k){
        if(index==nums.length) return 1;

        int taken=0;
        if( (nums[index]-k<0 || hash[nums[index]-k]==0) && (nums[index]+k>=1001 || hash[nums[index]+k]==0)){
            hash[nums[index]]++;
            taken=NumOfBeautifulSubset(nums,hash,index+1,k);
            hash[nums[index]]--;
        }

        int not_taken=NumOfBeautifulSubset(nums,hash,index+1,k);
        return taken+not_taken;
    }

    public int beautifulSubsets(int[] nums, int k) {
        int n=nums.length;
        int[] hash=new int[1001];
        return NumOfBeautifulSubset(nums,hash,0,k)-1;
    }
}
