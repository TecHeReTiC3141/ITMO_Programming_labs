package poks;

import attacks.ShadowPunch;
import attacks.SonicBoom;
import attacks.ThunderWave;
import attacks.ZapCannon;
import ru.ifmo.se.pokemon.*;

public class Vibrava extends Pokemon {
    public Vibrava(String name, int level) {
        super(name, level);
        this.setType(Type.GROUND, Type.DRAGON);
        this.setStats(
                50, 70, 50,50, 50,70
        );
        this.addMove(new ShadowPunch());
        this.addMove(new SonicBoom());
        this.addMove(new ThunderWave());
        this.addMove(new ZapCannon());

    }
}
