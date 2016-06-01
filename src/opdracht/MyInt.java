package opdracht;

/**
 * Created by Pavilion on 31-5-2016.
 */
public class MyInt implements INumber{

    @Override
    public void visit(INumberVisitor input) {
        input.onMyInt();
    }
}
