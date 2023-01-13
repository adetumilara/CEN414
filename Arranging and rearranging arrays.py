
list = ['dog','cat', 'elephant', 'zebra', 'bee', 'fish', 'dolphin']
for i in range(0,len(list)):
    for j in range(0,len(list)):
        if (list[j] > list[i]):
            temp= list[i]
            list[i]= list[j]
            list[j]= temp
    
print(list)

for i in range(0,len(list)):
    for j in range(0,len(list)):
        if (list[j] < list[i]):
            temp= list[i]
            list[i]= list[j]
            list[j]= temp
    
print(list)


 
