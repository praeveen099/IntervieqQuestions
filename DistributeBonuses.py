bonuses=[]
def getBonuses(performance):
  # Fill this in.'
  bonus=1
  
  for x in range(0, len(performance)):
      
      if x == 0:
          if performance[x] > performance[x+1]:
              bonuses.insert(x,bonus+1)
          else:
              bonuses.insert(x,bonus)
      elif x == len(performance) - 1:
          if performance[x] > performance[x-1]:
              bonuses.insert(x,bonus+1)
          else:
              bonuses.insert(x,bonus)
      else:
          if (performance[x] > performance[x+1]) and (performance[x] > performance[x-1]):
              bonuses.insert(x,bonus+2)
          elif (performance[x] < performance[x+1]) and (performance[x] < performance[x-1]):
              bonuses.insert(x,bonus)
          else:
              bonuses.insert(x,bonus+1)
        
  return bonuses


print(getBonuses([1, 2, 3, 2, 3, 5, 1]))
# [1, 2, 3, 1, 2, 3, 1]