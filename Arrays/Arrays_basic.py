strings = ['a','b','c','d']
# 4*4 = 16 bytes of storage

# Append 
strings.append('e')    # O(1)

# Pop
strings.pop()         # O(1)

# insert at any given index
strings.insert(0,'x')     # O(n) --> Worst Case

print(strings)