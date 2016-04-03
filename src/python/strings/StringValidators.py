'''
Created on Apr 2, 2016

@author: Puneeth U Bharadwaj
'''

a = raw_input()

for e in ['isalnum','isalpha','isdigit','islower','isupper']: 
    print(any(getattr(c,e)() for c in a))