'''
Created on Jul 22, 2015

@author: puneeth

Problem Statement
Sets Symmetrics Difference
https://www.hackerrank.com/challenges/sets
'''

t_or_f = True

a = raw_input()
a_list = raw_input().split()
for i in a_list:
    try:
        x = int(i)
    except ValueError:
        t_or_f = False

if t_or_f:
    a_set = list(map(int, a_list))

b = raw_input()
b_list = raw_input().split()
for i in b_list:
    try:
        x = int(i)
    except ValueError:
        t_or_f = False

if t_or_f:
    b_set = list(map(int, b_list))
    
final_list_ab = list(set(a_set) - set(b_set))
final_list_ba = list(set(b_set) - set(a_set))
final_list = set(a_set).symmetric_difference(set(b_set))
final_list.sort()

for item in final_list:
    print item