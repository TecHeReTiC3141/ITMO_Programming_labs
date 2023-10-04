package scripts.attacks;


import ru.ifmo.se.pokemon.*;
public class SonicBoom extends SpecialMove {

    public SonicBoom() {
        super(Type.NORMAL, 20, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, 20);
    }

    @Override
    protected String describe() {
        return "быстро взрывается";
    }
}
