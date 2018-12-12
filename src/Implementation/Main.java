package Implementation;

import Implementation.DisplayBehavior.ImplDisplayFront;
import Implementation.FlyBehaviors.ImplFlyInReverse;
import Implementation.FlyBehaviors.ImplFlyZigZag;
import Implementation.QuackBehavior.ImplQuackEnglish;
import Implementation.QuackBehavior.ImplQuackFrench;

public class Main {

    public static void main(String[] args) {
        Duck duck1 = new Duck(new ImplQuackFrench(), new ImplFlyInReverse(), new ImplDisplayFront());

        duck1.fly();
        duck1.display();
        duck1.quack();

        Duck duck2 = new Duck(new ImplQuackEnglish(), new ImplFlyZigZag(), new ImplDisplayFront());

        duck2.fly();
        duck2.display();
        duck2.quack();

    }
}
