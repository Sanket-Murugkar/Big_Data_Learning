import sys

sys.path.append("/home/itelligence/Desktop/Python")

from xyz import sqr
#import sqr
import first_module as fm

fm.greet("Hello")
print(fm.value)

print (sqr.sqr(3))

print(imp.find.module("sqr"))
