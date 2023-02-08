def reverse(str1):

    # Check Input 
    
    if len(str1) < 2 or not isinstance(str1,str):
        return "Not good"

    string = list(str1)
    for i in range(int(len(str1)/2)):
        temp = string[len(str1) - (i+1)]
        string[len(str1) - (i+1)] = string[i]
        string[i] = temp

    final_str = ""
    print(string)
    for i in range(len(string)):
        final_str += string[i]
    return final_str


print(reverse("RacecaR"))