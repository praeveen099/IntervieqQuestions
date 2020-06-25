class Node(object):
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right

def getLevel(root, val, level):      
    # the base cases
    # if the root of the tree does not exist,
    #then return 0 as the level of node
    if (root == None):
        return 0
    # if the root is the node we are looking for,
    # return the level
    if (root.value == val):
        return level
        
    # check the left of the tree for the node
    downLevel = getLevel(root.left, val, level +1)
        
    # if downLevel not returned 0, we return that level
    if (downLevel != 0):
        return downLevel
    
    # else we go through the right of the tree
    return getLevel(root.right, val, level +1)

def printCousins(root, val, levelOfValue):
    # if the root is non existent or the levelOfValue
    # is less than 2, meaning that it does not have any cousins,
    # return empty string
    if (root == None or levelOfValue < 2):
        return 
    
    # if the level is equal to 2, print out the children if 
    # the value is not one of the children
    if (levelOfValue == 2):
        if (root.left != None): 
            if (root.left.value == val):
                return
        if (root.right != None):
            if (root.right.value == val):
                return
        if (root.left):
            print(root.left.value, end = " ")
        if (root.right):
            print(root.right.value, end = " ")
    # else if we are still much higher up the tree from
    # the value
    elif (levelOfValue > 2):
        printCousins(root.right, val, levelOfValue - 1)
        printCousins(root.left, val, levelOfValue - 1)



def list_cousins(root, val):
     levelOfValue = (getLevel(root,val,1))
     # now we go through the tree to look for the couseins
     printCousins(root, val, levelOfValue)
     

#     1
#    / \
#   2   3
#  / \   \
# 4   6   5
root = Node(1)
root.left = Node(2)
root.left.left = Node(4)
root.left.right = Node(6)
root.right = Node(3)
root.right.right = Node(5)

list_cousins(root, 5)
# [4, 6]
