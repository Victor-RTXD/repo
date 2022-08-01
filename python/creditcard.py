from payment import Payment

class CreditCard(Payment):
    
    def __init__(self, method):
        super().__init__(method)