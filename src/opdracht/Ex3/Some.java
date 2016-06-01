package opdracht.Ex3;

/**
 * Created by Pavilion on 30-5-2016.
 */
public class Some<T> implements IOption<T>{
    private T value;
    public Some(T value) {
        this.value = value;

    }

    public <U> U visit(IOptionVisitor<Integer, Integer> visitor) {
        return visitor.onSome((Integer) this.value);
    }
}
