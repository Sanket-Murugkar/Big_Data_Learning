a="Hello"
print(a*3)

print(a[0])

## String negative index
print(a[-1])

##String Slicing- Works with index only.
##output is ell as starts with 1, ends at 3. Last index is not inclusive

print(a[1:4])
print(a[2:5])



## Comparison Operator
  ## Compares Ascii value, Starts with first chartacter.. Expect result at first non matching charatcer
print("hello"<"jello")


## In Operator - Checks first substring present in next string or not
print("e" in a)
print("x" in a)

print("e" not in a)
print("x" not in a)
#######Escape Sequence########################################


print("Hello \\ World")
print("Hello \' World")
print("Hello \" World")

#\b removes last character before this sequence character
print("Hello\bWorld")

a="a\b"+"bc"+"cd"
print(a) #op bccd

# For Formatting as new paragraph
print("Hello\fWorld")

#For new line character
print("Hello\nWorld")


#For tab character
print("Hello\tWorld")
th


#################String Function###############################

s="hello"
print(s.upper())
T="HELLLO"
print(s.lower())

# Count - No of occurence of character
print(s.count("l"))


print(s.replace("l","w"))





