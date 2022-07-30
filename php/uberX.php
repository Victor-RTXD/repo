<?php
class UberX extends Car {
    public $brand;
    public $model;

    public function __construct($license,$driver, $brand, $model) {
        parent::__construct($license, $driver);
        $this->model = $model;
        $this->brand = $brand;
    }
    
    public function printData() {
        echo "Licencia: $this->license Driver: ".$this->driver.name;
    }
}

?>