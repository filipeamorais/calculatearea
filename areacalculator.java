interface CalculableArea{
    double CalculateArea();
}

class Square implements CalculableArea{
    private int side;

    public Square (int side){
        this.side = side;
    }

    public double CalculateArea(){
        return this.side * this.side;
    }
}

class Rectangle implements CalculableArea {
    private int width;
    private int height;

    public Rectangle (int width, int height){
        this.width = width;
        this.height = height;
    }

    public double CalculateArea() {
        return this.width * this.height;
    }
}

class Circle implements CalculableArea {
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    public double CalculateArea() {
        return Math.PI * radius * radius;
    }
}

class Test{
    public static void main (String[] args){
        CalculableArea a = new Rectangle(3, 2);
        System.out.println(a.CalculateArea());
    }
}