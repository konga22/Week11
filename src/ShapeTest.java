interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
//        Shape shape1 = new Circle();
//        Shape shape2 = new Rectangle();
//
//        shape1.draw(); // Drawing a Circle
//        shape2.draw(); // Drawing a Rectangle
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("예외 처리");
        } finally {
            System.out.println("항상 실행되는 finally 블록");
        }
    }
}
