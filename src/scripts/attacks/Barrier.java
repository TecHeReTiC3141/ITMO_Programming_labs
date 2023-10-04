package scripts.attacks;

import ru.ifmo.se.pokemon.*;

public class Barrier extends StatusMove {

    public Barrier() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.DEFENSE,
                (int) pokemon.getStat(Stat.DEFENSE) + 2);
    }

    @Override
    protected String describe() {
        return "создает барьер";
    }
}
