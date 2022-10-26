### Assignment 2: Architectural Patterns and Design Drivers
1. Identify the Use Cases, Quality scenarios, and Constraints of the application (these are the
design drivers). Use the Use Case format depicted in the ADD design process and course
notes rather than the more formal one. Include in the Use Case descriptions, quality, and
constraints tables a column identifying the requirements that led to these design drivers.
Note: Nearly all the Use Cases are an extension of a product purchasing session.
2. Submit a component dependency diagram for the cash register application that incorporates
the MVC and layer patterns. This is basically the same diagram that you worked on for the
in-class activity except that the packages correspond to components.
3. Create a sequence diagram for the successful Product Purchasing Use Case (i.e.
commencement of a purchasing session, scanning of products, payment, and termination of
the session) that incorporates the components that you defined in question 2.
4. Modify the code that you created for the class exercise to incorporate the Use Case described
in question 3. Code this using the Java Swing framework which can facilitate the creation of
Cash register GUI where you can demonstrate the Use Case. A good tutorial to follow can be
found at https://docs.oracle.com/javase/tutorial/uiswing/start/index.html Submit a set of
instructions on how to execute and interface with the application that includes screen dump
examples. 

---
### Business Case
A small stand-alone Cash Register needs to be designed that reads barcodes of products that a
Customer has selected.


### Requirements
|Req ID| Description|
| --- | ---|
|R-01| A Cashier has to start a product purchasing session through the keyboard prior to any products being read by the barcode scanner.|
|R-02| A Cashier can cancel a purchasing session at any time during the session resulting in nullifying all items that have been scanned since the start of the session.|
|R-03| When a product has been identified using a barcode scanner, its name and price are displayed on a display.|
|R-04| If the barcode of a product cannot be read by the bar code scanner then the message "Unknown product" will be displayed and the barcode can be entered via the Cashier’s keyboard.|
|R-05 |When all the selected products have been read, the Cashier can select a payment option through the keyboard such as Cash, Debit or Credit Card. (in the case of a Debit and Credit Card payment a 3rd party payment system is used to complete the payment.)|
|R-06 |After a successful payment verification, the Cashier can end the product purchase session and a list of all the selected products with the unit price, quantity and total price are printed to a paper ticket receipt.|
|R-07| Products can be cancelled at any time during the session by the Cashier selecting a product cancel option on the keyboard and either scanning or entering the barcode on the keyboard.|
|R-08 |It must be possible to be able to change hardware platforms in the future.|
|R-09 |The Cash Register will contain a local database of products.|
