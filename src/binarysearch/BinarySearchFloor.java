package binarysearch;

public class BinarySearchFloor {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 14, 19, 20, 23, 25, 27} ;
        System.out.println( searchFloor(arr,13, 0, 10) );
    }

    public static int searchFloor(int[] arr, int k, int s, int e) {
        int lo = s ;
        int hi = e ;
        int ans = Integer.MIN_VALUE ;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2 ;

            System.out.println(lo + " " + hi + " " + mid);

            if (arr[mid] == k) {
                return mid ;
            } else if (arr[mid] < k) {
                ans = arr[mid] ;
                lo = mid + 1   ;
            } else {
                hi = mid - 1;
            }
        }
        return ans ;
    }
}
