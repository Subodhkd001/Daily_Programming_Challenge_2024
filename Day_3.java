public class Day_3 {
    /*
     * Day 3 of 30 
     * 
     * Problem: Find the duplicate number
     * You are given an array arr containing n+1 integers, where each integer is in
     * the range [1, n] inclusive. There is exactly one duplicate number in the
     * array, but it may appear more than once. Your task is to find the duplicate
     * number without modifying the array and using constant extra space.
     */
    public static int findRepeated(int arr[]) {
        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        fast = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow; 
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 2, 2};
        System.out.println(findRepeated(arr));  // Output: 2
    }
}
