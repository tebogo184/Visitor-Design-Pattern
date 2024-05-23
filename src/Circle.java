public class Circle implements AbstractVisitable {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Overridable method that allows the visitor to visit the Visitable
     * @param visitor -abstract Visitable instance
     */


    @Override
    public void accept(AbstractVisitor visitor) {

        visitor.visit(this);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
