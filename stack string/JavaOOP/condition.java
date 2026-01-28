class condition{
    boolean isEven(int x){
        if(x%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(){
        int a=10,b=13;
        if(a>b){
            System.out.println("a is greater than b");
        }
        else if(a==b){
            System.out.println("a is equal to b");
        }
        else{
            System.out.println("b is greater than a");
        }
        if(new condition().isEven(a)){
            System.out.println("a is even");
        }
        else{
            System.out.println("a is odd");
        }
        if(new condition().isEven(b)){
            System.out.println("b is even");
        }
        else{
            System.out.println("b is odd");
        }
    }
}