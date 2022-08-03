<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("account.php");
require_once("uberVan.php");
//declarando objetos
$uberX = new UberX("CVB123", new Account("Andres Herrera ", "AND456"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new uberPool(" JAJATL", new Account("Gelipe", "no pares de aprender"), "Porche", "911");
$uberPool->printDataCar();

$uberVan = new UberVan("OJL395", new Account("Raúl Ramírez", "AND456"), "Nissan", "Versa");
$uberVan->setPassenger(4);
$uberVan->printDataCar();
?>