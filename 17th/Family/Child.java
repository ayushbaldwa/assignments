public class Child extends Father implements Mother{
public void ChildInfo(){
        System.out.println("ChildName:"+getName()+" ChildAge:"+getAge());

}

    @Override
    public void motherName() {
System.out.println("MotherName:Pratibha");
    }
}
