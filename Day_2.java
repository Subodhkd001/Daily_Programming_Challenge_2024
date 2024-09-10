public class Day_2 {
    /*
     * Day 2 of 30 
     * 
     * Problem: Find the missing number
     * You are given an array arr containing n-1 distinct integers. The array
     * consists of integers taken from the range 1 to n, meaning one integer is
     * missing from this sequence. Your task is to find the missing integer.
     */
    public static int findMissing(int arr[]){
        int n = (arr.length);

        int totalSum = n+1*n+2/2;
        int arrSum = 0;
        for(int i = 0; i<n; i++){
            arrSum += arr[i];
        }
        return arrSum - totalSum;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        System.out.println(findMissing(arr));
    }

}
