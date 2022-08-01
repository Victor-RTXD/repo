<?php
require_once('payment.php');
class Paypal extends Payment {

    public function __construct($id){
        parent::__construct($id);
    }


}
?>