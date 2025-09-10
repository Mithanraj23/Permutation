n=int(input("Enter a number: "))
r=int(input("Enter r value: "))
def fact (n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * fact(n - 1)
result = fact(n) // fact(n - r)
print("Permutation is:", result)