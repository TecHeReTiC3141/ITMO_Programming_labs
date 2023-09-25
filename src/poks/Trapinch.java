package poks;

import attacks.ShadowPunch;
import attacks.SonicBoom;
import attacks.ThunderWave;
import ru.ifmo.se.pokemon.*;

public class Trapinch extends Pokemon {
    public Trapinch(String name, int level) {
        super(name, level);
        this.addType(Type.GROUND);
        this.setStats(
                45, 100, 45,45,45,10
        );
        this.addMove(new ShadowPunch());
        this.addMove(new ThunderWave());

    }
}
