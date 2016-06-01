package opdracht.Ex3;

/**
 * Created by Pavilion on 30-5-2016.
 */
public class IntPrettyPrinterIOptionVisitor implements IOptionVisitor<Integer,String> {

    @Override
    public String onSome(Integer value) {
        return value.toString();

    }

    @Override
    public String onNone() {
        return "I am nothing";
    }
}
