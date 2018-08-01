public class leiyuduixiang {
    public static void main(String []args){
//        面向对象
//       Cat cat1=new Cat("shier");
//       cat1.age=15;
//       cat1.name="罗小白";
//       cat1.color="白色";
//
//        Cat cat2=new Cat(13,"asda");
//        cat2.age=15;
//        cat2.name="罗小黑";
//        cat2.color="黑色";
//
//        cat1.speak();
//        cat1.jiSuan();
//        cat1.jiSuan(90);
//        Person person1 =new Person(15,"你大爷");
//        person1.showInfo();

//        Child ch1=new Child(3,"qq");
//        ch1.jonGane();
//        Child cj2 =new Child(4,"oo");
//        cj2.jonGane();
//
//        System.out.println(ch1.total);



//        Stu stu1=new Stu(11,"li",543);
//        Stu stu2=new Stu(65,"wang",98765);
//        System.out.println(Stu.getTotalFee());

//
//        Clerk clerk1=new Clerk("小王八",14,6000);
//        System.out.println(clerk1.name+clerk1.getSal() );


    }
}

class Child{
        int age;
        String name;
        static int total=0;
        public Child(int age,String name){
            this.age=age;
            this.name=name;
        }
        public void jonGane(){
            total++;
            System.out.println("1个");
        }
}

class Stu{
    int age;
    String name;
    int fee;
    static int totalFee;
    public Stu(int age,String name,int fee){
        this.age=age;
        this.name=name;
        totalFee+=fee;
    }
    //这是一个类方法静态方法

    public static int getTotalFee(){
        return totalFee;
    }
}
class  Cat{
//    类的成员变量
    int age;
    String name;
    String color;
    public  void speak(){
        System.out.println("asdad");
    }
    public  void jiSuan(){
        int result=0;
        for (int i=1;i<1000;i++ ){
            result=result+i;
        }
        System.out.println(result);
    }
    public  void jiSuan(int n){
        int result=0;
        for (int i=1;i<n;i++ ){
            result=result+i;
        }
        System.out.println(result);
    }
    public  Cat (int age,String name){
        age=age;
        name=name;
    }
    public Cat(String name){
        name=name;
    }
}
class  Person{
    int age;
    String name;
    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }
    public  void showInfo(){
        System.out.println(this.name);
    }
}
class Clerk{
    public String name;
    private int age;
    private float salary;
    public Clerk(String name,int age,float sal){
        this.age=age;
        this.name=name;
        this.salary=sal;
    }
    public float getSal(){
        return this.salary;
    }
}
class Dog{
    public  int a;
    protected String name;
     String color;
     private float price;
     private void ab1(){
         System.out.println(a);
     }
}