//internally,hashmap is implemented as an array of linked list
import java.util.*;
public class implementmap {
    public static int union(int a1[] ,int a2[]){
        int n1=a1.length;
        int n2=a2.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n1;i++){
            set.add(a1[i]);
        }
        for(int i=0;i<n2;i++){
            set.add(a2[i]);
        }
        return set.size();
    }   
     public static void main(String[] args) {
        int a1[]={2,4,9};
        int a2[]={3,5,4,6,8,9,0};
        int ans=union(a1,a2) ;
        System.out.println(ans);
    }
}
