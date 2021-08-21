for test in range(int(input())):
    n = int(input())
    arr = list(map(int,input().split()))
    l = []
    s = sum(arr)
    if(s%2 == 0):
        print(0)
    else:
        for i in arr:
            if i%2 == 1 and i>6:
                print(1)
                break
            elif i == 2 or i==3:
                print(1)
                break
        else:
            print(-1)

        

            
