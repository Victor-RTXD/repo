class UberPool extends Car{
    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model) {
        super(license, driver); //user super sugiere parametros principales y llama al metodo constructor de la super clase
        this.brand = brand;
        this.model = model;

    }
}