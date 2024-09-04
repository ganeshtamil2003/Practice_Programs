class Human{
    private int age;
    private String name;
    
}

class Encapsulation{
    public static void main(String args[]){
        Human obj=new Human();
        obj.setAge(21);
        obj.setName("Ram");
        System.out.print(obj.getName()+":"+obj.getAge());
    }
}   