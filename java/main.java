class main {
    public static void main(String[] args) {

        Car car = new Car("AMQ123", new Account("Andres", "LJKDS"));
        car.passenger = 4;
        car.printDataCar();

        Car beetle = new Car("BFG666", new Account("Victor", "Yeah"));
        beetle.passenger = 4;
        beetle.printDataCar();
    }
        
}
