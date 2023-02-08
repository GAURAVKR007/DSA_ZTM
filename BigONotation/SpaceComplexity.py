def booo(n):
    for i in range(n):
        print("boooo!")

booo(5) # O(1)

def arrayOfHiTimes(n):
    hiArray = []
    for i in range(n):
        hiArray.append('hi')

    return hiArray

print(arrayOfHiTimes(7))  # O(n)