<?php
class Account
{
    // Declaración de una propiedad
    public $id = int;
    public $email = string;
    public $password = string;
    public $name = string;
    public $document = string;

    // Declaración de un método
    public function __construct($document, $name)
    {
        $this->name = $name;
        $this->document = $document;
    }
}
?>