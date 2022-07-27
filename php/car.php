<?php
class Car
{
    // Declaración de una propiedad
    public $id = int;
    public $driver = string;
    public $license = string;
    public $passenger = int;

    // Declaración de un método
    public function __construct($driver, $license)
    {
        $this->driver = $driver;
        $this->license = $license;
    }
}
?>