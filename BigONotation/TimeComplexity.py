nemo = ['nemo']
everyone = ['dory','bruce','marlin','nemo','gill','bloat','nigel','squirt','darla','hank']
boxes = ['a','b','c','d','e']

large = ["nemo" for x in range(10)]

def linear(array):
    for i in range(len(array)):
        if 'nemo' in array[i]:
            print("Found Nemo!")

def constant(array):
    print(array[0])


def compressBoxesTwice(boxes,boxes2):
    for i in boxes:
        print(boxes[i])

    for i in boxes2:
        print(boxes2[i])

def logAllPairs(array):
    for i in range(len(array)):
        for j in range(len(array)):
            print(f"[{array[i]},{array[j]}] ",end="")
        print("")

def printNumPairs(array):
    print("These are the numbers : ",end="")
    for i in range(len(array)):
        print(f"{array[i]} ",end="")

    print("\nThese are All Pairs sum : ")
    for i in range(len(array)):
        for j in range(len(array)):
            sum_pair = array[i] + array[j]
            print(f"[{array[i]} + {array[j]} => {sum_pair}] ",end="")
        print("")

# linear(large)    # 0(n)  --> Linear time
# constant(nemo)   # 0(1)  --> Constant time
# compressBoxesTwice([1,2,3],[4,5,6,7,8])  # O( n + m )  --> different times cause both inputs have different values

# logAllPairs(boxes)    # O(n^2)  --> qudratic time
# printNumPairs([1,2,3,4,5])   # O(n^2)  --> quadratic time  because O(n^2) is dominant