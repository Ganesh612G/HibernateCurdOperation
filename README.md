# Features

**SessionFactory**

A heavyweight object responsible for creating Session instances.
Configured using the hibernate.cfg.xml file, which contains database connection details and Hibernate settings.

**Session**

Represents the connection to the database.
Used to execute HQL queries, perform CRUD operations, and manage transactions.

**Transaction**

Ensures the atomicity of database operations.
All database changes within a transaction are committed or rolled back as a single unit.

**Query**

HQL queries are created using the Query interface provided by Hibernate.
Methods such as setParameter, executeUpdate, and uniqueResult help in parameterized and efficient query execution.
CRUD Operations with HQL

**Insert Operation**
HQL does not support direct insertion (e.g., INSERT INTO) as it operates on persistent objects. Instead, objects are created in Java and saved using session.save().

**Update Operation**

HQL can update data in the database based on object properties.
Example:
UPDATE Student SET name = :name, email = :email WHERE id = :id

**Delete Operation**

Deletes records from the database based on criteria.
Example:
DELETE FROM Student WHERE id = :id

**Fetch Operation**

Retrieves data by querying the persistent objects.
Example:
FROM Student WHERE id = :id

**Advantages of HQL**
Database Independence

Since HQL uses object-oriented syntax, the same queries can work across different databases.
Readable and Maintainable

Queries use Java class and property names, making them easier to understand and maintain.
Powerful Features

Supports joins, aggregations, ordering, and grouping operations.
Dynamic Query Building

Parameterized queries prevent SQL injection and enhance reusability.
