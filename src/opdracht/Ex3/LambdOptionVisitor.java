package opdracht.Ex3;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by Pavilion on 31-5-2016.
 */
public class LambdOptionVisitor<T, U> implements IOptionVisitor<T, U>  {
    Function<T, U> onSome;
    Supplier<U> onNone;

    public LambdOptionVisitor(Function<T, U> onSome, Supplier<U> onNone) {
        this.onSome = onSome;
        this.onNone = onNone;
    }



    public U onNone() {
        return onNone.get();
    }

    @Override
    public <U1> U1 onSome(T value) {
        return null;
    }
}
