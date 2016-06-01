package opdracht;

import visitor.*;

/**
 * Created by Pavilion on 31-5-2016.
 */
public interface INumber {
    void visit(INumberVisitor input);
}
