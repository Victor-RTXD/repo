from car import Car


if __name__ == "__main__":
    print("hello world")
    car = Car()
    car.license = "AMS234"
    car.driver = "Andres Herrera"
    car.passanger = "84"
    print(vars(car))

    beetle = Car()
    beetle.driver = "Victor"
    beetle.license = "BFG666"
    beetle.passanger = 4
    print(vars(beetle))