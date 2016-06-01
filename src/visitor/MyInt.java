package visitor;

/**
 * Created by Pavilion on 21-5-2016.
 */
public class MyInt implements INumber {
    public void visit(INumberVisitor visitor) {

        visitor.onInt(this);
    }
}
