# 📝 Todo Application

A simple and efficient **Todo Management Application** built using **Spring Boot**, **Spring Data JPA**, **MySQL**, **Lombok**, and **Thymeleaf**.  
This application allows users to create, update, view, and delete todos in a clean web interface.

---

## 📚 Table of Contents

- [🚀 Tech Stack](#-tech-stack)
- [⚙️ Configuration](#️-configuration)
- [▶️ How to Run](#️-how-to-run)
- [💡 Features](#-features)
- [🧰 Dependencies](#-dependencies)
- [🖼️ Screenshot](#-screenshot)
- [👨‍💻 Author](#-author)

---

## 🚀 Tech Stack

- **Backend:** Spring Boot  
- **ORM:** Spring Data JPA  
- **Database:** MySQL  
- **Frontend:** Thymeleaf (HTML templates)  
- **Utilities:** Lombok for boilerplate code reduction  

---

## ⚙️ Configuration

Update your **`application.properties`** file with your MySQL database details:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/<db-name>
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

---

## ▶️ How to Run

### Using Maven

```
# 1. Clone the repository
git clone https://github.com/jainam-04/Todo-App.git

# 2. Navigate into the project
cd todo-app

# 3. Build the project
mvn clean install

# 4. Run the application
mvn spring-boot:run
```

---

## 💡 Features

- 🆕 **Add New Task:** Quickly add new todos using the input field and “Add” button.  
- 👀 **View All Todos:** Displays all your tasks in a clean, card-style list.  
- 🔁 **Toggle Task Status:** Mark tasks as complete or incomplete with a single click. Completed tasks appear with a strikethrough for clarity.  
- ❌ **Delete Task:** Remove tasks instantly with the “Delete” button.  
- 🎨 **User-Friendly UI:** Built with Thymeleaf templates and styled for a clean, responsive look.  
- 💾 **Persistent Data:** Todos are stored in a MySQL database using Spring Data JPA.  

---

## 🧰 Dependencies

- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- Spring Boot Starter Thymeleaf
- Lombok
- MySQL Connector

---

## 📸 Screenshot

<img width="1919" height="871" alt="image" src="https://github.com/user-attachments/assets/9c698dbf-8377-45f0-b128-b8af6c336808" />

---

## 👨‍💻 Author

Jainam Rupani
📧 jainamrpani04@gmail.com
🌐 https://www.linkedin.com/in/jainam-rupani-263759307/
