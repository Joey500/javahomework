package opdracht.Ex3;

/**
 * Created by Pavilion on 30-5-2016.
 */
public interface IOption<T> {
    <U> U  visit(IOptionVisitor<Integer, Integer> visitor);


}
