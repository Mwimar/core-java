

class Human {
    private String name;
    private int age;

   

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        
    }
    
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
   
   

}

class Vipi {

    public static void main(String a[]) throws ClassNotFoundException {

       

        
        Human obj1 = new Human("Kevin", 50);
        // obj.setAge(26);
        // obj.setName("Mwima");
        
        System.out.println( obj1.getName() + ":" + obj1.getAge());

    }

}
