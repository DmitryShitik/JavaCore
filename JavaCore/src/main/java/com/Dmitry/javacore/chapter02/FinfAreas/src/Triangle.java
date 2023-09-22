public class Triangle extends Figure{
    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        System.out.println("Треугольник");
        return dim1*dim2/2;
    }
}
