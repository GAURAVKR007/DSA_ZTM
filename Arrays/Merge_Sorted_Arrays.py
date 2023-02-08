def mergeSortedArrays(arr1,arr2):

     # Check Input
    if(len(arr1)) == 0:
        return arr2
    if(len(arr2)) == 0:
        return arr1

    resultArr = []
    j = 0
    i = 0

    while True:
        if arr1[i] < arr2[j]:
            resultArr.append(arr1[i])
            i = i + 1
        elif arr1[i] > arr2[j]:
            resultArr.append(arr2[j])
            j = j + 1

        if i>=len(arr1) or j>=len(arr2):
            break

    for k in range(i,len(arr1)):
        resultArr.append(arr1[k])
        i = i + 1

    for k in range(j,len(arr2)):
        resultArr.append(arr2[k])
        j = j + 1

    return resultArr


print(mergeSortedArrays([2,4,6,8,10,77],[1,3,5,7,9,11,15,63]))
