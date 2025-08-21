package MyPackage;

import java.util.Scanner;

// Base Shape Class

class Shape{
    int side;
    int breadth;
    int height;
    float radius ;

    public void setSide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side:");
        this.side = sc.nextInt();
    }

    public void setBreadth(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter breadth:");
        this.breadth = sc.nextInt();
    }
    public void setHeight(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter height:");
       this.height = sc.nextInt();
    }
    public void setRadius(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        this.radius = sc.nextFloat();
    } 
    public int getSide(){
    return side;
    }

    public int getBreadth(){
        return breadth;
        }

    public int getHeight(){
    return height;
    }
    public float  getRadius(){
        return radius;
        }

}

// Square class

class Square extends Shape{
    public Square(){
        super();
    }
    public void Area(){
        System.out.println("Square Area:" +side*side);
    }
    public void Perimeter(){
        System.out.println("Square Perimeter:" +4*side);
    }
    
}

// Rectangle class

class Rectangle extends Shape {

    public Rectangle() {
        super();
    }
    
    public void Area(){
        System.out.println("Rectangle Area:"  +side * breadth);
    }
    public void Perimeter(){
        System.out.println("Rectangle Area:" +2* (side + breadth));
    }
}

// Circle class

class Circle extends Shape {

    public Circle() {
    super();
    }
    public void Area(){
        System.out.println("Circle Area:" +Math.PI * radius * radius );
    }
    public void Perimeter(){
        System.out.println("Circle Perimeter:" +2 * Math.PI * radius );
    }
    
}

// Cylinder class

class Cylinder extends Shape {
    public Cylinder() {
    super();
    }
    public void Volume(){
        System.out.println("Cylinder Volume:" +Math.PI * radius * radius * height );
    }
    public void SurfaceArea(){
        System.out.println("Cylinder Surface Area:" +2 * Math.PI * radius * (radius + height) );
     }
}

// Sphere class

class Sphere extends Shape{

    public Sphere() {
        super();
    }
    public void Volume(){
        System.out.println("Sphere Volume:" +(4/3)*(Math.PI * radius * radius * radius));
    }
    public void SurfaceArea(){
        System.out.println("Sphere Surface Area:" +4 * Math.PI * radius * radius);
    }
}

// Cube class

class Cube extends Shape{

    public Cube() {
        super();
    }
    public void Volume(){
        System.out.println("Cube volume:" + (side * side * side));
    }
    public void SurfaceArea(){
        System.out.println("Cube Surface Area:" +(6 * side * side));
    }
}
    



public class Mini_Project_5_Making_Own_Package{
    public static void main(String[] args) {
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Cylinder Cylinder = new Cylinder();
        Sphere sphere = new Sphere();
        Cube cube = new Cube();

        square.setSide();
        square.Area();
        square.Perimeter();

        /*

        rectangle.setSide();
        rectangle.setBreadth();
        rectangle.Area();
        rectangle.Perimeter();

        circle.setRadius();
        circle.Area();
        circle.Perimeter();

        Cylinder.setRadius();
        Cylinder.setHeight();
        Cylinder.Volume();
        Cylinder.SurfaceArea();

        sphere.setRadius();
        sphere.Volume();
        sphere.SurfaceArea();

        cube.setSide();
        cube.Volume();
        cube.SurfaceArea();

        */
    }
}