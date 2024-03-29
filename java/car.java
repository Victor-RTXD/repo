class Car {
    private int id;
    private String license;
    private Account driver;
    protected Integer passenger;
    
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    
}
