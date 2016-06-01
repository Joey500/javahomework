package opdracht.Ex3;

/**
 * Created by Pavilion on 30-5-2016.
 */
public class PrettyPrinterIOptionVisitor<T, T1> implements IOptionVisitor<Integer, String> {
    @Override
    public <U> U onSome(Integer value) {
        return (U) value.toString();
    }
    @Override
    public <U> U onNone() {
        return (U) "I am nothing ";
    }
}
