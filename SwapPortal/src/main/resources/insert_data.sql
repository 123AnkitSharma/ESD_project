-- Insert sample students
INSERT INTO student (first_name, last_name, email, password)
VALUES
    ('Ankit', 'Sharma', 'ankit.sharma@example.com', 'password123'),
    ('Raju', 'Kumar', 'raju.kumar@example.com', 'password123');

-- Insert sample hostels
INSERT INTO hostel (name, floor, room_number, student_id)
VALUES
    ('Hostel A', '3', '205', 1),
    ('Hostel A', '3', '206', 2),
    ('Hostel A', '3', '207', 3),
    ('Hostel A', '3', '208', 4),
    ('Hostel A', '3', '209', 5),
    ('Hostel A', '3', '210', 6),
    ('Hostel A', '3', '211', 7),
    ('Hostel A', '3', '212', 8);


-- Insert sample swap applications
INSERT INTO swap_application (applicant, recipient, applicant_message, recipient_message, status)
VALUES
    (4, 5, 'I want to swap room with you.', NULL, 'PENDING');
