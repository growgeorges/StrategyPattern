package Implementation.QuackBehavior;

import API.IQuackBehavior;

public class ImplQuackFrench implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("Coin Coin");
    }
}
