# Martinez-Chacon-Summative-Project-1

Video Summary: https://youtu.be/kCeonKtori4

My partner's and my submission for Summative Project 1, as a part of Netflix Pathways Advanced Java Bootcamp. 
The object was to build a REST API using Spring Boot (a Java based framework) and Spring MVC (to handle incoming HTTP requests).

Our project implements 3 API's:

Magic 8 Ball
------------
A POST HTTP method that takes in a user's question in the request body, and responds with a JSON
object that is made up of the question asked, and a random response to it.

Responds with a 201 CREATED status.

Quote
-----
A GET HTTP method that returns a random quote (as a JSON object) that include the random quote, and 
the author.

Responds with a 200 OK status.

Word
----
A GET HTTP method that returns a random word and its definition.

Responds with a 200 OK status.


Testing with MockMVC
--------------------
We used MockMVC (a testing framework) to simulate HTTP requests and test the behavior of a Spring MVC
controller.

Because it would be impractical to test a random object response for correctness, we defered to instead
test the only the response received by the HTTP method.


Documentation Using Swagger
---------------------------
We used Swagger (a framework for creating and maintaining API documentation) to document our REST API
as a way to provide a clear and concise representation of our API's resources and operations.

In-Memory Data
--------------
In place of a database, we defered to using in-memory data for simple testing.
