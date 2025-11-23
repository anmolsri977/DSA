import java.util.*;
class towerofhanoi
{
    void toh(int n, char source, char destination, char auxiliary)
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
            return;
        }
        toh(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);
        toh(n - 1, auxiliary, destination, source);
    }
    public static void main(String args[])
    {
        towerofhanoi ob=new towerofhanoi();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of disks:");
        int n=sc.nextInt();
        ob.toh(n, 'A', 'C', 'B');
    }
}