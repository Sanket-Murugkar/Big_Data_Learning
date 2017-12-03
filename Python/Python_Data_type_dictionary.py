## Dictionary  key,value ->immutable  , Unordered
#key must be immutable- String , number ,touple
#value mutable-         String , number ,touple,list,dictionary


stuff= {'name':'abc','age':39,'height':12*6,'hobby':('a','b'),'interest':['b','c'],'location':{'state':'India'}}

print(stuff)

print(stuff['name'])
print(stuff['age'])

stuff['city']="Pune"

stuff['city']="Pune1"

print(stuff['city'])

print(stuff.keys())

print(stuff.values())

print(stuff.items())
