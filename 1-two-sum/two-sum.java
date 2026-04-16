class Solution {
    public int[] twoSum(int[] nums, int target) {
        //HashMap key, value
         HashMap<Integer ,Integer> map = new HashMap<>();

         for(int i=0;i<nums.length;i++){

            int complement = target-nums[i];

            if(map.containsKey(complement)){
                // return the complent index and num index 

                return new int[] {map.get(complement),i};
            }
            //else it simply add it 
            map.put(nums[i],i);
         }


        //atlast nothing found return the empty array 

         return new int[] {};

        
    }
}