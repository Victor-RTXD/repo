class UberX extends Car{
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model) {
        super(license, driver); //user super sugiere parametros principales y llama al metodo constructor de la super clase
        this.brand = brand;
        this.model = model;

    }

    @Override
    void printDataCar() {
        // TODO Auto-generated method stub
        super.printDataCar();
        System.out.println("modelo" + model);
    }
}