
## List  [1,3]   ->mutable   Ordered
## touple (2,3)  ->immutable

## Dictionary  key,value ->immutable  , Unordered
#key must be immutable- String , number ,touple
#value mutable-         String , number ,touple,list,dictionary



list1=list([1,2,3,4,5])

list2=[1,2,3]

list3=[]


## type() - Data type 
print(type(list1))

#3 Indexing and slicing
print(list1[2])

print(list1[-3])


##Apend And Extend

list1.append([6,7,8])

list2.extend([7,8,9])


print(list1)

print(list2)


#####Nested Lists###

list4=[[1,2,],[3,4]]

print(list4[1][1])


##Index and Remove###

list5=[5,98,5,212,74]

print(list5.index(74))

list5.remove(5)

print(list5)

###############################








