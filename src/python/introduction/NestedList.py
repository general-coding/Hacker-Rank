'''
Created on Jul 27, 2015

@author: puneeth

Problem Statement:
Nested list
https://www.hackerrank.com/challenges/nested-list
'''

n = int(input())
input_list = list()
for i in range(n):
    a = []
    a.append(str(input()))
    a.append(float(input()))
    input_list.append(a)

all_marks = []
for i in range(0, len(input_list)):
    all_marks.append(input_list[i][1])
  
min_marks_1 = min(all_marks)
marks = []
for i in range(0, len(all_marks)):
    if min_marks_1 != all_marks[i]:
        marks.append(all_marks[i])
  
min_marks_2 = min(marks)
  
student = []
for i in range(0, len(input_list)):
    if min_marks_2 == input_list[i][1]:
        student.append(input_list[i][0])
  
student.sort()
  
for i in range(len(student)):
    print(student[i])