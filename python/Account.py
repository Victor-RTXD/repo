class Account:
    id = int
    name = str
    document = str
    password = str
    email = str

    def __init__(self, name, document):   #metodo constructor
        self.name = name   #self en vez de this
        self.document = document



if __name__ == "__main__":
    pass