

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        // Step 1: find max
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        // Step 2: check each kid
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }
}