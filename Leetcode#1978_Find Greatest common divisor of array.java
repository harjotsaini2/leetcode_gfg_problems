class Solution {
    public int findGCD(int[] nums) {
        // Arrays.sort(nums);
        // int min= nums[0];
        // int max= nums[nums.length-1];
        // return gcd(min,max);

        int large=nums[0];
        int small=nums[0];
        for(int i=1;i<nums.length;++i){
           if(nums[i]>large)
                large=nums[i];

           if(nums[i]<small)
                small=nums[i];
                }

    return gcd(small,large);

    }

    public int gcd(int a, int b){
        if(a>b){
            int temp = a;
            a=b;
            b=temp;
        }
        if(b%a==0){
            return a;
        }

        return gcd(b%a,a);
    }
}
