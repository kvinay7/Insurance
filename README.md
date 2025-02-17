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
      
## [System Modelling](https://github.com/kvinay7/Insurance/blob/main/Use%20Case%20Diagram.pdf)

## [Designing Class Diagram](https://github.com/ashishps1/awesome-low-level-design?tab=readme-ov-file)

### 1. **Understand the Purpose of the Application**
   - Determine what you need the diagram to represent. Are you modeling a specific part of a system, or the entire system? Clarify the scope of the design. Analyze user needs and system constraints. Understand expected system interactions and workflows.

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
     - **Specialization**: is a form of generalization, which means that a subclass is a more specific version of the superclass.
     - **Realization**: one class implements the behavior of the other class or interface.
     - **Aggregation/Composition**: One class is made up of other classes.
     - **Dependency**: One class depends on another for its functionality.
  
   - Example:
      - A User can have many Policies, Applications, Payments and Claims.
      - Policies generate Applications, require Payments, and cover Claims.
      - Payments relate to both Users and Policies.
      - Claim is related to both User and Policy.
      - Notifications are sent to Users. 
   
### 6. **Draw the Class Diagram**
   - Now, start creating the actual diagram using UML (Unified Modeling Language) notation:
     - **Class boxes**: Represent each class with a rectangle divided into three sections (name, attributes, and methods).
     - **Lines for relationships**: Draw lines to represent associations, inheritance, and other relationships.
     - **Arrows for directionality**: Use arrows to indicate the direction of associations or dependencies.
     - **Multiplicity**: Indicate the number of instances related (e.g., one-to-many, many-to-many) next to association lines.
   - [Example](https://uml.planttext.com/plantuml/png/XLNBRjim4BmRy3yGFlM11CrLXo9kZ28vr0sGzWDeQMqJuKCXAHj2qNylkQGiKgRIcpWSxSxiaijxOwcsdU3BnN9HSseC-Mr0ap_B1I6VE_VvjAa8anRNaWgeYB6QoGC282ZZ6TAw46UbcnmyAWdRJkn0PpXj6Wt6P5X3BVpSVsFQ7YlY5uXgE31ZGN_uY4kk3ayoVdUjPprhjMSS8gQX1dQ2hR9ipsfgcKBstz7bi-AixgFF5XUfqu1iftuRCBLchO-NuRKwWQO7M0lLILkHFLSq1j8WM2SA6vZXLz_c6R0V6sSeCG-ocI0d1kSDM5Ty4ntJjkNzTwM3hqiP99mpfAQo1Zv2IKNMBaAiLImB7P6qDWby9J_PcqXETbuijLtUTTFj1BE9XAZNQbg_hgU_Jdj9Um7I3iqCgwoR0Ieq8MnCf4Rq1zYZcXpai5Cm8EWhH1rHkkzHH1xTsLLwMl1yCrSVmOA9ijPPQrCJIVu7Jfc8QMl_dMP3O98BiUjC21TA4aA4KrfeDgPFs_mmnabAY6YvWEdrZZva0cMJAy6l3grmCyXTtginz0BUQB2FQN4qhkvMvERcArbzkRtzj1e6IKMEr9GPwSLoET3y37KuoHNnvsc65FhsdqXPRIeI1wBnBgBYTrKUtEJGphYPeuzADRnrJCyp1xau8r50ckf2lajAkLTwdeLk1_SM6hBhqLKKLA0AsW2oIfmywOKptCgCcdZclZZ4AlzBS5WC6eWD4gzfKPz_k0ORMTzAjhs0aFRUlGluSly3)

### 7. **Refine the Design**
   - To refine the class diagram, we need to ensure that it accurately reflects the real-world entities, attributes, their relationships, and their responsibilities in a manner that adheres to principles such as:
      - **[OOP](https://github.com/kvinay7/interview-preparation/blob/main/Java.md#object-oriented-programming-oop)**: helps to create efficient, modular, and maintainable code.
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
---

## [Implementation](https://github.com/kvinay7/Insurance/blob/main/InsuranceApplication.java)
## [Spring Framework](https://github.com/kvinay7/interview-preparation/blob/main/Spring.md)

## Design Patterns:

### 1. **Eager Initialization** (Thread-safe but not lazy-loaded)
This method creates the singleton instance as soon as the class is loaded and thread-safe.

```java
public class Singleton {
    // Instance is created at the time of class loading
    private static final Singleton INSTANCE = new Singleton();

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Public method to get the instance
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
```

### 2. **Lazy Initialization** (Not thread-safe)
In this method, the instance is created only when it is needed. However, it's not thread-safe by default.

```java
public class Singleton {
    private static Singleton instance;

    // Private constructor
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

### 3. **Thread-Safe Singleton (Using Synchronization)**
To make the above implementation thread-safe, we can synchronize the `getInstance()` method.

```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

### 4. **Double-Checked Locking Singleton**
This method reduces the overhead of synchronization by checking the instance twice — once without synchronization and then again with synchronization.

```java
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```

### 5. **Bill Pugh Singleton Design (Initialization-on-demand holder idiom)**
This is the most efficient way and is thread-safe. It takes advantage of the Java ClassLoader mechanism for lazy loading and thread-safety.

```java
public class Singleton {
    private Singleton() {}

    private static class SingletonHelper {
        // Singleton instance will be created when the class is loaded by the class loader
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
```
---
