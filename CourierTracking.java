import java.util.Scanner;

public class CourierTracking
{
static Scanner sc = new Scanner(System.in);

static void Book()
{
System.out.println("Enter Sender's name: ");
System.out.println("Enter Receiver's name: ");
System.out.println("Enter Destination: ");
System.out.println("Courier booked successfully!");
System.out.println("Your Tracking ID: 0001");
System.out.println("Status: Booked");
}

public static void Track()
{
System.out.print("Enter tracking id: ");
String id = sc.next();

if (id.equals("0001"))
{
System.out.println("----- COURIER TRACKING -----");
System.out.println("Tracking ID: 0001");
System.out.println("Booked: [YES]");
System.out.println("Picked Up: [YES]");
System.out.println("In Transit: [YES]");
System.out.println("Out for Delivery: [NO]");
System.out.println("Delivered: [NO]");
System.out.println("Current Status: In Transit");
}

else if (id.equals("0002"))
{
System.out.println("----- COURIER TRACKING -----");
System.out.println("Tracking ID: 0002");
System.out.println("Booked: [YES]");
System.out.println("Picked Up: [YES]");
System.out.println("In Transit: [YES]");
System.out.println("Out for Delivery: [YES]");
System.out.println("Delivered: [YES]");
System.out.println("Current Status: Delivered");
}

else if (id.equals("0003"))
{
System.out.println("----- COURIER TRACKING -----");
System.out.println("Tracking ID: 0003");
System.out.println("Booked: [YES]");
System.out.println("Picked Up: [NO]");
System.out.println("In Transit: [NO]");
System.out.println("Out for Delivery: [NO]");
System.out.println("Delivered: [NO]");
System.out.println("Current Status: Picked Up");
}

else if (id.equals("0004"))
{
System.out.println("----- COURIER TRACKING -----");
System.out.println("Tracking ID: 0004");
System.out.println("Booked: [YES]");
System.out.println("Picked Up: [YES]");
System.out.println("In Transit: [YES]");
System.out.println("Out for Delivery: [YES]");
System.out.println("Delivered: [NO]");
System.out.println("Current Status: Out for Delivery");
}

else if (id.equals("0005"))
{
System.out.println("----- COURIER TRACKING -----");
System.out.println("Tracking ID: 0005");
System.out.println("Booked: [YES]");
System.out.println("Picked Up: [NO]");
System.out.println("In Transit: [NO]");
System.out.println("Out for Delivery: [NO]");
System.out.println("Delivered: [NO]");
System.out.println("Current Status: Booked");
}

else
{
System.out.println("Courier not found.");
}
}

public static void Status()
{
System.out.println("Enter tracking id: ");
System.out.println("Select status: ");
System.out.println("1. Booked");
System.out.println("2. Picked Up");
System.out.println("3. In Transit");
System.out.println("4. Out for Delivery");
System.out.println("5. Delivered");

System.out.println("Enter new status: ");
int b = sc.nextInt();

switch(b)
{
case 1:
System.out.println("Status Updated to Booked");
break;

case 2:
System.out.println("Status Updated to Picked Up");
break;

case 3:
System.out.println("Status Updated to In Transit");
break;

case 4:
System.out.println("Status Updated to Out for Delivery");
break;

case 5:
System.out.println("Status Updated to Delivered");
break;

default:
System.out.println("Invalid choice");
}
}

public static void Search()
{
System.out.print("Enter tracking id: ");
String id = sc.next();

if (id.equals("0001"))
{
System.out.println("Tracking ID: 0001");
System.out.println("Sender: Shaan");
System.out.println("Receiver: Akshith");
System.out.println("Destination: Tanguturu");
System.out.println("Status: Booked");
}

else if (id.equals("0002"))
{
System.out.println("Tracking ID: 0002");
System.out.println("Sender: Kumar");
System.out.println("Receiver: Tanush");
System.out.println("Destination: Jammalamadugu");
System.out.println("Status: Picked Up");
}

else if (id.equals("0003"))
{
System.out.println("Tracking ID: 0003");
System.out.println("Sender: Kumar");
System.out.println("Receiver: Jaswanth");
System.out.println("Destination: Hyderabad");
System.out.println("Status: In Transit");
}

else if (id.equals("0004"))
{
System.out.println("Tracking ID: 0004");
System.out.println("Sender: Guna");
System.out.println("Receiver: Sanjay");
System.out.println("Destination: Mumbai");
System.out.println("Status: Out for Delivery");
}

else if (id.equals("0005"))
{
System.out.println("Tracking ID: 0005");
System.out.println("Sender: Srija");
System.out.println("Receiver: Charan");
System.out.println("Destination: Delhi");
System.out.println("Status: Delivered");
}

else
{
System.out.println("Courier not found.");
}
}

public static void DisplayAll()
{
System.out.println("----- ALL COURIERS -----");

System.out.println("Tracking ID: 0001");
System.out.println("Sender: Shaan");
System.out.println("Receiver: Akshith");
System.out.println("Destination: Tanguturu");
System.out.println("Status: Booked");
System.out.println();

System.out.println("Tracking ID: 0002");
System.out.println("Sender: Kumar");
System.out.println("Receiver: Tanush");
System.out.println("Destination: Jammalamadugu");
System.out.println("Status: Picked Up");
System.out.println();

System.out.println("Tracking ID: 0003");
System.out.println("Sender: Kumar");
System.out.println("Receiver: Jaswanth");
System.out.println("Destination: Hyderabad");
System.out.println("Status: In Transit");
System.out.println();

System.out.println("Tracking ID: 0004");
System.out.println("Sender: Guna");
System.out.println("Receiver: Sanjay");
System.out.println("Destination: Mumbai");
System.out.println("Status: Out for Delivery");
System.out.println();

System.out.println("Tracking ID: 0005");
System.out.println("Sender: Srija");
System.out.println("Receiver: Charan");
System.out.println("Destination: Delhi");
System.out.println("Status: Delivered");
}

public static void Exit()
{
System.out.println("Thank you for using Courier Tracking System!");
}

public static void main(String args[])
{
while(true)
{
System.out.println();
System.out.println("----- COURIER TRACKING SYSTEM -----");
System.out.println("1. Book New Courier");
System.out.println("2. Track Courier");
System.out.println("3. Update Courier Status");
System.out.println("4. Display All Couriers");
System.out.println("5. Search Courier");
System.out.println("6. Exit");

System.out.print("Enter your choice: ");
int n = sc.nextInt();

switch(n)
{
case 1:
Book();
break;

case 2:
Track();
break;

case 3:
Status();
break;

case 4:
DisplayAll();
break;

case 5:
Search();
break;

case 6:
Exit();
return;

default:
System.out.println("Cannot perform that.");
}
}
}
}