package omar.com;

public class Main {

    public static void main(String[] args) {
          Person person = new Person();
//        person.name = "Xamdi ahmed Adan";
//        person.age = 22;
//        person.Phone = 61793802;
//        person.Color = "Brown";
//        System.out.println(person.name);
//        System.out.println(person.age);
//        System.out.println(person.Phone);
//        System.out.println(person.Color);
          person.setName("Omar jibril Abdulkadir");
          System.out.println(person.getName());
          person.setAge(21);
          System.out.println(person.getAge());
          person.setPhone(61899032);
          System.out.println(person.getPhone());
          person.setColor("Brown");
          System.out.println(person.getColor());
          person.sayHello();



    }
}
