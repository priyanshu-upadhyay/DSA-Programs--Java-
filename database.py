from os import system
import mysql.connector as mcon
from tabulate import tabulate

print("Welcome to DIVPRIYA Hospital....")

while True:
    print("1- New patient")
    print("2- Switch patient")
    print("3- Search patients")
    print("4- Current patients")
    print("5- Outed patients")
    print("6- Total Number of Doctors")
    print("7- Search Doctors")
    print("8- Exit from system")

    choice = int(input("enter your choice from above(1-6): "))

    con = mcon.connect(host="localhost", user="root", password="admin", database="hospital")

    curobj = con.cursor()

    if choice == 1:
        srno = int(input("Enter the patient srno : "))
        Name = input("Enter the patient name: ")
        Age = int(input("Enter the patient age: "))
        Phno = input("Enter the phone number: ")
        ward = input("Enter the ward name: ")
        address = input("Enter the address: ")
        query = "insert into patient values( {},'{}',{},'{}','{}','{}')".format(srno, Name, Age, Phno, ward, address)
        curobj.execute(query)
        con.commit()

    if choice == 2:
        srno = input("Enter the patient srno.: ")
        option = 1
        if option == 1:
            ward = input("enter the ward name: ")
            query = "update patient set ward='{}' where srno={}".format(
                ward, srno)
        curobj.execute(query)
        con.commit()
        print("...The patient is transferred to another ward successfully...")


    if choice == 3:
        print("Press 1 to search via srno: ")
        print("press 2 to search via Name: ")
        print("Press 3 to search via ward: ")


        option = int(input("enter your choice from above(1-3): "))

        if option == 1:
            srno = int(input("enter the patient number: "))
            query = "select * from patient where srno = {}".format(srno)
            curobj.execute(query)
            print(tabulate(curobj.fetchall()))


        elif option == 2:
            Name = input("enter the patient name: ")
            query = "select * from patient where Name = '{}'".format(Name)
            curobj.execute(query)
            print(tabulate(curobj.fetchall()))


        elif option == 3:
            ward = input("enter the ward name: ")
            query = "select * from patient where ward = '{}'".format(ward)
            curobj.execute(query)
            print(tabulate(curobj.fetchall()))

        else:
            print("Invalid choice..")
        
    if choice == 4:
        query = "select * from patient".format()
        curobj.execute(query)
        print(tabulate(curobj.fetchall()))

    if choice == 5:
        srno = int(input("Enter the patient number to outed the patient : "))
        query = "delete from patient where srno={}".format(srno)
        curobj.execute(query)
        con.commit()
        print("....The patient is discharged from hospital....")


    if choice == 6:
        query = "select * from doctor"
        curobj.execute(query)
        print(tabulate(curobj.fetchall()))

    
    if choice == 7:
        print("Press 1- for search doctor by his/her name: ")
        print("press 2- for search doctor by his/her specialties: ")
        choice = int(input("Enter the choice (1-2): "))

        if choice==1:
            Name_of_Doctor =input("Enter the name of doctor: ")
            query = "select * from doctor where Name_of_Doctor = '{}'".format(Name_of_Doctor)
            curobj.execute(query)
            print(tabulate(curobj.fetchall()))

        elif choice==2:
            Type_of_Doctor=input("Enter the specialities of doctor: ")
            query = "select * from doctor where Type_of_Doctor = '{}'".format(Type_of_Doctor)
            curobj.execute(query)
            print(tabulate(curobj.fetchall()))

        else:
            print("Invalid choice..\n\n")

    if choice == 8:

        print("CHEER UP!! WE WANT TO SEE YOU FIT AND VERY WELL SOON....")
        break


    
