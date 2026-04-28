Spring JDBC (With and Without XML Configuration)

This project demonstrates how to use Spring JDBC (JdbcTemplate) for database operations using both:

XML-based configuration
Java-based configuration (No XML)
Overview

The project shows how to:

Connect to a relational database
Execute SQL queries using JdbcTemplate
Map database records to Java objects using RowMapper
Perform CRUD operations (Create, Read, Update, Delete)
Project Structure
Entity
Student.java → Represents a student record (id, marks, name)
Modules
XML-based configuration example
Java-based (No XML) configuration example
Features
Fetch Multiple Records
Uses query()
Returns a list of Student objects
Fetch Single Record
Uses queryForObject()
Retrieves one record using ID
Insert & Update
Uses update()
Performs insert and update operations
Delete Record
Uses update()
Deletes data from the database
Key Concepts
JdbcTemplate
Core class of Spring JDBC
Handles connection, query execution, and exception handling
RowMapper
Maps each row of ResultSet to a Java object
Execution Flow
Configure DataSource and JdbcTemplate (XML or Java config)
Load Spring context
Get JdbcTemplate bean
Execute SQL queries
Map results using RowMapper
Print or process output
Sample Output
[Student [studentId=1, marks=85, name=John],
 Student [studentId=2, marks=90, name=Alice]]
