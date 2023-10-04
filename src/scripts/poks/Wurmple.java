package scripts.poks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import scripts.attacks.BatonPass;
import scripts.attacks.Endeavor;
import scripts.attacks.SleepTalk;
import scripts.attacks.TripleKick;

public class Wurmple extends Pokemon {

    public Wurmple(String name, int level) {
        super(name, level);
        this.addType(Type.BUG);
        this.setStats(
                45, 45, 35,20,30,20
        );
        this.addMove(new TripleKick());
        this.addMove(new BatonPass());
        this.addMove(new Endeavor());
        this.addMove(new SleepTalk());

    }

}
