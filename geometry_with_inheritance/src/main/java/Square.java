public class Square extends Rectangle {
    private double side;

    public Square(){}
    public Square(double s){
        this.side = s;
    }

    public Square(double s, String c, boolean f){
        this.side = s;
        this.setColor(c);
        this.setFilled(f);
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side = side;
    }

    @Override
    public double getArea(){
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter(){
        return 4 * side;
    }

    @Override
    public String toString(){
        if (this.isFilled())
            return "Square(side = " +
                    side + ", filled with color: " + this.getColor() +
                    ")";
        else
            return "Square(side = " +
                    side + ", filled with no color " +
                    ")";
    }
}
