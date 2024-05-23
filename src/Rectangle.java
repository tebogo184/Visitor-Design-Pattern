public class Rectangle implements AbstractVisitable{

    private double weight;
    private double height;

    public Rectangle(double height,double width) {
        this.height = height;
        this.weight=width;
    }

    /**
     * Overridable method that allows the visitor to visit the Visitable
     * @param visitor -abstract Visitable instance
     */
    @Override
    public void accept(AbstractVisitor visitor) {
        visitor.visit(this);

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
