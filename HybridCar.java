class HybridCar implements GasolineEngine, ElectricMotor {

    public void refuel() {
        System.out.println("Refueling the gasoline engine");
    }

    public void recharge() {
        System.out.println("Recharging the electric motor");
    }

    public void drive() {
        System.out.println("Hybrid car is driving");
    }

    public static void main(String[] args) {
        HybridCar car = new HybridCar();
        car.refuel();
        car.recharge();
        car.drive();
    }
}