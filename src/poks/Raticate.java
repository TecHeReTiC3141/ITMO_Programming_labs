package poks;


import attacks.TripleKick;
import attacks.ShadowPunch;
import attacks.HydroPump;
import attacks.Barrier;
import ru.ifmo.se.pokemon.*;

public class Raticate extends Pokemon {
    public Raticate(String name, int level) {
        super(name, level);
        this.addType(Type.NORMAL);
        this.setStats(
                55, 81, 60,50,75,97
        );
        this.addMove(new TripleKick());
        this.addMove(new ShadowPunch());
        this.addMove(new HydroPump());
        this.addMove(new Barrier());

    }
}
