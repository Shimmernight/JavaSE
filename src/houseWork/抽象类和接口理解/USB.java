package houseWork.抽象类和接口理解;

interface Lighting {//苹果接口
    String type = "苹果";
    void getLighting();
}

interface Type_c{//安卓插口
    String type = "安卓";
    void getType_c();
}

//手机
abstract class Phone{
    int power;//电量
    String type;//手机类型

    public Phone(int power, String type) {
        this.power = power;
        this.type = type;
    }

    public void getPower(){
        System.out.println("当前电量为："+this.power+"%");
    }
    public void Play(){
        System.out.println("正在使用"+type+"手机");
    }
}

//安卓手机
class android extends Phone implements Type_c{

    public android(int power) {
        super(power, Type_c.type);
    }

    @Override
    public void getType_c() {
        System.out.println("使用Type-C插头充电中...");
    }
}
//苹果手机
class iphone extends Phone implements Lighting {

    public iphone(int power) {
        super(power, Lighting.type);
    }

    @Override
    public void getLighting() {
        System.out.println("使用Lighting插头充电中...");
    }
}


class Test1{
    public static void main(String[] args) {
        android phone1 = new android(10);
        iphone phone2 = new iphone(50);
        phone1.Play();
        phone1.getPower();
        phone1.getType_c();
        System.out.println();
        phone2.Play();
        phone2.getPower();
        phone2.getLighting();

    }
}

