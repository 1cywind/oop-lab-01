public class Rectangle {
    private int width, height;

    public Rectangle(int width, int height) {
        if (width >= 0) {
            this.width = width;
        } else {
            System.out.println("Error: Width is negative. Setting the value to 1");
            this.width = 1;
        }

        if (height >= 0) {
            this.height = height;
        } else {
            System.out.println("Error: Height is negative. Setting the value to 1");
            this.height = 1;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void visualize() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}