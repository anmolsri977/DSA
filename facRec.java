import java.util.*;
public class facRec {
    int fact(int n)
    {
        if(n==1 || n==0)
        return 1;
        else
        return n*fact(n-1);
    }
    public static void main(String args[])
    {
        facRec ob=new facRec();
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result=ob.fact(num);
        System.out.println("Factorial of "+num+" is: "+result);
    }
}
