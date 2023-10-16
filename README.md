
# Instagram Backend Project
>This is a basic Instagram backend project built using Spring Boot MVC. It provides the following functionality: user management, post-creation, and authentication using authentication tokens.
---
## Frameworks and Languages
The Instagram backend project is developed using the following frameworks and languages:

* **Spring Boot:** A Java-based framework for building web applications.
* **Spring MVC:** A module of the Spring Framework that supports building web applications.
* **Java:** The programming language used for backend development.
* **Hibernate:** An Object-Relational Mapping (ORM) framework used for database interactions.
* **MySQL:** The chosen database management system.
---
## Project Structure
The project is structured into the following components:

* **Controller:** Handles incoming HTTP requests, manages the data flow, and sends responses back to the client.
* **Service:** Implements business logic and interacts with the repositories.
* **Repository:** Handles database operations and provides an interface for data access.
* **Model:** Represents the database entities, such as User, Post, and AuthenticationToken.
* **DTO:** Data Transfer Objects used for transferring data between layers.
---
## Database Design
The project uses MySQL as the database management system. The following entities are mapped to database tables:

* **User:** Stores user information, including first name, last name, age, email, and phone number.
* **Post:** Stores post information, including post ID, creation date, update date, and post data. "ManyToOne" relation with the user.
* **AuthenticationToken:** Stores authentication token information, including token ID, token value, and creation date. "OneToOne" relation with the user.
---
## Data Structure
The project utilizes several data structures, including:

* **Strings:** Used for storing text-based data, such as user names, email addresses, phone numbers, post content, and authentication tokens.
* **Integers:** Used for storing numerical data, such as user ages and post IDs.
* **LocalDateTime:** Used for storing date and time information, including post-creation and update dates.
---
## Project Summary
The Instagram backend project is built using Spring Boot MVC, Java, Hibernate, and MySQL. It provides functionality for user management, post-creation, and authentication using authentication tokens. The project follows a layered architecture with controllers, services, and repositories to handle the API endpoints, business logic and data access. The database design includes entities for users, posts, and authentication tokens, which are mapped to MySQL tables. The project uses various data structures, such as strings, integers and LocalDateTime, to store and manipulate data.

---
### User Controller
The User Controller provides the following endpoints:

* POST /users/sign-in: Authenticates a user.
* POST /users/sign-up: Creates a new user.
* PUT /users: Updates user details.
---
### Post Controller
The Post Controller provides the following endpoints:

* POST /posts: Saves a new post.
* GET /posts/{postId}: Retrieves a post by ID.
---
## Conclusion
> The Instagram backend project developed using Spring Boot MVC provides essential functionality for user management, post-creation, and authentication. With this foundation, we can further expand and enhance the project to meet specific requirements and develop a fully functional Instagram-like application.
