package visitor;

/**
 * Created by Pavilion on 21-5-2016.
 */
public class main {
    public static void main(String []args){
        INumberVisitor number =new NumberVisitor();
        number.onInt();
    }
}
