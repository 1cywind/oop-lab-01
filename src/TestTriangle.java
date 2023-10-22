public class TestTriangle {
    public static void main(String[] args) {
        Triangle tri = new Triangle(2, 3, 3);
        System.out.println("The length of the first side is: " + tri.getA());
        System.out.println("The length of the second side is: " + tri.getB());
        System.out.println("The length of the third side is: " + tri.getC());

        System.out.println(tri.verify());
    }
}