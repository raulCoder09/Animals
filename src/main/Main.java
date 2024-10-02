package main;

public class Main {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Airbus","Screamer",2024);
        Bird swallow = new Bird();
        Superman iMere = new Superman("Raul",34,110.0f);


//------------------------------------plane------------------------------------
        plane.takeOff();
        plane.fly();
        plane.land();
//------------------------------------bird------------------------------------
        swallow.takeOff();
        swallow.fly();
        swallow.land();
        swallow.buildNest();
        swallow.layEggs();
        swallow.eat();
//------------------------------------iMere------------------------------------
        iMere.takeOff();
        iMere.fly();
        iMere.land();
        iMere.leapBuilding();
        iMere.stopBullet();
        iMere.eat();
    }
}
