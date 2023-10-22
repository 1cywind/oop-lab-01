public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(2, 4);
        System.out.println("Width for the rectangle 1 is: " + rec1.getWidth());
        System.out.println("Height for the rectangle 1 is: " + rec1.getHeight());
        rec1.visualize();

        Rectangle rec2 = new Rectangle(-1, 5);
        System.out.println("Width for the rectangle 2 is: " + rec2.getWidth());
        System.out.println("Height for the rectangle 2 is: " + rec2.getHeight());
        rec2.visualize();

        Rectangle rec3 = new Rectangle(6, 2);
        System.out.println("Width for the rectangle 3 is: " + rec3.getWidth());
        System.out.println("Height for the rectangle 3 is: " + rec3.getHeight());
        rec1.visualize();

        Rectangle rec4 = new Rectangle(3, -3);
        System.out.println("Width for the rectangle 4 is: " + rec4.getWidth());
        System.out.println("Height for the rectangle 4 is: " + rec4.getHeight());
        rec4.visualize();

        Rectangle rec5 = new Rectangle(8, 2);
        System.out.println("Width for the rectangle 5 is: " + rec5.getWidth());
        System.out.println("Height for the rectangle 5 is: " + rec5.getHeight());
        rec5.visualize();
    }
}