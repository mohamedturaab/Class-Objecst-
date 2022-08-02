package omar.com;

public class Person {
    private String name;
    private int age;
    private int Phone;
    private String Color;

    public String getName(){
        return  name;
    }
    public void setName(String n){
        name = n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public int getPhone(){
        return Phone;
    }
    public void setPhone(int P){
        Phone = P;
    }
    public String getColor(){
        return Color;
    }
    public void setColor(String C){
        Color = C;
    }
    public void sayHello(){
        System.out.println(" Hello " +name);
    }
}

