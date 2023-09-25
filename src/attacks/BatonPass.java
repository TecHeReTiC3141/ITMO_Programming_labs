package attacks;
import ru.ifmo.se.pokemon.*;

public class BatonPass extends StatusMove {

    public BatonPass() {
        super(Type.NORMAL, 0, 0);
    }

    protected void applySelfEffects(Pokemon p) {
        p.restore();
    }

    @Override
    protected String describe() {
        return "убирает все эффекты";
    }
}
