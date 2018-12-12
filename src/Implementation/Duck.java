package Implementation;

import API.IDisplayBehavior;
import API.IFlyBehavior;
import API.IQuackBehavior;

public class Duck {
    IQuackBehavior qb;
    IFlyBehavior fb;
    IDisplayBehavior db;

    public Duck(IQuackBehavior qb, IFlyBehavior fb, IDisplayBehavior db) {
        this.qb = qb;
        this.fb = fb;
        this.db = db;
    }

    public void fly() {
        fb.fly();
    }

    public void quack() {
        qb.quack();
    }

    public void display() {
        db.display();
    }


}
