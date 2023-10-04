package scripts.attacks;

import ru.ifmo.se.pokemon.*;
public class Endeavor extends PhysicalMove {

    public Endeavor() {
        super(Type.NORMAL, 5, 100);
    }

    @Override
    protected String describe() {
        return "уравнивает здоровье";
    }


}
