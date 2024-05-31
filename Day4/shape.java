import java.util.ArrayList;

abstract class Shape {
    abstract public void draw();
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("Draw Function of Rectangle");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Draw Function of Circle");
    }
}

class Test {
    public void listDraws(ArrayList<? extends Shape> list) {
        for (Shape shape : list)
            shape.draw();
    }
}

class Main {
    public static void main(String[] args) {
        // Creating an ArrayList of Shape
        ArrayList<Shape> shapeList = new ArrayList<>();
        Rectangle rect = new Rectangle();
        Circle clc = new Circle();

        shapeList.add(rect);
        shapeList.add(clc);
        shapeList.add(rect);
        shapeList.add(clc);

        // Creating an ArrayList of Rectangle
        ArrayList<Rectangle> rectangleList = new ArrayList<>();
        rectangleList.add(rect);
        rectangleList.add(rect);

        // Testing the generic method with both ArrayLists
        Test t = new Test();
        t.listDraws(shapeList);
        t.listDraws(rectangleList);
    }
}
