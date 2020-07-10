def first_recurring_char(s):
  # First convert the string into a character list
  listOfString = list(s)
  
  # initialise a set to hold the characters
  setToHoldCharacters = set()
  # we loop through the list of strings
  for character in listOfString:
      # if the character is already in the set, return the character
      if character in setToHoldCharacters:
          return character
      # else add the character into the set
      else: 
          setToHoldCharacters.add(character)
  # outside the for loop, if we have not had any characters repeat
  # return none
  return None      
  
  
  
print(first_recurring_char('qwertty'))
# t

print(first_recurring_char('qwerty'))
# None