import ru.ifmo.se.pokemon.*;

import poks.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Wurmple ally1 = new Wurmple("Вурмпле", 5);
        Swablu ally2 = new Swablu("Сваблю", 8);
        Raticate ally3 = new Raticate("Батиката", 6);

        Krookodile foe1 = new Krookodile("Крукудил", 4);
        Trapinch foe2 = new Trapinch("Трапинч", 9);
        Vibrava foe3 = new Vibrava("Вибрара", 6);
        b.addAlly(ally1);
        b.addAlly(ally2);
        b.addAlly(ally3);

        b.addFoe(foe1);
        b.addFoe(foe2);
        b.addFoe(foe3);
        b.go();
    }
}