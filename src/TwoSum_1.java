/**
 * @author TODO
 * {@code @datetime} 2022/6/29 17:00
 */
public class TwoSum_1 {

    public static void main(String[] args) {
        int[] nums={3,3,6,9};
        int target =6;

        int[] get=twoSum(nums,target);

        System.out.println(get[0]+","+get[1]);
    }


        public static int[] twoSum(int[] nums, int target) {
            int[] s=new int[2];
        for(int i=0;i<nums.length;i++){
                for(int a=i+1;a<nums.length;a++){
                    if(nums[i]+nums[a]==target){
                        s[0]=i;
                        s[1]=a;
                    break;}
                }
            }
            return s;
        }

}
