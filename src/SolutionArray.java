public class SolutionArray {
    public static int findTargetSumWays(int[] nums, int S) {
        if (nums.length == 0 || nums == null) return 0;
        int count = 0;
        dfs(nums, S, 0, count, 0);
        return count;
    }

    private static void dfs(int[] nums, int S, int index, int count, int tmp) {
        if (index == nums.length && tmp == S) {
            count++;
        }
        dfs(nums, S, index + 1, count, tmp + nums[index]);
        dfs(nums, S, index + 1, count, tmp - nums[index]);

    }
        public static void main (String args[]){
            int[] a = new int[]{1, 1, 1, 1, 1};
            findTargetSumWays(a, 3);
        }
    }

