public class Vehicle {
    int currentSpeed;
    String make;
    String model;

    int accelerate() {

        this.currentSpeed += 5;
        return this.currentSpeed;
    }
    

    String honk() {
        return "HONNNK";
    }
}
