import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var visitor=new ConcreteVisitor();

    List<AbstractVisitable> visitables=new ArrayList<>();

    visitables.add(new Circle(16));
    visitables.add(new Rectangle(13,46));
    visitables.add(new Triangle(23,45));

    visitables.forEach(visitable->visitable.accept(visitor));




    }
}