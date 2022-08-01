from time import strftime
from account import Account

class User(Account):
    password = str
    email = str

    def __init__(self, name, document):
        super().__init__(name, document)