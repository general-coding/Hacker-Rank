'''
Created on Jul 22, 2015

@author: puneeth

Problem Statement
List Comprehensions
https://www.hackerrank.com/challenges/list-comprehensions
'''

x = int(raw_input())
y = int(raw_input())
z = int(raw_input())
n = int(raw_input())

a = []
# for i in range(0, x + 1):
#     for j in range(0, y + 1):
#         for k in range(0, z + 1):
#             if (i + j + k) != 2:
#                 a.append([i, j, k])
# 
# print a

a = [[i, j, k] for i in range(0, x + 1) for j in range(0, y + 1) for k in range(0, z + 1) if i + j + k != n]

print a