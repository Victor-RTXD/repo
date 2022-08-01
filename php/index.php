<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("account.php");
//declarando objetos
$uberX = new UberX("CVB123", new Account("Andres Herrera ", "AND456"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new uberPool(" JAJATL", new Account("Gelipe", "no pares de aprender"), "Porche", "911");
$uberPool->printDataCar();
?>