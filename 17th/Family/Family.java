public class Family {
public static void main(String args[]) {
        Child child=new Child();
        child.setName("Ayush");
        child.setAge(20);
        Father father=new Father();
        father.setName("Sunil");
        father.setAge(44);
        child.ChildInfo();
        father.fatherInfo();
        child.motherName();
        father.GrandParentsNames();


    }
}