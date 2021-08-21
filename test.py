# "1 2 3 4 5 6 7 8 9" - String



s = input()
l = s.split()

print("Before COnverting....")
print(l)

for i in range(len(l)):
    l[i] = int(l[i])
print("After COnverting....")

print(l)