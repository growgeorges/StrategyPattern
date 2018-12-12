package Implementation.FlyBehaviors;

import API.IFlyBehavior;

public class ImplFlyStraight implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly straight ahead");
    }
}
