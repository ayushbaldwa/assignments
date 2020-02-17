public class Father implements GrandParents{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void GrandParentsNames() {
    System.out.println("GrandFatherName: Narayan , GrandMotherName: Kalavati");
    }
    public void fatherInfo(){
        System.out.println("FatherName: "+name+" FatherAge: "+age);
    }
}
