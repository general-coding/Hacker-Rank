'''
Created on Apr 2, 2016

@author: Puneeth U Bharadwaj
'''

s = raw_input()

result = ' '

for c in s:
    print c
    if c.islower():
        result = result + c.upper()
        print "lower " + result
    elif c.isupper():
        result = result + c.lower()
        print "upper " + result
    else:
        result = result + c
        print "others " + result           

print result.strip()