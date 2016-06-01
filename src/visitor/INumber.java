package visitor;

/**
 * Created by Pavilion on 21-5-2016.
 */
public interface INumber {
    void visit(INumberVisitor visitor);
}
