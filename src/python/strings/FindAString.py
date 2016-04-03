'''
Created on Apr 2, 2016

@author: Puneeth U Bharadwaj
'''

a = raw_input()
b = raw_input()
count = 0
for i in range(0, len(a)):
    if a[i:].startswith(b):
        count = count + 1
        
print count