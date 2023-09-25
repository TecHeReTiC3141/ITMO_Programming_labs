package poks;

import attacks.ShadowPunch;
import attacks.ThunderWave;
import ru.ifmo.se.pokemon.*;

public class Krookodile extends Pokemon {
    public Krookodile(String name, int level) {
        super(name, level);
        this.setType(new Type[]{Type.DARK, Type.GROUND});
        this.setStats(
                95, 117, 80,65,70,92
        );
        this.addMove(new ShadowPunch());
        this.addMove(new ThunderWave());

    }
}
