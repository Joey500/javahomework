package opdracht;

/**
 * Created by Pavilion on 30-5-2016.
 */
public class Main {
    public static void main(String[] args) {
        INumberVisitor Number = new NumberVisitor();
        Number.onMyInt();
        Number.onMyFloat();

        INumberVisitor[] numb = {new NumberVisitor()};
        for (INumberVisitor a : numb) {
            a.onMyInt();
        }
        }
    }


