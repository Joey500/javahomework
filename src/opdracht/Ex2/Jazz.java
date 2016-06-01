package opdracht.Ex2;

/**
 * Created by Pavilion on 30-5-2016.
 */
public class Jazz implements ISong {

    String title;

    public Jazz(String title) {
        this.title = title;
    }
    @Override
    public void visit(IMusicLibraryVisitor visitor) {
        visitor.onJazz(this);
    }


}
