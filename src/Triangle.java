public class Triangle {
    private int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public String verify() {
        if (a + b <= c || b + c <= a || a + c <= b) {
            return "Not Triangle";
        } else {
            if (a == b && b == c) {
                return "Equilateral Triangle";
            } else if (a == b || b == c || c == a) {
                return "Isosceles Triangle";
            } else {
                return "Scalene Triangle";
            }
        }
    }
}