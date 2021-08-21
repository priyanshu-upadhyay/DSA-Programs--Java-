# Stack Operation
#  1 - Push 
#  2 - Pop
#  3 - Display
#  4 - Peek     (Top Element of the Stack)



# .................STARTING.......................
# ................................................



stack = []                  # List of Stack
top = -1                    # or None 


def push(stack):
    global top
    item = int(input("Enter the Element: "))
    stack.append(item)
    top = top + 1 

def pop(stack):
    global top
    if stack == []:
        print("Stack is Empty...... (Or Underflow)")
    else:
        print("Deleted Element:",stack.pop())
        top = top - 1

def peek(stack):
    if stack == []:
        print("Stack is Empty.")
    else:
        print("Top of the Stack:",stack[top])
    

def display(stack):
    if stack == []:
        print("Stack is Empty.")
    else:
        print("\n\n......Stack.......\n")  # Ignore
        for i in range(top,-1,-1):
            print(stack[i])
        print("\n..................\n\n")  # Ignore

# Starting of the Program..

while(True):
    print(".......STACK OPERATIONS........")
    print("1 - PUSH")
    print("2 - POP")
    print("3 - DISPLAY")
    print("4 - PEEK (Top Element of the Stack)")
    print("5 - Exit from the System")
    ch = int(input("Enter Your Choice (1-5): "))

    if ch == 1:
        push(stack)
    elif ch == 2:
        pop(stack)
    elif ch == 3:
        display(stack)
    elif ch == 4:
        peek(stack)
    elif ch == 5:
        exit(0)      # We can also use Break
    else:
        print("Invaild Choice")
