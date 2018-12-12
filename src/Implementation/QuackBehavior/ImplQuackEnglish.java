package Implementation.QuackBehavior;

import API.IQuackBehavior;

public class ImplQuackEnglish implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}
