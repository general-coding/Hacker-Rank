'''
Created on Apr 2, 2016

@author: Puneeth U Bharadwaj
'''

a = raw_input()
i, c = raw_input().split()

l = list(a)
l[int(i)] = c

result = ''.join(l)

print result 