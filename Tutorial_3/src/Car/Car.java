package Car;

public class Car {
    private String licensePlate;
    private double speed; // kilometers per hour
    private double maxSpeed; // kilometers per hour
    // constructors
    public Car(String licensePlate1, double maxSpeed1) {
        this.licensePlate = licensePlate1;
        this.speed = 0.0;
        if (maxSpeed1 >= 0.0) {
            maxSpeed = maxSpeed1;
        }
        else {
            maxSpeed = 0.0;
        }
    }
    public Car(String licensePlate1, double maxSpeed1, double speed1){
        this.licensePlate = licensePlate1;
        this.speed = speed1;
        if (maxSpeed1 >= 0.0) {
            maxSpeed = maxSpeed1;
        }
        else {
            maxSpeed = 0.0;
        }
        if (speed1 < 0){
            speed = 0;
        }
        if (speed1 > maxSpeed1){
            speed = maxSpeed1;
        }
    }
    public void print(){
        System.out.println("Current Speed: "+ speed);
        System.out.println("Maximum Speed: "+ maxSpeed);
        System.out.println("License Plate: "+licensePlate);
    }
}
