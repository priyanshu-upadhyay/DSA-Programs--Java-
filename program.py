s = input()

d = []
for i in s:
    if i=='a' or i=='e' or i=='i' or i=='o' or i=='u' or i=='y':
        d.append(i)

if d ==[]:
    pass
else:

    print(".",end="")
print(".".join(d))