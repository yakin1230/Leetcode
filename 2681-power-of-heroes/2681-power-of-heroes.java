import java.util.Arrays;

class Solution {
    public int sumOfPower(int[] nums) {
        Arrays.sort(nums);

        long ans = 0, sum = 0;
        long mod = 1000000007;

        for (int x : nums) {
            ans = (ans + (long)x * x % mod * (x + sum)) % mod;
            sum = (2 * sum + x) % mod;
        }

        return (int) ans;
    }
}