// BinarySearch.java

import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 4, 6, 8, 10};

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int result = binarySearch(arr, target);
        System.out.println(result == -1 ? "Not Found" : "Found at index " + result);
        sc.close();
    }
}
