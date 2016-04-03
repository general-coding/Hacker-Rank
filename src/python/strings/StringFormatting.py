'''
Created on Apr 3, 2016

@author: Puneeth U Bharadwaj
'''

n = int(raw_input())
w = len(str(bin(n)).replace('0b',''))

for i in xrange(1, n+1):
    b = bin(int(i)).replace('0b','').rjust(w, ' ')
    o = oct(int(i)).replace('0','', 1).rjust(w, ' ')
    h = hex(int(i)).replace('0x','').upper().rjust(w, ' ')
    j = str(i).rjust(w, ' ')
    print j, o, h, b