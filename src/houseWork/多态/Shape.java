package houseWork.多态;

class circle extends Shape{
    double R;
    final double PI = Math.PI;
    public circle(double r) {
        R = r;
    }
    public double getArea(){
        return Math.pow(PI*R,2);
    }
    public double getLength(){
        return 2*PI*R;
    }
}

class rectangle extends Shape{
    double X;
    double Y;
    public rectangle(int x, int y) {
        this.X = x;
        this.Y = y;
    }
    public double getArea(){
        return X*Y;
    }
    public double getLength(){
        return (X+Y)*2;
    }
}

class Shape {
    double S;
    double L;
    public double getArea(){
        return this.S;
    }
    public double getLength(){
        return this.L;
    }

    public static void main(String[] args) {
        rectangle r1 = new rectangle(2, 3);
        System.out.println("长方形["+r1.X+","+r1.Y+"]的面积为："+r1.getArea());
        System.out.println("长方形["+r1.X+","+r1.Y+"]的周长为："+r1.getLength());
        circle c1 = new circle(2);
        System.out.println("半径为"+c1.R+"的圆面积为："+c1.getArea());
        System.out.println("半径为"+c1.R+"的圆周长为："+c1.getLength());

        //多态
        Shape s1 = new rectangle(3,4);
        Shape s2 = new circle(3);
        if (s1 instanceof rectangle){
            System.out.println("s1属于长方形");
        }else {
            System.out.println("s1属于圆形");
        }
    }
}
