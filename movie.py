for test in range(int(input())):
    n,s = map(int,input().split())
    l = []
    for i in range(n):
        g,r = map(int,input().split())
        if g<=s:
            l.append(r)
    print(max(l))