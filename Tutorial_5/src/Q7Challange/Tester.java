package Q7Challange;

public class Tester {
    public static void main(String[] args) {
        Clock clock = new Clock();
        System.out.println("Local Time: "+clock.getTime());
        clock.setAlarm(16,30);
        System.out.println(clock.isAlarmRing());


        WorldClock worldClock = new WorldClock(4);
        System.out.println(worldClock.isAlarmRing());
        //Because of worldClock inherits the clock class we can simply call to the isAlarmRing() method using worldClock object.
    }
}
