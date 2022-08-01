from array import array
from car import Car
class UberVan(Car):
    typecaraccepted = []
    seatsMaterial = []

    def __init__(self, license, driver, typecaraccepted, seatsMaterial):
        super().__init__(license, driver)
        self.typecaraccepted = typecaraccepted
        self.seatsMaterial = seatsMaterial