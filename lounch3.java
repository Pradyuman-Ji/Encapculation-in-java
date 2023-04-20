package Encaosulation;

class people {
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class lounch3 {
    public static void main(String[] args) {
        people obj = new people();
        obj.setAge(18);
        obj.setName("Riya");
        System.out.println( obj.getAge());
        System.out.println(obj.getName());
    }
}
