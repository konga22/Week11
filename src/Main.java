public class Main {
    public static void main(String[] args) {
        Car2 car2 = new Car2("blue","테슬라");
        System.out.println(car2.color);
    }
}
    class Car2 {
        String color;
        String maker;
        Car2(String color, String maker) {
            this.color = color;
            this.maker = maker;
        }
    }
