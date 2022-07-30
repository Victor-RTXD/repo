from hashlib import new
from car import Car
from account import Account

if __name__ == "__main__":
    print("hello world")

    car = Car("AMS234", Account("Andres H", "Gelipe"))#declarando nuevos objetos
    print(vars(car))
    print(vars(car.driver))

    beetle = Car("LGTM", Account("Victor al cuadrado", "27887"))
    print(vars(beetle))
    print(vars(beetle.driver))