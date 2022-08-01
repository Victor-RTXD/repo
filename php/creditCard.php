<?php
require_once('payment.php');
class CreditCard extends Payment {

    public function __construct($id){
        parent::__construct($id);
    }


}
?>