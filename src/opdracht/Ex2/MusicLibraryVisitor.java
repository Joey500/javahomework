package opdracht.Ex2;

/**
 * Created by Pavilion on 30-5-2016.
 */
import java.util.ArrayList;
import java.util.List;
public class MusicLibraryVisitor implements IMusicLibraryVisitor {

    public List<HeavyMetal>heavyMetal=new ArrayList<>();
    public List<Jazz> jazz= new ArrayList<>();

    @Override
    public void onHeavyMetal(HeavyMetal song) {
        heavyMetal.add(song);
    }

    @Override
    public void onJazz(Jazz song) {
        jazz.add(song);
    }
}
