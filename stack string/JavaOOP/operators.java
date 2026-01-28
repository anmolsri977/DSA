class operators{
    public static void main(String args[]){
        int a=10,b=20;
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));
        System.out.println("a++="+(a++));
        System.out.println("++a="+(++a));
        System.out.println("b--="+(b--));
        System.out.println("--b="+(--b));
        System.out.println("a==b? "+(a==b));
        System.out.println("a!=b? "+(a!=b));
        System.out.println("a>b? "+(a>b));
        System.out.println("a<b? "+(a<b));
        System.out.println("a>=b? "+(a>=b));
        System.out.println("a<=b? "+(a<=b));
        System.out.println("Logical AND: "+((a<b)&&(a!=b)));
        System.out.println("Logical OR: "+((a<b)||(a==b)));
        System.out.println("Logical NOT: "+!(a<b));
        System.out.println("Bitwise AND: "+(a&b));
        System.out.println("Bitwise OR: "+(a|b));
        System.out.println("Bitwise XOR: "+(a^b));
        System.out.println("Left Shift: "+(a<<2));
        System.out.println("Right Shift: "+(a>>2));
    }
}