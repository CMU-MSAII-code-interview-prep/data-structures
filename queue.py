class Queue:

    def __init__(self):
        self.size = 0
        self.cap = 5
        self.front = 0
        self.items = self.make_empty_array(5)
        
    def make_empty_array(self, size):
        return [None for _ in range(size)]

    def get_size(self):
        return self.size

    def is_empty(self):
        return self.get_size() == 0

    def is_at_capacity(self):
        return self.get_size() == self.cap

    def insert(self, value):
        index = (self.size + self.front) % self.cap
        self.items[index] = value
        self.size += 1
        if self.is_at_capacity():
            self.resize()

    def resize(self):
        tmp_items = self.make_empty_array(2*self.cap)
        for i in range(self.cap):
            tmp_items[i] = self.items[(i + self.front) % self.cap]
        self.items = tmp_items
        self.cap *= 2

    def remove(self):
        item = self.items[self.front]
        self.items[self.front] = None
        self.front = (1 + self.front) % self.cap
        self.size -= 1
        return item
            
    def __str__(self):
        string = "["
        for item in self.items:
            if item is None:
                string += "None,"
            else:
                string += str(item) + ","
        string += "]"
        return string


myqueue = Queue()

print(myqueue)

myqueue.insert(1)
myqueue.insert(2)
myqueue.insert(3)
myqueue.insert(4)

print(myqueue)

myqueue.remove()
print(myqueue)
myqueue.remove()
print(myqueue)
myqueue.remove()
print(myqueue)

myqueue.insert(5)
myqueue.insert(6)
myqueue.insert(7)
myqueue.insert(8)

print(myqueue)

