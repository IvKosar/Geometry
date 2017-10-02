public class Circle extends Shape {
    private double radius;

    public Circle(){}
    public Circle(double r){
        this.radius = r;
    }

    public Circle(double r, String c, boolean f){
        this.radius = radius;
        this.setColor(c);
        this.setFilled(f);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        if (this.isFilled())
            return "Circle(" +
                "radius =" + radius + ", filled with color: " + this.getColor()+
                ")";
        else
            return "Circle(" +
                    "radius = " + radius + ", filled with no color" +
                    ")";
    }
}
