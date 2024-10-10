# API Documentation Project

This project is a **Spring Boot** application for managing and documenting REST APIs. It provides endpoints for initializing an application, handling course operations, and generating OpenAPI documentation using **Swagger** annotations.

## Table of Contents

- [Technologies Used](#technologies-used)
- [Features](#features)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [Running the Application](#running-the-application)
- [Hot-Reload with DevTools](#hot-reload-with-devtools)
- [API Documentation](#api-documentation)
- [Contributing](#contributing)
- [License](#license)

## Technologies Used

- Java 17
- Spring Boot
- Spring Web
- OpenAPI / Swagger for API documentation
- Lombok
- Maven
- DevTools (for hot-reloading)

## Features

- **API Documentation**: Provides OpenAPI 3.0-compliant documentation for your REST APIs.
- **Course Management**: Endpoints for creating and retrieving courses.
- **Spring Boot DevTools**: Hot-reloading support for faster development.
- **Swagger Annotations**: Easily document APIs using annotations.

## Getting Started

To get a local copy of the project up and running, follow these steps:

### Prerequisites

- Java 17
- Maven
- IDE (e.g., IntelliJ IDEA, Eclipse)
- Git

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/api-documentation.git
    ```
2. Navigate into the project directory:
    ```bash
    cd api-documentation
    ```
3. Install dependencies:
    ```bash
    mvn clean install
    ```
4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

## API Endpoints

### 1. Get All Courses
**Endpoint**: `/get`

**Method**: `GET`

**Description**: Retrieves a list of available courses.

**Response Example**:
```json
{
    "courses": [
        { "courseId": 101, "courseName": "Introduction to Java" },
        { "courseId": 102, "courseName": "Advanced Java Programming" }
    ]
}
```

### 2. Create Course
**Endpoint**: `/post`

**Method**: `POST`

**Description**: Retrieves a list of available courses.

**Request Body Example:**
```json
{
  "courseId": 101, "courseName": "Introduction to Java"
}
```

**Response Example**:
```json
{
  "courseId": 101, "courseName": "Introduction to Java"
}
```

## Response Codes
- 200 OK: Operation successful
- 400 Bad Request: Invalid request
- 401 Unauthorized: Not authenticated
- 403 Forbidden: Not authorized
- 404 Not Found: Resource missing
- 409 Conflict: Concurrency failure
- 410 Gone: Deleted resource
- 500 Internal Server Error: Unknown failure

### Running the Application

# Maven
```bash
mvn spring-boot:run
```

# With IDE

1. Import the project as a Maven project into your preferred IDE.
2. Run the App class as a Spring Boot application.

## Hot-Reload with DevTools

The project is set up with Spring Boot DevTools for automatic hot-reloading during development. If you make changes to your code, the application will restart automatically.

You should see the following log indicating LiveReload is running:
```csharp
LiveReload server is running on port 35729
```
## API Documentation

This project uses OpenAPI 3.0 and Swagger to document and visualize the API. After running the application, you can access the Swagger UI at:
```bash
http://localhost:8080/swagger-ui/index.html
```
This will display the API documentation generated from the annotations in your controllers and models.

## Contributing

1. Fork the repository:
```bash
git clone https://github.com/yourusername/api-documentation.git
```

2. Create a new branch:
```bash
git checkout -b feature/your-feature-name
```

3. Commit your changes:
```bash
git checkout -b feature/your-feature-name
```

4. Push to the branch:
```bash
git push origin feature/your-feature-name
```

5. Create a new Pull Request:

## License
This project is licensed under the MIT License - see the [License](#license) file for details.
```markdown

### Fixes Applied:
- Proper Markdown headers (`###` for subsections) to prevent duplication of headers.
- Indented code blocks for consistency and readability.
```
