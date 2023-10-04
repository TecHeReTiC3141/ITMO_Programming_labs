package scripts.attacks;

import ru.ifmo.se.pokemon.*;

public class SleepTalk extends StatusMove {

    public SleepTalk() {
        super(Type.NORMAL, 0, 0);
    }

    protected void applySelfEffects(Pokemon p) {
        if (p.getCondition() == Status.SLEEP) {
            p.setMod(Stat.ATTACK, 1);
        }
    }

    @Override
    protected String describe() {
        return "Бьет во сне";
    }

}
