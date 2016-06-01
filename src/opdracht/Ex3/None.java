package opdracht.Ex3;

/**
 * Created by Pavilion on 30-5-2016.
 */
public class None<T> implements IOption<T>{
    @Override
    public <U> U visit(IOptionVisitor<Integer, Integer> visitor) {
        return visitor.onNone();
    }
}
