### Use Case Diagram & Description
![UseCaseDiagram](https://user-images.githubusercontent.com/115104826/197918074-377d5900-46db-428c-852e-42093c7711f9.png)
<br></br>
| Use Case | Description | Requirement|
| :---: | --- | :---: |
|UC-1: Start Purchasing Session| The cashier starts the purchasing session using the keyboard.| R-01|
|UC-2: Cancel Purchasing Sessions| The cashier can cancel the purchasing session at any time.| R-02|
|UC-3: Scan Item(s)| The cashier can scan items to be obtained from the local database.| R-03|
|UC-4: Remove Item| The cashier can select and remove item(s) by scanning or entering the product barcode.| R-07|
|UC-5: View Product Info| The cashier can view the scanned products information stored in the database.| R-03|
|UC-6: Select Payment Option| The cashier can select a payment method (Debit, Credit, Cash). If a third party payment service is used, payment information will be attained from the payment service, and will be authenticated by them.| R-05|
|UC-7: End Session| After successful payment, the cashier can end the session.| R-06|

<br></br>
### Quality scenarios
| ID | Quality Attributes | Scenario | Use Case | Requirement|
| :---: | :---: | --- | --- | :---: |
|QA-1| Modifiablity| The cashier is able to start a new product purchasing session when needed. They are also able to cancel the session whenever.| UC-1| R-01|
|QA-2| Usability, Modifiablity| The cashier scans the product barcode, and if Identified it will display product information on the display.| UC-3, UC-5| R-03|
|QA-3| Modifiablity| The cashier can remove a product any time they wish, by scanning or entering the product barcode.| UC-4| R-07|
|QA-4| Security| If the selected payment method chosen is debit or credit, the transaction will be authorized by the card provider and verify the purchase| UC-6| R-06|

<br></br>
### Constraints
| ID | Constraint | Requirement|
| :---: | --- | :---: |
|Con-1| Cashier must start product purchasing session prior to scanning items.| R-01| 
|Con-2| It must be possible to be able to change hardware platforms in the future.| R-08|
|Con-3| The Cash Register must contain a local database of products.| R-09|
