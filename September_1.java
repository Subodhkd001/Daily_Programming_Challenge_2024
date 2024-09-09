public class September_1 {
    /*
     * Day 1 of 30 🗓
     * 
     * Problem: Sort an Array of 0s, 1s, and 2s
     * You are given an array arr consisting only of 0s, 1s, and 2s. The task is to
     * sort the array in increasing order in linear time (i.e., O(n)) without using
     * any extra space. This means you need to rearrange the array in-place.
     */

    public static int[] sort(int arr[]){
        for(int i = 0; i< arr.length; i++){
            for(int j = i; j<arr.length; j++){
                if(arr[i] > arr [j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 1, 0, 2, 1, 0};
        int[] Ansarr = sort(arr);
        for (int i = 0; i < Ansarr.length; i++)
            System.out.print(Ansarr[i] + " ");
    }
}