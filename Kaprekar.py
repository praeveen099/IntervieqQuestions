KAPREKAR_CONSTANT = 6174

def kaprekar_recursive(n):
    
    # create an array size 4 which holds the array of numbers
    arrayOfDigits = [0] * 4; 
    
    # insert into the array the numbers using modulus and division operator
    for digitIndex in range (0,4):
        arrayOfDigits[digitIndex] = n % 10
        n = (int) (n / 10)
        
    # sort the array 
    arrayOfDigits.sort()
    
    # make them 0 initially
    desc = 0
    asc = 0
    for index in range (0,4):
        # create descending (smallest) number
        desc = desc * 10 + arrayOfDigits[index]
    
    # loop through the array from index 3 to 0 with iterations -1 each time
    for index in range(3, -1, -1):
        asc = asc * 10 + arrayOfDigits[index]
   
    # result of the asc subtracted by the largest number  
    subtractValue = asc - desc
    
    if (subtractValue == KAPREKAR_CONSTANT):
        return 1
    else: 
        return kaprekar_recursive(subtractValue) + 1

# driver code
def num_kaprekar_iterations(n):
    return kaprekar_recursive(n)


print(num_kaprekar_iterations(123))
# 3
# Explanation:
#  3210 - 123 = 3087
#  8730 - 0378 = 8352
#  8532 - 2358 = 6174 (3 iterations)