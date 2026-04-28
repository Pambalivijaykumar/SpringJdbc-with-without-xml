# SpringJdbc-with-without-xml

Spring JDBC Example (JdbcTemplate + RowMapper)

This project demonstrates how to use Spring JDBC (JdbcTemplate) to interact with a database and map results to Java objects.

Overview
Uses Spring’s JdbcTemplate for database operations
Executes SQL queries to fetch and modify data
Converts database rows into Java objects using RowMapper
Project Structure
Student.java → Entity class representing a student record
SpringJdbcNoXml.java → Main class to execute database operations
Features
1. Fetch Multiple Records
Uses query()
Returns a list of Student objects
2. Fetch Single Record
Uses queryForObject()
Retrieves one student by ID
3. Insert & Update
Uses update()
Performs insert and update operations
4. Delete Record
Uses update()
Deletes a student by ID
Key Concepts
JdbcTemplate
Simplifies JDBC code
Handles connection, query execution, and exceptions
RowMapper
Maps each row of ResultSet to a Student object
Execution Flow
Load Spring context
Get JdbcTemplate bean
Execute SQL queries
Map results using RowMapper
Print or process data
Sample Output
[Student [studentId=1, marks=85, name=John],
 Student [studentId=2, marks=90, name=Alice]]
