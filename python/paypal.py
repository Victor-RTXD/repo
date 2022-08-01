from payment import Payment

class Paypal(Payment):
    
    def __init__(self, method):
        super().__init__(method)