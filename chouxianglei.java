public class chouxianglei {
    public static void main(String [] args){

    }
}
//这就是一个抽象类
abstract class Ani {
    String name;
    int age;
    abstract public void cry();
}
//当一个类继承的父类是抽象的 需要我们吧抽象类中的所有抽象方法实现
class CAt extends Ani{
    //实现父类的cry
    public void cry(){
        System.out.println("喵喵叫");
    }
}