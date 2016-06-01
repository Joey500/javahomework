package opdracht.Ex3;

/**
 * Created by Pavilion on 30-5-2016.
 */
public interface IOptionVisitor<T,U> {


    <U> U onSome(T value);
    <U>U onNone();
}
