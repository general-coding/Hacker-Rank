'''
Created on Jul 22, 2015

@author: puneeth

Problem Statement
Lists
https://www.hackerrank.com/challenges/python-lists
'''

n = int(raw_input())
l = []
 
for i in range(0, n):
    input = raw_input().split()
    
    command = input[0]
    
    if command == 'append':
        value = int(input[1])
        l.append(value)
        
    if command == 'insert':
        index, value = int(input[1]), int(input[2])
        l.insert(index, value)
        
    if command == 'remove':
        value = int(input[1])
        l.remove(value)
        
    if command == 'pop':
        l.pop()
        
    if command == 'index':
        value = int(input[1])
        l.index(value)
    
    if command == 'count':
        value = int(input[1])
        l.count(value)
    
    if command == 'sort':
        l.sort()
    
    if command == 'reverse':
        l.reverse()
    
    if command == 'print':
        print l