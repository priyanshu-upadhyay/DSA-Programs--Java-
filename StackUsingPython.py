top = -1

def push(stk):
    global top
    item = int(input("Enter the Value: "))
    stk.append(item)
    top = len(stk) - 1

def pop(stk):
    global top
    if stk == []:
        print("Stack is Empty")
    else:
        print("\nThe deleted element:",stk.pop())
        if len(stk) == 0:
            top = -1
        else:
            top = len(stk) - 1
    
def display(stk):
    global top
    if stk == []:
        print("Stack is Empty")
    else:
        for i in range(top,-1,-1):
            print(stk[i], end=" ")
    print("\n")


# main function

stk = []

while True:
    print("\n\n-----Stack Operation-----\n")
    print("1- PUSH")
    print("2- POP")
    print("3- DISPLAY")
    print("4- Exit")
    ch = int(input("Enter Your Choice(1-5):"))

    if ch == 1:
        push(stk)
    elif ch == 2:
        pop(stk)
    elif ch == 3:
        display(stk)
    elif ch == 4:
        exit(0)  
    else:
        print("Invaild Operation")




