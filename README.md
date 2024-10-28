# Insurance Application

Here’s a detailed breakdown of the requirements and design for an insurance application:

### Requirements
1. **User Management**:
   - Users should be able to create accounts with personal details.
   - Users should be able to log in, view, and update their profile information.
   - Users must be able to reset forgotten passwords.

2. **Policy Management**:
   - Users must be able to view their existing insurance policies.
   - Users should be able to apply for new policies and modify existing ones.
   - Users should be able to renew policies that are about to expire.

3. **Claims Management**:
   - Users should be able to submit claims for their policies and view claim status.
   - Users must be able to update claims.
   - Admins should be able to approve or deny claims.

4. **Payment Processing**:
   - Users must be able to pay premiums using various methods.
   - Users should be able to view their payment history.
   - The system must allow users to request refunds for overpayments or canceled policies.

5. **Notifications**:
   - Users should receive alerts for important events (e.g., policy renewals, claim updates).
   - The system should send email confirmations for significant actions.

6. **Admin Management**:
   - Admins should be able to view and manage user accounts, policies, and claims.

#### Classes
1. **User**
   - **Properties**:
     - `userId`: Unique identifier for the user.
     - `name`: Full name of the user.
     - `email`: User's email address.
     - `password`: User's password (hashed for security).
   - **Methods**:
     - `register()`: Creates a new user account.
     - `login()`: Authenticates the user.
     - `updateProfile()`: Updates user profile information.
     - `resetPassword()`: Initiates the password reset process.

2. **Policy**
   - **Properties**:
     - `policyId`: Unique identifier for the policy.
     - `userId`: Associated user's ID.
     - `policyType`: Type of insurance (e.g., health, auto, life).
     - `coverageAmount`: Amount covered by the policy.
     - `startDate`: Start date of the policy.
     - `endDate`: Expiration date of the policy.
     - `premiumAmount`: Cost of the policy premium.
     - `status`: Current status of the policy (active, expired).
   - **Methods**:
     - `modifyPolicy()`: Updates policy details.
     - `renewPolicy()`: Renews the policy.

3. **Claim**
   - **Properties**:
     - `claimId`: Unique identifier for the claim.
     - `policyId`: Linked policy's ID.
     - `userId`: Associated user's ID.
     - `amountClaimed`: Amount being claimed.
     - `status`: Current status of the claim (submitted, under review, approved, denied).
     - `submissionDate`: Date the claim was submitted.
   - **Methods**:
     - `submitClaim()`: Submits a new claim.
     - `updateClaim()`: Updates claim details.

4. **Payment**
   - **Properties**:
     - `paymentId`: Unique identifier for the payment transaction.
     - `userId`: Associated user's ID.
     - `policyId`: Linked policy's ID.
     - `amount`: Amount paid.
     - `paymentDate`: Date of the payment.
     - `paymentMethod`: Method used for payment (credit card, bank transfer).
     - `status`: Status of the payment (completed, pending, failed).
   - **Methods**:
     - `makePayment()`: Processes a payment.
     - `requestRefund()`: Requests a refund for a payment.

5. **Notification**
   - **Properties**:
     - `notificationId`: Unique identifier for the notification.
     - `userId`: Associated user's ID.
     - `message`: Content of the notification.
     - `dateSent`: Date and time the notification was sent.
   - **Methods**:
     - `sendNotification()`: Sends a notification to the user.

6. **Admin**
   - **Properties**:
     - `adminId`: Unique identifier for the admin.
     - `name`: Name of the admin.
     - `email`: Email address of the admin.
   - **Methods**:
     - `manageUsers()`: Manages user accounts.
     - `reviewClaims()`: Reviews claims submitted by users.
     - `managePolicies()`: Modifies policies as needed.

7. **InsufficientStockException (Custom Exception)**
   - Exception thrown when a user tries to claim an amount exceeding their coverage.

8. **InsuranceApplication**
   - `main()`: Entry point of the application, demonstrating the usage of the insurance application.
