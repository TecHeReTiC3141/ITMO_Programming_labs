package scripts.poks;


import scripts.attacks.TripleKick;
import scripts.attacks.ShadowPunch;
import scripts.attacks.HydroPump;
import scripts.attacks.Barrier;
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
