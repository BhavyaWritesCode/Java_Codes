

public class valueVSreference {

    public static void changeValue(int x) {
        x = 100;
        System.out.println("Inside changeValue: x = " + x);
    }

    public static void changeArray(int[] arr) {
        arr[0] = 999;
        System.out.println("Inside changeArray: arr[0] = " + arr[0]);
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before changeValue: a = " + a);
        changeValue(a);
        System.out.println("After changeValue: a = " + a);

        System.out.println();

        int[] nums = {1, 2, 3};
        System.out.println("Before changeArray: nums[0] = " + nums[0]);
        changeArray(nums);
        System.out.println("After changeArray: nums[0] = " + nums[0]);
    }
}
