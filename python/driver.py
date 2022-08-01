from account import Account

class Driver(Account):
    password = str
    email = str

    def __init__(self, name, document):
        super().__init__(name, document)