from array import array
from car import Car
class UberBlack(Car):
    typecaraccepted = []
    seatsMaterial = []

    def __init__(self, license, driver,typecaraccepted, seatsMaterial):
        super().__init__(license, driver)
        self.typecaraccepted = typecaraccepted
        self.seatsMaterial = seatsMaterial