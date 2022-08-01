from payment import Payment

class Cash(Payment):

    def __init__(self, method):
        super().__init__(method)