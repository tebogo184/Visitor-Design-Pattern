public interface AbstractVisitor {

    void visit(Rectangle rect);
    void visit(Triangle triangle);

    void visit(Circle circle);
}
