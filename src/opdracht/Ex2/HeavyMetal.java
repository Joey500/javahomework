package opdracht.Ex2;

/**
 * Created by Pavilion on 30-5-2016.
 */
public class HeavyMetal implements ISong {
    String title;

    public HeavyMetal(String title) {
        this.title = title;
    }

    @Override
    public void visit(IMusicLibraryVisitor visitor) {
        visitor.onHeavyMetal(this);
    }
}
