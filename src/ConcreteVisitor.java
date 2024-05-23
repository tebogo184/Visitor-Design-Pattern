public class ConcreteVisitor implements AbstractVisitor{
    /**
     * Overridable method that calculates the areaa of a rectangle
     * @param rect -instance of rectangle
     */
    @Override
    public void visit(Rectangle rect) {
        double area=rect.getHeight()* rect.getWeight();

        System.out.printf("Rectangle Area:%s\n",area);
    }

    /**
     * Overridable method that calculates the areaa of a triangle
     * @param triangle - instance of a triangle
     */
    @Override
    public void visit(Triangle triangle) {

        double area=(triangle.getBase()* triangle.getHeight())/2;
        System.out.printf("Triangle Area:%s\n",area);

    }

    /**
     * Overridable method that calculates the areaa of a Circle
     * @param circle -circle instance
     */
    @Override
    public void visit(Circle circle) {
        double area=Math.pow(circle.getRadius(),2);
        System.out.printf("Circle Area:%s\n",area);


    }
}
