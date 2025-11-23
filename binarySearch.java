import java.util.*;
class binarySearch{
    int binSearch(int a[],int l,int r,int key){
        if (r >= l) {
            int mid = l + (r - l) / 2;

           
            if (a[mid] == key)
                return mid;

           
            else if (a[mid] > key)
                return binSearch(a, l, mid - 1, key);

           
             else return binSearch(a, mid + 1, r, key);
        }  
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        binarySearch ob=new binarySearch();
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements in sorted order:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int key=sc.nextInt();
        int idx=ob.binSearch(a,0,n-1,key);
        if(idx!=-1)
        System.out.println("Element found at index "+idx);
        else
        System.out.println("Element not found");
    }
}