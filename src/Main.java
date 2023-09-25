import ru.ifmo.se.pokemon.*;

import java.util.Arrays;

import poks.Wurmple;
import poks.Swablu;
import poks.Raticate;
import poks.Krookodile;
import poks.Trapinch;
import poks.Vibrava;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon ally1 = new Wurmple("Вурмпле", 5);
        Pokemon ally2 = new Swablu("Сваблю", 8);
        Pokemon ally3 = new Raticate("Батиката", 6);

        Pokemon foe1 = new Krookodile("Крукудил", 4);
        Pokemon foe2 = new Trapinch("Трапинч", 9);
        Pokemon foe3 = new Vibrava("Вибрара", 6);
        b.addAlly(ally1);
        b.addAlly(ally2);
        b.addAlly(ally3);

        b.addFoe(foe1);
        b.addFoe(foe2);
        b.addFoe(foe3);
        b.go();
    }
}