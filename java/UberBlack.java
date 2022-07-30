import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    
    public UberBlack(String license, Account driver, String brand, String model, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(license, driver); //user super sugiere parametros principales y llama al metodo constructor de la super clase
        this.seatsMaterial = seatsMaterial;
        this.typeCarAccepted = typeCarAccepted;
    }
}
