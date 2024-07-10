# BookReviews Application

## Overview

BookReviews is a full-stack web application developed using Spring Boot for the back-end and Thymeleaf for the front-end. This application allows users to add, view, and review books. It features user authentication and role-based access control to manage access to different parts of the application.

## Features

- **User Authentication and Authorization:** Secure user login and role-based access control using Spring Security.
- **CRUD Operations:** Full CRUD (Create, Read, Update, Delete) functionality for books and reviews.
- **RESTful APIs:** RESTful endpoints to handle operations related to books and reviews.
- **Dynamic Content Rendering:** Utilizes Thymeleaf templates to dynamically generate HTML content.
- **Real-time Data Fetching:** JavaScript integration to asynchronously fetch and display book details and reviews.
- **Database Integration:** Uses JPA and Hibernate for seamless database operations.
- **Security:** Emphasizes secure design principles to protect user information.

## Technologies Used

- **Back-end:**
  - Spring Boot
  - Spring Security
  - JPA/Hibernate
- **Front-end:**
  - Thymeleaf
  - HTML5
  - JavaScript
- **Database:**
  - H2 Database (in-memory for development purposes)
- **Build Tool:**
  - Maven

 <h2>Accessing the Application</h2>
<p>Open your web browser and navigate to <a href="http://localhost:8080">http://localhost:8080</a>.</p>
<p>Use the following credentials to log in as an admin:</p>
<ul>
  <li>Username: <strong>admin</strong></li>
  <li>Password: <strong>password</strong></li>
</ul>

<h2>RESTful API Endpoints</h2>

<h3>Books</h3>
<ul>
  <li><strong>GET /books:</strong> Retrieve a list of all books.</li>
  <li><strong>GET /books/{id}:</strong> Retrieve details of a specific book by ID.</li>
  <li><strong>POST /books:</strong> Add a new book.</li>
</ul>

<h3>Reviews</h3>
<ul>
  <li><strong>GET /reviews/{bookId}:</strong> Retrieve a list of reviews for a specific book.</li>
  <li><strong>POST /reviews:</strong> Add a new review for a book.</li>
</ul>

<h2>Security</h2>
<p>The application uses Spring Security to manage user authentication and authorization. The following roles are defined:</p>
<ul>
  <li><strong>USER:</strong> Can view and add reviews.</li>
  <li><strong>ADMIN:</strong> Can perform all CRUD operations on books and reviews.</li>
</ul>
