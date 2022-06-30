import java.util.HashMap;

/**
 * @author TODO
 * {@code @datetime} 2022/6/30 16:09
 */
public class TwoSum_2 {
    public static void main(String[] args) {
        int[] nums={1,3,6,9,11,22};
        int target =4;

        int[] result=twoSum(nums,target);

        System.out.println(result[0]+","+result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        HashMap<Integer, Integer> hp=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n=target-nums[i];
            if (hp.containsKey(n)){
                result[1]=i;
                result[0]=hp.get(n);
            }
            hp.put(nums[i],i);
        }
        return result;
    }

}
