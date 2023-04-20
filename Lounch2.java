package Encaosulation;

class boy {
    private int age;
    private String name;

    public void setData(int age){
        this.age = age;
    }

    public void setData1(String name){
        this.name=name;
    }
    public void show(){
        System.out.println(name + " " +age);
    }

}

public class Lounch2 {
    public static void main(String[] args) {
        boy obj = new boy();
        obj.setData(18);
        obj.setData1("Riya");

        obj.show();
    }
}
