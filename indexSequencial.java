import java.util.*;
public class indexSequencial {
    int seqSearch(int arr[], int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        indexSequencial ob = new indexSequencial();
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int key = sc.nextInt();
        int idx = ob.seqSearch(arr, n, key);
        if (idx != -1)
            System.out.println("Element found ");
        else
            System.out.println("Element not found");
    }
    
}