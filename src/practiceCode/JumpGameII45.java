package practiceCode;

public class JumpGameII45 {
    public int jump(int[] nums) {
        int curFarthest = 0;
        int curEnd = 0;
        int jumps = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            curFarthest = Math.max(curFarthest, nums[i] + i);
            if (i == curEnd) {
                jumps++; //next jump starting from i
                curEnd = curFarthest;
            }
        }
        return jumps;
    }
}
