package houseWork.求三角形面积;

/**
 * 海龙公式：已知三条边求面积
 * S = (p(p-a)(p-b)(p-b))开根号
 * 其中 p=(a+b+c)/2
 */
public class 求三角形面积{
    public static void main(String[] args) {

        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 2), new Point(2, 0));
        System.out.println("三角形的周长为："+triangle.getLength());
        System.out.println("三角形的面积为："+triangle.getArea());
    }
}


class Triangle extends Shape{
    Point p1;
    Point p2;
    Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    //求三角形周长
    public double getLength(){
        double A = new Line(p1,p2).getPointLength();
        double B = new Line(p1,p3).getPointLength();
        double C = new Line(p3,p2).getPointLength();
        return A+B+C;
    }

    //求面积（海龙公式）
    public double getArea(){
        double A = new Line(p1,p2).getPointLength();
        double B = new Line(p1,p3).getPointLength();
        double C = new Line(p3,p2).getPointLength();
        double p = (A+B+C)/2;
        return Math.sqrt(p*(p-A)*(p-B)*(p-C));
    }

}

class Line extends Shape{
    Point a;
    Point b;

    public Line(Point a,Point b){
        this.a = a;
        this.b = b;
    }

    //求两点长度
    public double getPointLength(){
        return Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2));//两点距离公式
    }
}


class Point extends Shape{
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Shape {

}
