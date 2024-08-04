

class Human {
    private String name;
    private int age;

    public Human() {
        System.out.println("In constructor");
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

       

        Human obj = new Human();
        obj.setAge(26);
        obj.setName("Mwima");
        System.out.println( obj.getName() + ":" + obj.getAge());

    }

}
