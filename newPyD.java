import java.util.*;
public class search {

    public static Scanner scn = new Scanner (System.in);

    public static void input1(int[] arr) {
        for (int ele = 0; ele < arr.length; ele++) {
            arr[ele] = scn.nextInt();
        }
    }

    public static int[] input2(int n) { 
        int[] arr = new int[n];
        for (int ele = 0; ele < arr.length; ele++) {
            arr[ele] = scn.nextInt();
        }
        return arr;
    }

    public static int find(int[] arr, int data) {

        for (int ele = 0; ele < arr.length; ele++) {
            if (arr[ele] == data) {
                return ele;
            }
        }
        return -1;
    }

    public static int foundAt(int[] arr, int data) {
        int fA = -1;
        for (int ele = 0; ele < arr.length; ele++) {
            if (arr[ele] == data) {
                fA = ele;
                break;
            }
        }
        return fA;
    }

    public static void main (String[] args) {
        int n = scn.nextInt();
        // int[] arr = new int[n];
        int[] arr = input2(n);
        int data = scn.nextInt();
        // input(arr);
        int ans = foundAt(arr, data);
        System.out.println(ans);
    }
}

































// import java.util.*;

// public class search {

//     public static Scanner scn = new Scanner (System.in);

//     public static void input(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scn.nextInt();
//         }
//     }

//     public static int found(int[] arr, int data) {
//         int foundAtEle = -1;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == data) {
//                 foundAtEle = i;
//                 break;
//             }
//             return -1;
//         }
        
//     }

//     public static void main(String[] args) {
//         int n = scn.nextInt();
//         int data = scn.nextInt();
//         int[] arr = new int[n];
//         input(arr);
//         found(arr);
//     }
    
// }
