📦 Microservices
1. Employee Service

The Employee Service manages employee-related information.

Responsibilities
Create employee records
Retrieve employee details
Update employee information
Delete employee records
Retrieve employee information along with address details
Communicate with the Address Service
2. Address Service

The Address Service manages address-related information.

Responsibilities
Create address records
Retrieve address details
Update address information
Delete address records
Provide address information to the Employee Service
✨ Key Features
Microservices-based architecture
Independent Employee and Address services
RESTful API development
CRUD operations
Service-to-service REST communication
Spring Data JPA integration
MySQL database integration
Hibernate ORM
Layered architecture
Repository pattern
Configuration using application.properties
API testing using Postman
EmpAddressHub/
│
├── AddressService/
│   │
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── AddressServices/
│   │   │   │           └── AddressService/
│   │   │   │               ├── config/
│   │   │   │               ├── controller/
│   │   │   │               ├── model/
│   │   │   │               ├── repo/
│   │   │   │               ├── response/
│   │   │   │               └── service/
│   │   │   │
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   │
│   │   └── test/
│   │
│   └── pom.xml
│
├── Employee/
│   │
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── Microservices/
│   │   │   │           └── Employee/
│   │   │   │               ├── Config/
│   │   │   │               ├── Controller/
│   │   │   │               ├── Entity/
│   │   │   │               ├── Repo/
│   │   │   │               ├── Response/
│   │   │   │               └── Service/
│   │   │   │
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   │
│   │   └── test/
│   │
│   └── pom.xml
│
└── README.md
🔄 Service Communication

The Employee Service communicates with the Address Service using a REST API.

For example:
Client
  |
  | Request Employee
  ↓
Employee Service
  |
  | Request Address
  ↓
Address Service
  |
  | Address Response
  ↓
Employee Service
  |
  | Combined Response
  ↓
Client
This demonstrates how independent Spring Boot services can communicate with each other.

🗄️ Database

The application uses MySQL for persistent data storage.

Each service can maintain its own database/table structure according to its responsibility.

Example:
Employee Database
-----------------
Employee
- id
- name
- email
- salary
- addressId
- Address Database
----------------
Address
- id
- city
- state
- Database names, table names, and columns can be modified according to the configuration used in the project.
- ⚙️ Configuration

Database and service configuration is maintained in:
src/main/resources/application.properties
Example configuration:
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
▶️ How to Run the Project
Prerequisites

Make sure the following are installed:

Java JDK 17+
Maven
MySQL
Eclipse / IntelliJ IDEA
Postman
1. Clone the Repository
git clone https://github.com/ravulapallianjana/EmpAddressHub.git
2. Navigate to the Project
cd EmpAddressHub
3. Configure MySQL

Create the required database in MySQL and update the database configuration in the application.properties files of both services.

4. Start Address Service

Open the AddressService project and run the Spring Boot application.

5. Start Employee Service

Open the Employee project and run the Spring Boot application.

6. Test APIs

Use Postman to test the available REST endpoints.

🧪 API Testing

The APIs can be tested using Postman.

Typical operations include:

POST    /api/...       → Create
GET     /api/...       → Retrieve
GET     /api/{id}      → Retrieve by ID
PUT     /api/{id}      → Update
DELETE  /api/{id}      → Delete

Replace the paths above with the exact endpoints configured in each controller.

📋 HTTP Methods Used
Method	Operation
GET	Retrieve data
POST	Create data
PUT	Update data
DELETE	Delete data
🎯 Learning Outcomes

Through this project, I gained practical experience in:

Developing Spring Boot applications
Designing RESTful APIs
Building microservices
Implementing CRUD operations
Connecting Spring Boot with MySQL
Using Spring Data JPA and Hibernate
Implementing layered architecture
Communicating between microservices
Testing APIs using Postman
Managing projects using Git and GitHub
🔮 Future Enhancements

The project can be extended with:

Spring Cloud Eureka Service Discovery
API Gateway
OpenFeign for service communication
Centralized configuration
Resilience4j for fault tolerance
Spring Security and JWT authentication
Docker containerization
Swagger/OpenAPI documentation
Centralized logging
CI/CD pipeline
👩‍💻 Author

Ravulapalli Anjana

B.Tech – Computer Science and Engineering

Skills: Java | Spring Boot | Microservices | REST API | MySQL | JPA | Hibernate | HTML | CSS | JavaScript | React

🔗 GitHub Repository

EmpAddressHub

📄 License

This project is created for educational and portfolio purposes.
