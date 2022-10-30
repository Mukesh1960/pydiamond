import java.util.*;

public class binarySearch {

    public static Scanner scn = new Scanner(System.in);

    public static int[] input2 (int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static int bSearch (int[] arr, int data) {
        int si = 0;
        int ei = arr.length - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            
            if (arr[mid] == data) {
                return mid;
            }
            
            else if (arr[mid] < data) {
                si = mid + 1;
            }

            else {
                ei = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = input2(n);
        int data = scn.nextInt();
        int ans = bSearch(arr, data);
        System.out.print(ans);

    }
}
