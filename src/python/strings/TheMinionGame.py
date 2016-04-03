'''
Created on Apr 3, 2016

@author: Puneeth U Bharadwaj
'''

s = raw_input()

max_score = (len(s) * (len(s) + 1)) / 2

kevin = 0
stuart = 0

vowels = ['A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u']

for i in range(len(s)):
    if s[i] in vowels:
        kevin = kevin + (len(s) - i)
    else:
        stuart = stuart + (len(s) - i)
        
if kevin > stuart:
    print "Kevin", kevin
elif kevin < stuart:
    print "Stuart", stuart
else:
    print "Draw"