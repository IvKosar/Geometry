public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){}

    public Rectangle(double w, double l){
        this.width = w;
        this.length = l;
    }

    public Rectangle(double w, double l, String c, boolean f){
        this.width = w;
        this.length = l;
        this.setColor(c);
        this.setFilled(f);
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * (width + length);
    }

    public String toString(){
        if (this.isFilled())
            return "Rectangle(" +
                    "width =" + width + "length = " + length + ", filled with color: " + this.getColor()+
                    ")";
        else
            return "Rectangle(" +
                    "width =" + width + "length = " + length +
                    ", filled with no color" +
                    ")";
    }

}
