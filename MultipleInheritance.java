interface A {
    void showA();
}

interface B {
    void showB();
}

class Example implements A, B {   // Multiple Inheritance
    public void showA() {
        System.out.println("Inside A");
    }
    public void showB() {
        System.out.println("Inside B");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.showA();
        obj.showB();
    }
}
