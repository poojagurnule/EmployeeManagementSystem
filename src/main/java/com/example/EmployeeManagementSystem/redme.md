
<h1 align = "center"> Blogging Platform API </h1>
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>

This is a simple EmployeeManagementSystem using Spring Boot framework.The idea was to build some basic management System.
It provides CRUD operations, validation and exception handling ,using Hibernate as the ORM and MySQL as the database.
It was made using Spring Boot, Spring Data JPA, Spring Data REST and MySql Database.
The Employee Management System is a web-based application built with Spring Boot to streamline the management of employee data for an organization. It provides an easy-to-use interface for HR personnel to manage employee information and allows employees to view and update their own details.

### Tech Stack :-
* Spring Boot
* Java
* JPA Hibernate
* MySQL
### Configuration :-
* Configuration Files -

    * src/resources/application.properties - main configuration file. Here it is possible to change the port number.
      it has the properties for Database connection and for uploading file.

  it has the properties for Database connection and for uploading file like:![Screenshot 2023-05-21 161824](https://github.com/poojagurnule/MCT-Blogging-Platform-API/assets/102051371/b1034ce1-7a55-49fd-901e-d0e03ff447e8)


### Getting Started :-
* To get started with the application, clone the repository to your local machine using :

      git clone https://github.com/<your-username>/spring-boot-blog.git
* Make sure you have Java and Maven installed on your machine.
  You will also need a MySQL server running on your local machine or a remote server.
* Configure the database connection in the application.properties file:
  spring.datasource.url=jdbc:mysql://localhost:3306/<database-name>
  spring.datasource.username=<database-username>
  spring.datasource.password=<database-password>
* Build and run the application.


## Data Flow
1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.
4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.


## API Endpoints
### EmployeeController
* GET /employee/getAll: Retrieve all employees.
* PUT /employee/updateEmployee/{id}: Update an employee's information.
### HRController
* POST /hr/addEmployee: Add a new employee.
* GET /hr/getAll: Retrieve all employees.
* PUT /hr/updateEmployee/{id}: Update an employee's information.
* DELETE /hr/{id}: Delete an employee.

## Usage
* Use the provided API endpoints to perform CRUD operations on employee data.
* Access the application through a web browser or API testing tool (e.g., Postman) to interact with the system.
* Use the HRController endpoints for HR personnel to manage employee records.
* Use the EmployeeController endpoints for employees to view and update their own information except of their salary.

## Author
👤 **Pooja Gurnule**
* GitHub: [Pooja Gurnule](https://github.com/poojagurnule)

---

## 🤝 Contributing
Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page]("url").

---

## Show your support
Give a ⭐️ if this project helped you!

---

## 📝 License
Copyright © 2023 [Pooja Gurnule](https://github.com/poojagurnule).<br />