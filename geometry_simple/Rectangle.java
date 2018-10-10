public class Rectangle{
    private double length;
    private double width;
    private String color;
    
    public Rectangle(double l, double w, String c){
        this.length = l;
        this.width = w;
        this.color = c;
    }
    
    public double getLength(){
        return length;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public String getColor() {
       return color;
   }

   public void setColor(String color) {
       this.color = color;
   }
    
    
    public double findSquare(){
        return length * width;
    }
    
    public double findPerimeter(){
        return 2 * (length + width);
    }
    
    public void draw(){
        System.out.print("*"*length);
    }
    
    @Override
     public String toString() {
           return "Rectangle(" +
                   "length= " + length +  " width= " + width + " color= " + color +
                   ")";
     }
}
