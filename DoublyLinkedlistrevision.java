


public class DoublyLinkedlistrevision {
    

    void traverse()
    {
        System.out.println("....Forward Traverse.....");
        node current = START;
        while (current.next!=null) 
        {
            System.out.println(current.data+" ");
            current = current.next;
        }
        System.out.println(current.data); // for last element
        System.out.println("....Reverse Traverse.....");     

        while (current!=null) 
        {
            System.out.println(current.data+" ");
            current = current.previous;
        }
     
    }
}



void remove_duplicates()
{
    node current = start;
    while (current!=null) 
    {
        if(current.data == current.next.data)
        {
            current = current.next;
        }





        node temp = current.next;
        while(current.data != temp.data)
        {
            temp = temp.next;
        }
        current.next = temp;
    }
}