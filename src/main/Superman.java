package main;

public class Superman extends Kryptonian implements Flyer{

    private String SupermanName;
    private int supermanAge;
    private float supermanSpeed;

    public Superman(String supermanName, int supermanAge, float supermanSpeed) {
        SupermanName = supermanName;
        this.supermanAge = supermanAge;
        this.supermanSpeed = supermanSpeed;
    }

    public String getSupermanName() {
        return SupermanName;
    }

    public void setSupermanName(String supermanName) {
        SupermanName = supermanName;
    }

    public int getSupermanAge() {
        return supermanAge;
    }

    public void setSupermanAge(int supermanAge) {
        this.supermanAge = supermanAge;
    }

    public float getSupermanSpeed() {
        return supermanSpeed;
    }

    public void setSupermanSpeed(int supermanSpeed) {
        this.supermanSpeed = supermanSpeed;
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off Superman");
    }

    @Override
    public void land() {
        System.out.println("Landing Superman");
    }

    @Override
    public void fly() {
        System.out.println("Flying Superman");
    }
    public void leapBuilding(){
        System.out.println("Leaping Superman");
    }
    public void stopBullet(){
        System.out.println("Stopping Superman");
    }

    @Override
    public String toString() {
        return "Superman{" +
                "SupermanName='" + SupermanName + '\'' +
                ", supermanAge=" + supermanAge +
                ", supermanSpeed=" + supermanSpeed +
                '}';
    }
}
