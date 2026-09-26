public class Main{
    public static void main(String[] args) {
        Monster mons = new Monster(45, "John");
        System.out.println(mons.getName());
        System.out.println(mons.getAge());

        mons.setName("Tommy");  // m.age = 30; // ERROR -->Because age and name are private.
        mons.setAge(55);

        System.out.println(mons.getName()); // System.out.println(m1.age); not use like this
        System.out.println(mons.getAge());
        System.out.println();


        // encapsulation with validation
        Monster1 mons1 = new Monster1();
        mons1.setAge(25);
        System.out.println(mons1.getAge());

        mons1.setAge(-5);
        System.out.println(mons1.getAge());

        
        // read only field
        Monster2 mons2 = new Monster2();
        System.out.println(mons2.getAge());
        

        // write only field -- here not getter method and cannot take output
        Monster3 mons3 = new Monster3();
        mons3.setName("Tom");
        System.out.println();


        // two class
        Warrior w = new Warrior();
        Monster4 m = new Monster4();
        m.steal(w);
        System.out.println();


        // inheritance
        // 01
        Dog d = new Dog();
        d.name = "Tom";
        d.age = 20; 
        d.eat();    // inheritance method    
        d.showdetails();   // dogs own method
















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


// encapsulation with validation
class Monster1{
    private int age;

    public void setAge(int age){
        if(age >= 1){
            this.age = age;
        }else{
            System.out.println("Invalid age");
        }
    }


    public int getAge(){
        return age;
    }
}



// read only field
// But cannot change it using a setter because there is no setter.
class Monster2{
    private int age = 50;

    public int getAge(){    
        return age;
    }

}


// write only field
class Monster3{
    private String name;

    public void setName(String name){
        this.name = name;

    }
}


// two class
class Warrior{

    public void lose_stick(){
        System.out.println("Warrior lost the stick");
    }

}

class Monster4{
    public void steal(Warrior warrior){
        warrior.lose_stick();

    }
}


// inheritance
// 01
class Animal{
    String name;

    void eat(){ // Here, no access modifier is written. This means the method has default (package-private) access.
        System.out.println(name + " is eating");
    }


}

class Dog extends Animal{
    int age;

    void showdetails(){
        System.out.println(name + " is barking");
        System.out.println(age + " years old");
    }

}

