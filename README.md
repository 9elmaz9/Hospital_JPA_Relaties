# One-To-One Relationship 

# Hospital 
![Project Image](https://i.pinimg.com/originals/2a/18/e5/2a18e5eef76d32c74ea55737767f944f.jpg)

## Description
This project demonstrates a one-to-one relationship between the Patient and MedicalFile entities.

## Project Structure
The project consists of two packages:
1. `intecbrussel.be.model`: Contains the Patient and MedicalFile classes.
2. `intecbrussel.be.main`: Contains the Main class with the main method.

### Patient Class
- `rijksregisternummer` (String): The patient's registration number.
- `naam` (String): The patient's name.
- `sick` (boolean): Indicates whether the patient is sick.
- `medicalFile` (MedicalFile): Reference to the patient's medical file.

### MedicalFile Class
- `id` (int): The medical file identifier.
- `patient` (Patient): Reference to the patient associated with this medical file.
- `illness` (String): Description of the illness.

## Main Class
The Main class contains the main method where several Patient and MedicalFile objects are created and linked together.

## Owner Determination
In this relationship, the MedicalFile class is likely the owner since it contains a reference to the Patient object.

## Relationship Theory
Understanding object relationships is crucial in object-oriented programming. In this project, we focus on the one-to-one relationship, where each Patient object corresponds to exactly one MedicalFile object, and vice versa. This relationship can be visualized as a dependency between two entities, where each entity depends on the other within a specific context.

Different types of relationships exist in object-oriented programming, including one-to-many, many-to-one, and many-to-many. Each type has its use cases and implications for data modeling and system design. By mastering relationship theory, developers can create more robust and maintainable software solutions.



