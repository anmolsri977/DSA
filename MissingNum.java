import java.util.*;
class MissingNum{
    int misnum(int nums[]){
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        MissingNum obj=new MissingNum();
        int missingNumber=obj.misnum(nums);
        System.out.println("The missing number is: " + missingNumber);
    }
}