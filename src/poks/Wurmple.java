package poks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.TripleKick;
import attacks.SleepTalk;
import attacks.Endeavor;
import attacks.BatonPass;

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
