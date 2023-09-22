public class Rectangle extends Figure{

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        System.out.println("Четырехугольник");
        return dim1*dim2;
    }
}
