import random
import sys

n=int(sys.argv[1])
m=int(sys.argv[2])

f=open('lakedata.txt','w')
for i in range(0,n):
	for j in range(0,m):
		if random.randint(0,1)==0:
			print('W',end='')
			f.write('W')
		else:
			print('.',end='')
			f.write('.')
	print('\n',end='')
	f.write('\n')
f.close()
