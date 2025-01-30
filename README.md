# Software Design and Development in Java
Software development is the process of designing, building, and maintaining software applications for various platforms such as web, mobile, desktop, and embedded systems. It encompasses a wide range of tasks including planning, requirement gathering, architecture design, coding, testing, deployment, and maintenance.

## Functional Requirements of Insurance Application
1. **User Registration**
   - Users can create an account by providing personal information.
   
2. **User Authentication**
   - Users can log in using their credentials.

3. **Profile Management**
   - Users can view and update their personal information.

4. **Policy Browsing**
   - Users can view a list of available insurance policies.

5. **Policy Application**
   - Users can apply for a selected insurance policy by filling out an application form.

6. **Payment Processing**
   - Users can make premium payments using various methods.

7. **View Policy Details**
   - Users can view detailed information about their existing insurance policies.

8. **Policy Renewal**
   - Users can renew their existing policies through the application.

9. **Policy Cancellation**
   - Users can initiate the cancellation of an insurance policy.

10. **Payment History**
    - Users can view their payment history.

11. **Claims Submission**
    - Users can file a claim related to a specific insurance policy by filling out a claim form.

12. **Claim Status Tracking**
    - Users can track the status of their submitted claims.

13. **Claim History**
    - Users can view their past claims, including details and outcomes.

14. **Notifications**
    - Users receive notifications for important updates (policy renewals, claim status).
## [Use-case Modelling](https://github.com/kvinay7/Insurance/blob/main/Use%20Case%20Diagram.pdf)

## [Designing Class Diagram](https://github.com/ashishps1/awesome-low-level-design?tab=readme-ov-file)

### 1. **Understand the Purpose of the Application**
   - Determine what you need the diagram to represent. Are you modeling a specific part of a system, or the entire system? Clarify the scope of your design. Analyze user needs and system constraints. Understand expected system interactions and workflows.

### 2. **Identify Key Classes**
   - Identify the main objects or entities that need to be represented in the system. These might include real-world objects or concepts that the software needs to model.

   - Example: In Insurance Application, classes could include `User`, `Policy`, `Application`, `Payment`, `PaymentHistory`, `Claim`, `Notification`, etc.

### 3. **Define Attributes**
   - Identify the properties or attributes that each class should have. These represent the data that each object will hold.
   - Example:
      - User class - `userID`, `name`, `email`, `password`, `phone number`, `address`, `dateOfBirth`.
      - Policy class - `policyID`, `policyName`, `description`, `coverageAmount`, `premiumAmount`, `policyType`, `startDate`, `endDate`.
      - Application class - `applicationID`, `applicationType`, `applicationDate`, `applicationStatus`.
      - Payment class - `paymentID`, `paymentAmount`, `paymentDate`, `paymentMethod`, `paymentStatus`.
      - PaymentHistory class - `paymentHistoryID`, `paymentDate`, `paymentAmount`, `paymentMethod`.
      - Claim class -  `claimID`, `claimDate`, `claimAmount`, `claimStatus`, `claimDetails`.
      - Notificatin class - `notificationID`, `notificationType`, `message`, `dateSent`.

### 4. **Define Methods**
   - Determine the behavior of each class by identifying the methods or functions each class will have. These operations define the actions that can be performed on instances of the class.

   - Example:
      - User class - `register()`, `logIn()`, `updateProfile()`, `receiveNotification()`.
      - Policy class - `viewDetails()`, `applyForPolicy()`, `renewPolicy()`, `cancelPolicy()`.
      - Application class - `submitApplication()`, `trackApplicationStatus()`.
      - Payment class - `makePayment()`, `viewPaymentHistory()`.
      - Claim class - `submitClaim()`, `trackClaimStatus()`, `viewClaimHistory()`.

### 5. **Define Relationships Between Classes**
   - Identify how the classes interact with each other. This includes:
     - **Associations**: Classes are related to one another in some way.
     - **Generalization**: One class inherits properties and behaviors from another.
     - **Aggregation/Composition**: One class is made up of other classes.
     - **Dependency**: One class depends on another for its functionality.
     - **Realization**: one class implements the behavior of the other class or interface.
   
   - Example: A `Library` class might have a one-to-many relationship with a `Book` class (one library has many books).

### 6. **Refine the Design**
   - To refine the class diagram, we need to ensure that it accurately reflects the real-world entities, attributes, their relationships, and their responsibilities in a manner that adheres to principles such as:
      
      - **Encapsulation**: Protects data and ensures controlled access.
      - **Abstraction**: Simplifies the system by hiding unnecessary details.
      - **Composition Over Inheritance**: Increases flexibility and modularity.
      - **Cohesion (Single Responsibility)**: Ensures that classes are focused and have a clear purpose.
      - **Open/Closed**: Enables easy extension without modifying existing code.
      - **Liskov Substitution Principle**: ensures that subclasses are extensions of their parent classes.
      - **Interface Segregation**: Promotes specialized interfaces, improving usability.
      - **Dependency Inversion**: Makes systems more flexible and maintainable.
      - **Normalization (DRY Principle)**: Ensures data consistency and reduces redundancy.
      - **MVC (Model-View-Controller)**: Separates business logic from UI and user input.
   
### 7. **Draw the Class Diagram**
   - Now, start creating the actual diagram using UML (Unified Modeling Language) notation:
     - **Class boxes**: Represent each class with a rectangle divided into three sections (name, attributes, and methods).
     - **Lines for relationships**: Draw lines to represent associations, inheritance, and other relationships.
     - **Arrows for directionality**: Use arrows to indicate the direction of associations or dependencies.
     - **Multiplicity**: Indicate the number of instances related (e.g., one-to-many, many-to-many) next to association lines.
---

## [Implementation](https://github.com/kvinay7/Insurance/blob/main/InsuranceApplication.java)
## [Spring Framework](https://github.com/kvinay7/interview-preparation/blob/main/Spring.md)
