package poks;


import attacks.TripleKick;
import attacks.ShadowPunch;
import attacks.HydroPump;
import ru.ifmo.se.pokemon.*;

public class Swablu extends Pokemon {
    public Swablu(String name, int level) {
        super(name, level);
        this.setType(Type.FLYING, Type.NORMAL);
        this.setStats(
                45, 40, 60,40,75,50
        );
        this.addMove(new TripleKick());
        this.addMove(new ShadowPunch());
        this.addMove(new HydroPump());

    }
}
