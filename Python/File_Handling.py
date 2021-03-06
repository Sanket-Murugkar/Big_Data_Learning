## file object=open(file_name [,access_mode] [,buffer_size])
# [] paraeters are optional


## File Read Mode
file_obj = open("/home/itelligence/Desktop/Python/text.txt")
print (file_obj.read())
file_obj.close() 


#### In Write mode #####
# If file not present , it will create if file not exist-- "w" write mode
file_obj = open("/home/itelligence/Desktop/Python/text1.txt", "w")
file_obj.write("Hello")
file_obj.close()

# If file present , it will rewrite the file 
file_obj = open("/home/itelligence/Desktop/Python/text1.txt", "w")
file_obj.write("Hello World")
file_obj.close()

#Access Mode, will append the data
file_obj = open("/home/itelligence/Desktop/Python/text1.txt", "a")
file_obj.write("Hello World , this is append call")
file_obj.close()


########### Buffering #############

#Client Server Programming

#0 no buffering
#1 Line buffering
#>1 Buffer size(Memory)
#<0 Default Behaviour




######Access Specifier#############



file_obj = open("/home/itelligence/Desktop/Python/text1.txt", "r")
file_obj.write("Hello")
file_obj.close()

file_obj = open("/home/itelligence/Desktop/Python/text1.txt", "r+")
file_obj.write("Hello")
file_obj.close()


file_obj = open("/home/itelligence/Desktop/Python/text1.txt", "w")
file_obj.write("Hello")
file_obj.close()

file_obj = open("/home/itelligence/Desktop/Python/text1.txt", "w+")
file_obj.write("Hello")
file_obj.close()


file_obj = open("/home/itelligence/Desktop/Python/text1.txt", "a")
file_obj.write("Hello")
file_obj.close()

file_obj = open("/home/itelligence/Desktop/Python/text1.txt", "a+")
file_obj.write("Hello")
file_obj.close()


######

file_obj = open("/home/itelligence/Desktop/Python/text1.txt", "a+")
file_obj.seek("Hello")
file_obj.close()







