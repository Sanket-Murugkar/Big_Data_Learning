4,m,,,# Three types : OS, SYS, 

# OS Module:

#import os

#print os.getcwd()

#print os.listdir("D:\BigData\Python")

#os.mkdir("D:\BigData\Python\NewDir")

#os.remove("D:\BigData\Python\\abc.txt")  # only file 

#os.rename("D:\BigData\Python\NewDir","D:\BigData\Python\RenameDir")

#os.rmdir("D:\BigData\Python\RenameDir")

# sys module

'''import sys

print (sys.copyright)

print (sys.maxsize) #py_sszie_t 

print (sys.path)

print (sys.getrecursionlimit())  # setrecrusionlimit'''

# Time module

import time

print (time.clock())

# print the time taken to print the 1 to 1000 nos. into list,tuple and dict

'''dict_value = {}

for i in range(1000):
	dict_value[i]= i
'''
print time.ctime()

'''for i in range (6):
	time.sleep(i)
	print(i)'''


print time.ctime(time.time())


