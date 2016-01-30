'''
Created on Jan 30, 2016

@author: Puneeth
'''

a = int(raw_input())
b = int(raw_input())

x = (a,b)
y = tuple(reversed(x))
print y[0]
print y[1]