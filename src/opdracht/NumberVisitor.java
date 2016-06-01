package opdracht;

/**
 * Created by Pavilion on 31-5-2016.
 */
public class NumberVisitor implements INumberVisitor {
    @Override
    public void onMyInt() {
        System.out.println("Found a int");
    }

    @Override
    public void onMyFloat() {
        System.out.println("Found a float");
    }
    }

