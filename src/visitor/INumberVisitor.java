package visitor;

/**
 * Created by Pavilion on 21-5-2016.
 */
public interface INumberVisitor {
    void onInt(MyInt number);

    void onFloat(MyFloat number);

    void onInt();
}
