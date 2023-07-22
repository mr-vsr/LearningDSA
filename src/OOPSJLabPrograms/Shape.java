package OOPSJLabPrograms;

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public void erase() {
        System.out.println("Erasing a shape");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("Drawing a Triangle");
    }

    public void erase() {
        System.out.println("Erasing a Triangle");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Drawing a Square");
    }

    public void erase() {
        System.out.println("Erasing a Square");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    public void erase() {
        System.out.println("Erasing a Circle");
    }
}

class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        circle.erase();

        Shape square = new Square();
        square.draw();
        square.erase();

        Shape triangle = new Triangle();
        triangle.draw();
        triangle.erase();
    }
}