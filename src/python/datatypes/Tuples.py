'''
Created on Jul 22, 2015

@author: puneeth

Problem Statement
Tuples
https://www.hackerrank.com/challenges/python-tuples
'''

n = int(raw_input())
t = tuple(map(int, raw_input().split()))

print hash(t)