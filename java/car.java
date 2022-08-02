class Car {
    int id;
    String license;
    Account driver;
    private Integer passenger;
    
    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        if(passenger != null) {
            System.out.println("License: " + license + " Driver: " + driver.name + " Passengers: " + passenger);
        }
        }

    public int getPassengers() {//getter
        return passenger;
    }

    public void setPassengers(int passenger) {//setter
        if(passenger == 4) {
            this.passenger = passenger;
        }else{
            System.out.println("necesitas asignar 4 pasajeros");
        }
             
    }
}
