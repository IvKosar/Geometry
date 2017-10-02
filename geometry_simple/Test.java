class Test{
    public static void main(String[] args){
        double area, perimeter;
        
        // create object of circle
        Circle circle = new Circle(5.6, "red");
        area = circle.findSquare();
        perimeter = circle.findPerimeter();
        printResults(circle, area, perimeter);
        
        // create object of rectangle
        Rectangle rectangle = new Rectangle(1.4, 4.5, "blue");
        area = rectangle.findSquare();
        perimeter = rectangle.findPerimeter();
        printResults(rectangle, area, perimeter);
        
        // create object of square
        Square square = new Square(5.5, "blue");
        area = square.findSquare();
        perimeter = square.findPerimeter();
        printResults(square, area, perimeter);
    }
    
    public static void printResults(Object obj, double area, double perimeter){
        System.out.println(obj);
        System.out.println(String.format("Area = %.2f", area));
        System.out.println(String.format("Perimeter = %.2f", perimeter));
    }
}
