interface Shape {
    void draw();   // abstract method
}

class Circle implements Shape {
    public void draw() {     // must implement method
        System.out.println("Drawing a Circle");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
