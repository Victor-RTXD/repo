<?php
require_once('car.php');
class UberVan extends Car {
    public $brand;
    public $model;
    public $typeCarAccepted = array();
    public $seatsMaterial = array();


    public function __construct($license,$driver, $brand, $model) {
        parent::__construct($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
    }
}

?>