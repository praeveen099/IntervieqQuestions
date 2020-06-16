
def isPalindromeUtil(dupN, n):
    # if n is equal to 0, then we have reached the end of the recursive tree
    if (n ==0):
        return dupN;
    else:
        # we set dupN to be itself divided by 10
        dupN = isPalindromeUtil(dupN, int (n / 10));
    
    # if the last ith digit from the bacj is equal to the ith digit to the 
    # front, then we update dup to be itself divided by 10 to move the current
    # term to the higher power of ten
    if (n%10 == (dupN %10)):
        return int(dupN / 10);    
    # else set dupN to be -1
    else:
        return -1;

def is_palindrome(n):
  # duplicate which we will be checking from the end of the number
  dupN = n;
  if(isPalindromeUtil(dupN, n) != -1):
      return True;
  else:
      return False;
  

print(is_palindrome(1234321));
# True
print(is_palindrome(1234322));
# False