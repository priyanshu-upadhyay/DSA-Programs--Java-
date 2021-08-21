for test in range(int(input())):
    u,v,a,s = map(int,input().split())
    vel = (abs(u*u - 2*a*s))**(1/2)
    
    
    # print(vel)
    if(vel<=v):
        print("Yes")
    else:
        print("No")