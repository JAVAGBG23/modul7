public interface Polygon {
    // här talar vi om att vi måste
    void getArea(int length, int breadth);
}

class Rectangle implements Polygon {
    // här talar hur
    public void getArea(int length, int breadth) {
        System.out.println("The area of Rectangle is: " + (length * breadth));
    }
}

class MainShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.getArea(5, 6);
    }
}
