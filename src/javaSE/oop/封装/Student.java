package javaSE.oop.封装;

//高内聚，低耦合

/**
 * 1. 提高数据安全性
 * 2. 隐藏代码的实现细节
 * 3. 统一接口
 * 4. 系统可维护性
 */

public class Student {
    //属性私有
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
}
