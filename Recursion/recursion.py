""" 


fib(n) = fib(n-1) + fib(n-2)


"""

def fib(n):
    """ 
    calculates the n-th fibonacci number

    n          1   2   3   4   5
    fib(n)     1   1   2   3   5

    """
    if n <= 2:
        return 1

    return fib(n - 1) + fib(n - 2)
    

def factorial(n):
    """ 
    N! = N * (N -1) * (N - 2) * ... * 2 * 1
    """
    if n == 0:
        return 1
    return n * factorial(n - 1)


def pow_tail(base, exponent):
    if exponent == 0:
        return 1
    return base * pow_tail(base, exponent - 1)



def pow_head(base, exponent, result = 1):
    if exponent == 0:
        return result
    return pow_head(base, exponent - 1, result * base)
 
""" 
return 16

"""



def tribonacci(n):
    pass

def linked_list_delete(list, k):
    pass

def linked_list_delete_tail(list, k):
    pass

