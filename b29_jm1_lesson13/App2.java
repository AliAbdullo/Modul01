public class App2 {
    public static void main(String[] args) {

        System.out.println(twoTwo(new int[]{45,2,2,2,2}));
    }

    public static boolean twoTwo(int[] nums) {

        for(int i=0; i<nums.length; i++){

            if(nums[i]==2){

                int j=i+1;

                while(j < nums.length && nums[j]==2) j++;

                if(j-i == 1) return false;

                i=j;
            }

        }

        return true;
    }
}
