
class Stack:

    def __init__(self):
        self.items = self.make_empty_array(2)
        self.cap  = 2
        self.size = 0
        
    def make_empty_array(self, size):
        return [None for _ in range(size)]

    def get_size(self):
        return self.size

    def is_empty(self):
        return self.get_size() == 0

    def is_at_capacity(self):
        return self.get_size() == self.cap

    def push(self, value):
        if self.is_at_capacity():
            tmp_list = self.make_empty_array(2 * self.cap)
            for i in range(self.cap):
                tmp_list[i] = self.items[i]
            self.items = tmp_list
            self.cap = 2 * self.cap
        self.items[self.size] = value
        self.size += 1
    
    def pop(self):
        if self.is_empty():
            return None
        self.size -= 1
        item = self.items[self.size]
        return item

if __name__ == "__main__":
    mystack = Stack()

    mystack.push(1)
    mystack.push(2)
    mystack.push(3)
    mystack.push(4)
    mystack.push(5)

    val = mystack.pop()
    print(val)
    val = mystack.pop()
    print(val)
    val = mystack.pop()
    print(val)
    val = mystack.pop()
    print(val)
    val = mystack.pop()
    print(val)
    print(int(99).__hash__())