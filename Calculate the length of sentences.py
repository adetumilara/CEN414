def findLen(str):
    counter = 0   
    for i in str:
        counter += 1
    return counter
 
 
str = "I am a boy"
print(findLen(str))
str = "I am a girl"
print(findLen(str))
str = "I am a man"
print(findLen(str))
str = "I am a woman"
print(findLen(str))
