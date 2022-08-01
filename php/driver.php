<?php
require_once("account.php");
class Driver extends Account {
    public $email;
    public $password;

    public function __construct($email, $password, $name, $document) {
        parent::__construct("$name, $document");
        $this->email = $email;
        $this->password = password;
    }
}

?>