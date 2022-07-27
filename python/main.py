from hashlib import new
from car import Car
from account import Account

if __name__ == "__main__":
    print("hello world")

    car = Car("AMS234", Account("Andres H", "Gelipe"))
    print(vars(car))
    print(vars(car.driver))