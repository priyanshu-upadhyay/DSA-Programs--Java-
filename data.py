
import mysql.connector as a
mydb = a.connect(host="localhost", user="root",
                 password="admin", database="employee")


def npersonal():
    n = input("Enter Employee Name:")
    c = input("Enter Employee's City Name:")
    d = input("Enter Employees's D.O.B:")
    p = input("Enter Employees Phone:")
    data = (n, c, d, p)
    sql = 'insert into personal values(%s,%s,%s,%s)'
    c = mydb.cursor()
    c.execute(sql, data)
    con.commit()
    print("Data Entered Successfully")
    main()


def personal():
    sql = "select * from personal"
    c = mydb.cursor
    c.execute(sql)
    d = c.fetchall()
    for i in d:
        print(i)
    main()


def noffice():
    ec = input("Enter Employee Code:")
    n = input("Enter Employee Name:")
    ps = input("Enter Employee Post:")
    j = input("Enter Employee's Joining Date:")
    bp = int(input("Enter Assigned Salary:"))
    data = (ec, n, ps, j, bp)
    sql = 'insert into office values(%s,%s,%s,%s)'
    c = mydb.cursor()
    c.execute(sql, data)
    con.commit()
    print("Data Entered Successfully")
    main()


def office():
    sql = "select * from office"
    c = mydb.cursor()
    c.execute(sql)
    d = c.fetchall()
    for i in d:
        print(i)
    main()


def nsalary():
    ec = input("Enter Employee Code:")
    v = (ec,)
    sql = "select BasicPay from office where BCode=%s"
    c = con.cursor()
    c.execute(sql, v)
    bs = c.fetchone()
    n = input("Enter Employee Name:")
    y = input("Enter Year:")
    m = input("Enter Month:")
    wd = int(input("Enter working Days:"))
    td = int(input("Enter Total Days:"))
    fp = bs[0]/td*w
    data = (ec, n, y, m, wd, td, fp)
    sql = 'insert into salary values(%s,%s,%s,%s)'
    c = mydb.cursor
    c.execute(sql, data)
    con.commit()
    print("Data Entered Successfully")
    main()


def salary():
    sql = "select * from salary"
    c = mydb.cursor()
    c.execute(sql)
    d = c.fetchall()
    for i in d:
        print(i)
    main()


def main():
    print("""
   1. Add New Employee Personal Details
   2. Display Employees Personal Details
   3. Add New Employee Office Details
   4. Display Employees Office Details
   5. Enter Salary Details of Employee
   6. Display Salary Details of Employee""")
    choice = input("Enter Task No:")
    while True:
        if(choice == '1'):
            npersonal()
        elif(choice == '2'):
            personal()
        elif(choice == '3'):
            noffice()
        elif(choice == '4'):
            office()
        elif(choice == '5'):
            nsalary()
        elif(choice == '6'):
            salary()
        else:
            print("Wrong choice..........")


main()
