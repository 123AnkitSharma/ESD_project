Student Room Swapping Application Portal

An academic ERP mini-project that enables seamless room exchange management among students.

About the Project

The Student Room Swapping Application Portal simplifies the process of requesting and managing room exchanges between students. The platform allows:

    Students to log in securely.
    Students to initiate room swap requests.
    Recipients to accept or reject the requests.
    Automatic updates to room allocations upon acceptance, ensuring cascading changes in the database.

Features

    User Authentication: Secure login using JWT token-based authentication.
    Request Management: Allows students to request and respond to room swaps.
    Cascading Updates: Ensures all dependent records are updated when room details are swapped.
    Database Integration: Efficient storage and retrieval using MySQL.

Technologies Used
Backend

    Spring Boot
    Spring Security (JWT)
    Spring Data JPA
    Lombok

Frontend

    React (for UI)

Database

    MySQL

Other Tools

    Postman (for API testing)

Database Schema
Tables Used

    Students: Stores student details.
    Hostel: Maintains room and hostel details.
    Swap_Application: Tracks room swap requests and statuses.
    Login_Credentials: Stores hashed passwords for authentication.
