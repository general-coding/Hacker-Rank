'''
Created on Jul 22, 2015

@author: puneeth

Problem Statement
Find second largest number in a list
https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list
'''

n = int(raw_input())
a = raw_input().split()
b = list(map(int, a))
x = max(b)
c = []
for i in range(0, len(b)):
    if b[i] != x:
        c.append(b[i])

y = max(c)

print y
