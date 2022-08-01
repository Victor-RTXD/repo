class Payment:
    id = int
    method = str

    def __init__(self, method):
        self.method = method