package Implementation.FlyBehaviors;

import API.IFlyBehavior;

public class ImplFlyInReverse implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly in reverse");
    }
}

