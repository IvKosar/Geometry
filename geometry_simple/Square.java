class Square{
    private double side;
    private String color;
    
    public Square(double a, String c){
        this.side = a;
        this.color = c;
    }
    
    public double getSide(){
        return side;
    }
    
    public void setSide(double side){
        this.side = side;
    }
    
    public String getColor(){
       return color;
   }

   public void setColor(String color) {
       this.color = color;
   }

    public double findSquare(){
        return Math.pow(side, 2);
    }
    
    public double findPerimeter(){
        return 4 * side;
    }
    
    @Override
     public String toString() {
           return "Square(" +
                   "side= " + side + " color= " + color +
                   ")";
     }
}
