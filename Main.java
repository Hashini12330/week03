public class Main{
    public static void main(String[] args) {
        Monster mons = new Monster(45, "John");
        System.out.println(mons.getName());
        System.out.println(mons.getAge());

        mons.setName("Tommy");  // m.age = 30; // ERROR -->Because age and name are private.
        mons.setAge(55);

        System.out.println(mons.getName()); // System.out.println(m1.age); not use like this
        System.out.println(mons.getAge());



    }
}

//
class Monster{
    private int age;
    private String name;

    public Monster(int age, String name){
        this.age = age;
        this.name = name;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
            return age;
    }
}





