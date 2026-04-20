# BigFluencer - Influencer Marketing Platform

A web-based platform connecting companies with influencers for marketing campaigns and brand collaborations.

**Module:** Distributed Enterprise Application (DEA)  
**Institution:** NSBM Green University  
**Group:** 9

---

## Team Members

| Name | Student ID | Contribution |
|------|------------|--------------|
| R M S Hasitha Bandara | 36941 | Project Lead, Security, Authentication, Email Service |
| W G A Iduranga | 36600 | Campaign Module |
| T M D R Abeywickrama | 36908 | Application Module |
| R K G Tharushika | 36508 | Company Dashboard |
| W G B D Gamage | 35273 | Influencer Dashboard |
| N H M Sivmini | 37097 | Admin Dashboard |
| K P C J Bimsari | 37054 | Login/Signup Pages |
| R G M N Jayawardhana | 36909 | UI/UX Styling |
| R M S U Rathnayaka | 36373 | Static Pages |
| K P S M Pathirana | 36706 | User Dashboard |

---

## Technologies Used

**Backend:**
- Java 17
- Spring Boot 3.2.0
- Spring Security
- Spring Data JPA
- MySQL 8.0
- Maven

**Frontend:**
- HTML5, CSS3, JavaScript
- Bootstrap 5.3.2

---

## Features

### User Roles
- **Admin:** Manage users, approve/reject registrations, oversee platform
- **Company:** Create campaigns, review applications, manage partnerships
- **Influencer:** Browse campaigns, submit applications, track status

### Core Functionality
- User registration with admin approval workflow
- Campaign creation and management
- Application submission and review system
- Profile management with photo upload
- Email notifications
- News/blog system

---

## Project Structure

```
src/main/java/com/groupaa/bigfluencer/
 config/          # Security configuration
 controller/      # REST API endpoints
 dto/             # Data transfer objects
 model/           # Entity classes
 repository/      # Database repositories
 service/         # Business logic

src/main/resources/
 static/          # HTML, CSS, JS files
 application.properties
```

---

## Database Tables

- **users** - User accounts (admin, company, influencer)
- **campaigns** - Marketing campaigns created by companies
- **applications** - Influencer applications to campaigns
- **news** - Platform news articles

---

## API Endpoints

### Authentication
- `POST /api/auth/login` - User login
- `POST /api/auth/logout` - User logout
- `GET /api/auth/user` - Get current session

### Campaigns
- `GET /api/campaigns` - List active campaigns
- `POST /api/campaigns` - Create campaign
- `PUT /api/campaigns/{id}` - Update campaign
- `DELETE /api/campaigns/{id}` - Delete campaign

### Applications
- `POST /api/applications` - Submit application
- `GET /api/applications/my-applications` - Get user applications
- `PATCH /api/applications/{id}/approve` - Approve application
- `PATCH /api/applications/{id}/reject` - Reject application

### Admin
- `GET /api/admin/users` - List all users
- `GET /api/admin/users/pending` - List pending users
- `POST /api/admin/users/{id}/approve` - Approve user
- `POST /api/admin/users/{id}/reject` - Reject user

---

## Setup Instructions

### Prerequisites
- JDK 17+
- MySQL 8.0
- Maven 3.9+

### Database Setup
```sql
CREATE DATABASE bigfluencer;
```

### Configuration
Edit `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bigfluencer
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
```

### Run Application
```bash
./mvnw spring-boot:run
```

Access at: http://localhost:8080

---

## Default Admin Account

```sql
INSERT INTO users (name, email, password, role, status) 
VALUES ('Admin', 'admin@bigfluencer.com', 
'$2a$10$N9qo8uLOickgx2ZMRZoMyeIjZRGdjGj/n3.ZR5J9H.0DERPS/AmVy', 
'ADMIN', 'ACTIVE');
```
Password: `admin123`

---

## Postman Collection

API collection file included: `BigFluencer.postman_collection.json`

Import into Postman to test all endpoints.

---

## License

MIT License

---

NSBM Green University | Group 9 | 2026
