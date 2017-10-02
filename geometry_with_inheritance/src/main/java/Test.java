public class Test {
    public static void main(String[] args){
        double area, perimeter;

        // test circle with color
        Circle redCircle = new Circle(3.14, "red", true);
        area = redCircle.getArea();
        perimeter = redCircle.getPerimeter();
        printResult(redCircle, area, perimeter);
    }

    public static void printResult(Object object, double area, double perimeter){
        System.out.println(object);
        System.out.println(String.format("Area = %.2f", area));
        System.out.println(String.format("Perimeter = %.2f", perimeter));
    }
}
