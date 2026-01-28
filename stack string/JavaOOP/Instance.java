public class Instance{
    String name;
    int age;
    public Instance(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String args[]){
        Instance i1=new Instance("Anmol", 20);
        i1.display();
    }
}
