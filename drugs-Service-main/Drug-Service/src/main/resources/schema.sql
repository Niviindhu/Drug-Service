CREATE TABLE DrugDetails (
   id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(250),
   unit INT,
   cost INT,
   location VARCHAR(250),
   manufacturer VARCHAR(250),
   manufacturedDate DATE,
   expiryDate DATE,
   medicalComposition VARCHAR(250)
);
CREATE TABLE DrugStock (
   id INT PRIMARY KEY,
   location VARCHAR(250),
   quantity INT
);
