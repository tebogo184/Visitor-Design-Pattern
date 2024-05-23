public class Triangle implements AbstractVisitable{

    private double height;
    private double base;

    public Triangle(double height,double base) {
        this.height = height;
        this.base=base;
    }


    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Overridable method that allows the visitor to visit the Visitable
     * @param visitor -abstract Visitable instance
     */
    @Override
    public void accept(AbstractVisitor visitor) {
        visitor.visit(this);
    }
}
