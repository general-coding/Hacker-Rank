'''
Created on Jan 30, 2016

@author: Puneeth
'''

n = int(raw_input())
students = {}
for i in range(0, n):
    name, maths, physics, chemistry = raw_input().split()
    students[name] = []
    students[name].append(float(maths))
    students[name].append(float(physics))
    students[name].append(float(chemistry))
    average = (float(maths) + float(physics) + float(chemistry))/3.0
    students[name].append(average)

student = raw_input()
print "%.2f" % students[student][3]