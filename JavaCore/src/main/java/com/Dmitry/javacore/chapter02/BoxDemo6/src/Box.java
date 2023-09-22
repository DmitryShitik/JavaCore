public class Box {
    double width;
    double height;
    double depth;

    public Box() {
        System.out.println(" Конструирование объекта Вох");
        width = 10;
        height = 10;
        depth = 10;
    }
    double volume () {
        return width * height * depth;
    }
}
