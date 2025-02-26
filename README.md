# QAJavaProject - SkateXut

## Why did I do this?
This is my final project for the QA Software Development Bootcamp. This project is a full CRUD functional api written in Spring. To demonstrate the Java skills learnt in the final weeks of the course.

SkateXut is designed to be a shop interface for Creating, Reading, Updating, and Deleting products. With attributes such as Barcode, Name, Colour, Dimentions, Descriptions. Which will store persistent values using H2 database. This information can be relayed via the Java/SpringBoot backend. With a .jar included. Which can be run locally, and make use of port 8080 to be used for API - Requests can be made via Postman, screenshots provided below


any dependencies it might need/build

--------------------------------------------

## postman

To test the functionality of my API we can use api as such. When the program is running our base URL is http://localhost:8080/ and we append the functionality as seen in the pictures below:

Here I'm adding a new product and all of it's properties.
![postman add product](/Documentation/postman1.png)
This Query allows you to search a barcode of a product, and return all of it's properties
![postman read by barcode](/Documentation/postman2.png)
This Query allows you to search the name of a product, and return all of it's properties
![postman read by name](/Documentation/postman3.png)
This Query allows you to return all products, and return all of their properties
![postman read all](/Documentation/postman4.png)
This Query allows you to update all the properties via a barcode of a product. We can see on the following it has updated the product
![postman update product](/Documentation/postman5.png)
![postman read all](/Documentation/postman6.png)
This Query allows a product to be deleted via it's barcode, once again you can see below the updated readall, and the product has been removed. You can't sell a board with paint in the bearings :(
![postman delete product](/Documentation/postman7.png)
![postman read all](/Documentation/postman8.png)


## Database

Here once the program is restarted we can see the products are still avaliable just as we left them, this is because we defined a file within the project so store data persistently
![Database Persistence](/Documentation/SQL1.png)



## Test

100% Class Coverage, 81% Line coverage testing

![Tests](/Documentation/Test.png)
--------------------------------------------

## Risk Assessment
[Risk Assessment](/Documentation/riskAssesment.pdf)

## Expectation
Starting the project I had concerns about using databases, I was used to SQL but hadn't set-up, so I went with H2 as it would be less hassle to set up Within the short time frame. so I could spend more time getting to the meat of the challenge. 
I expected it to be a challenge as it was my first time attempting a full java project and API. I was also concerned about testing as I know it's usually more time straining than writing the program itself. Doing everything documentation included would be a challenge to all get done in 5 days.
However, I was hopeful that my existing knowledge of programming would come in handy as I'm no stranger to testing and general concepts. I knew springboot was an entirely different process to traditional methods, but I was excited to gain the skills of properly working through the task.

## What went well/not well
As expected I ran into lots of issues with H2 and ended up falling into Rabbit holes trying to get it to work both persistently and in memory for testing. But I gained a valuable assest as it allows a nice way to integrate a sql database, without all the set-up I was apprehensive about from a fresh install of mySql
I spent a lot of time reading over QA Community, documentation, and internet forums. I see this as valuable time both in gaining knowledge and the time spent away from working on the project. But I expected this would be the case when learning a new language and platform.
I'm happy with the testing, as once the database issues were resolved it was a very nice experience and due to the scope of the project was much faster and allowed me to work on improving every aspect of the project.

## Improvements
In the future I would like to keep creating java and I've learnt a lot from this course and project, I would certainly be able to use this project as a model if I was ever testing or using Spring/APIs or any of the useful tools we learnt along the way.
I would certainly have more time now knowing how to work with H2, and the general syntax of the dependencies.
I would like to see myself create more complicated tools and work with other APIs. Generally just more time due to learning more, I could spend implementing more features within the API/Program, but also be able to thoroughly test my project.
And also do a task that is exciting and more advanced. :) 


--------------------------------------------
## Jira
[Jira]()

- Sabrina
