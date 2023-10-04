package scripts.attacks;
import ru.ifmo.se.pokemon.*;


public class TripleKick extends PhysicalMove {

    public TripleKick() {
        super(Type.FIGHTING, 10, 90, 0, 3);

    }

    @Override
    protected String describe() {
        return "наносит тройной удар";
    }
}
