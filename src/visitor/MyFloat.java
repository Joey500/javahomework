package visitor;

/**
 * Created by Pavilion on 21-5-2016.
 */
public class MyFloat implements INumber {
    @Override
    public void visit(INumberVisitor visitor) {

        visitor.onFloat(this);
    }
}
