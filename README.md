# Martinez-Chacon-Summative-Project-1

Video Summary: https://youtu.be/kCeonKtori4

My partner's and my submission for Summative Project 1, as a part of Netflix Pathways Advanced Java Bootcamp. 
The objective was to build a REST API using Spring Boot (a Java based framework) and Spring MVC (to handle incoming HTTP requests).

Our project focuses on 3 user stories:

1. As an API user, I want to request a random quote so that I can expand my knowledge.
2. As an API user, I want to request a random word and its definition so that I can expand my vocabulary.
3. As an API user, I want to request a random answer to a question so that I can be entertained.

These user stories were implemented using 3 API's:

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
Testing was done using MockMVC (a testing framework) to simulate HTTP requests and test the behavior of a Spring MVC
controller.

It would be impractical to test the random object response, so tested only the response received by the HTTP
method.


Documentation Using Swagger
---------------------------
Swagger (a framework for creating and maintaining API documentation) was used to document our REST API
providing a clear and concise representation of our API's resources and operations.

In-Memory Data
--------------
For simple testing, in-memory data was used instead of a database.
