import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = -1;
        System.out.println("Enter number of elements of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key element to search: ");
        int key = sc.nextInt();
        int low = 0;
        int high = n - 1;
        Arrays.sort(arr);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                pos = mid + 1;
                break;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (pos == -1) {
            System.out.println("Search unsuccessful");
        } else {
            System.out.println("Element found at position " + pos + " in the array.");
        }
    }
}
output:
Enter number of elements of array: 
5
Enter 5 values: 
10 20 30 40 50
Enter the key element to search: 
20
Element found at position 2 in the array.
