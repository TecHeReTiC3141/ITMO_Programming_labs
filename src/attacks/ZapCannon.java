package attacks;

import ru.ifmo.se.pokemon.*;
public class ZapCannon extends SpecialMove {

    public ZapCannon() {
        super(Type.ELECTRIC, 120, 50);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.paralyze(pokemon);
    }

    @Override
    protected String describe() {
        return "стреляет из пушки";
    }
}
