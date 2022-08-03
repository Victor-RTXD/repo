import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    
    public UberVan(String license, Account driver) {
        super(license, driver); //user super sugiere parametros principales y llama al metodo constructor de la super clase
    }

    @Override
    public void setPassengers(int passenger) {
        // TODO Auto-generated method stub
        // con esto se aplica el comportamiento del metodo padre: super.setPassengers(passenger);
        if(passenger == 6) {
            this.passenger = passenger;
        }else{
            System.out.println("necesitas asignar 4 pasajeros");
        }
    }
}
