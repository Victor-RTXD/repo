<?php
class UberBlack extends Car {
    public $brand;
    public $model;
    public $typeCarAccepted = array();
    public $seatsMaterial = array();


    public function __construct($license,$driver, $brand, $model, $typeCarAccepted, $seatsMaterial) {
        parent::__construct($license, $driver);
        $this->model = $model;
        $this->brand = $brand;
        $this->typeCarAccepted = typeCarAccepted;
        $this->seatsMaterial = seatsMaterial;
    }
    
    public function printData() {
        echo "Licencia: $this->license Driver: ".$this->driver.name;
    }
}

?>