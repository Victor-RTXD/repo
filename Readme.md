# Poo en java
### definir clases den java
`Class Car (recuerda que las clases deben estar en mayuscula)`
### heredando:
`Class UberX extends Car`
#### Recuarda que el encapsulamiento hace inviolable e inaterable metodos, atributos o clases en poo.
recuerda que generalmente el encapsulamiento son metodos de acceso como el publico, default, privado y protegido
### Ejemplo de metodo constructor de Java (son los requerimentos para que un objeto pueda existir:
`public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }`
## los atributos pueden ser definidos debajo de la declaracion de la clase
## Es importante tener cada clase en un archivo diferente y para crear objetos, hacerlo en un archivo main o index
## recuerda que los getters y setters sirven para poder acceder a atributos que estan encapsulados, o fuera de alcance como los privados
`public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }`