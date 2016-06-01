package visitor;

/**
 * Created by Pavilion on 21-5-2016.
 */
public class NumberVisitor implements INumberVisitor{

    @Override
    public void onInt(MyInt number) {
        System.out.println("Found a float and now?");}

    @Override
    public void onFloat(MyFloat number) {
        System.out.println("Found an int and now?!");
    }

    @Override
    public void onInt() {
        System.out.println("Found a float and now?");}
    }
