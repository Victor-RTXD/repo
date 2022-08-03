class main {
    public static void main(String[] args) {

        UberX uberX = new UberX("666", new Account("Gelipe", "no tiene"), "Camaron", "el mio");
        uberX.setPassengers(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("LSJF", new Account("Jon", "documetnos"));
        uberVan.setPassengers(6);
        uberVan.printDataCar();



        /*Car beetle = new Car("BFG666", new Account("Victor", "Yeah"));
        beetle.passenger = 4;
        beetle.printDataCar(); */
    }
        
}
