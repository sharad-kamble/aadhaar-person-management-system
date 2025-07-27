# aadhaar-person-management-system

A simple Spring Boot application demonstrating a one-to-one bidirectional relationship between `Person` and `Aadhaar` entities, using REST APIs and PostgreSQL for storage.

## 🧾 Project Features

- Create and manage persons with their Aadhaar details
- One-to-One mapping using JPA & Hibernate
- DTO-based data transfer between API and entity layer
- JSON serialization handling with `@JsonManagedReference` and `@JsonBackReference`
- PostgreSQL database integration
- RESTful API endpoints
- Error handling and input validation

---

## 🔧 Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- PostgreSQL
- Maven
- JSON / Jackson

---

## 📁 Folder Structure

```
src/main/java/
├── com.example.demo
│   ├── controller
│   │   └── PersonController.java
│   ├── dto
│   │   └── PersonDto.java
│   ├── entity
│   │   ├── Person.java
│   │   └── Addhar.java
│   ├── repo
│   │   ├── PersonRepo.java
│   │   └── AddharRepo.java
│   └── service
│       ├── PersonService.java
│       └── PersonServiceImpl.java
```

---

## 🚀 How to Run

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/aadhaar-person-system.git
cd aadhaar-person-system
```

### 2. Set Up PostgreSQL
- Create a database (e.g., `postgres`)
- Update `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=postgres
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
```

### 3. Build and Run
```bash
mvn spring-boot:run
```

App will run on: `http://localhost:8080`

---

## 📬 API Endpoints

### POST `/person`
Add a new person with Aadhaar.

**Sample JSON:**
```json
{
  "personName": "Sharad Kamble",
  "personEmail": "sharad@example.com",
  "addhar": {
    "addharNo": "1234-5678-9012"
  }
}
```

---

## 🛠️ Entity Relationship

- **Person**
  - `id`, `name`, `email`
  - One-to-One with `Addhar`

- **Addhar**
  - `id`, `addharNo`
  - FK to `Person` (`person_id`)

---

## 🧑‍💻 Author

- **Sharad Kamble**  
  [GitHub Profile](https://github.com/sharad-kamble)

---

## 📄 License

This project is open-source and available under the [MIT License](LICENSE).
