package lv.rvt;

public class Box {

    private double width;
    private double height;
    private double length;
    private double side;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side) {
        this.side = side;
    }

    public Box(Box oldBox) {
        this.width = oldBox.getWidth();
        this.length = oldBox.getLength();
        this.height = oldBox.getHeight();
    }
    public Box biggerBox( Box oldBox ) {
        return new Box( 1.25 * oldBox.getWidth(), 1.25 * oldBox.getHeight(), 1.25 * oldBox.getLength() );
    }

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double getLength() {
        return length;
    }


   

    public double volume() {
        return width * height * length;
    
    }
    private double faceArea() {
        return width * height;
    }
    private double sideArea() {
        return length * height;
    }
    private double topArea() {
        return width * length;
    }


    
    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ; 
    }



public boolean nests( Box outsideBox )

}