'''
Created on Apr 2, 2016

@author: Puneeth U Bharadwaj
'''

import textwrap

s = raw_input()
n = int(raw_input())

print textwrap.fill(s, n)