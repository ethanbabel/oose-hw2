# Part 1: AI-Assisted Design

## Property Management Application

### Problem Statement

Tenants need a simple way to manage common rental tasks, such as paying rent, reporting maintenance issues, communicating with their landlord, and viewing community events. Landlords need a centralized system to receive payments, respond to requests, send messages, and share updates. The application should make these tasks faster, easier to track, and available from one place.

### User Stories

- As a tenant, I want to pay my monthly rent online so that I do not need to mail or deliver a payment.
- As a tenant, I want to view my rent payment history so that I can confirm which payments were completed.
- As a tenant, I want to submit a maintenance request so that my landlord can fix an issue in my unit.
- As a tenant, I want to track the status of my maintenance request so that I know whether it is pending, in progress, or completed.
- As a tenant, I want to send messages to my landlord so that I can ask questions or report concerns.
- As a landlord, I want to view tenant maintenance requests so that I can prioritize and respond to them.
- As a landlord, I want to post community events so that tenants can see upcoming activities or announcements.
- As a tenant, I want to view community events so that I can stay informed about what is happening in the property.

### Recommended Application Type

A mobile application is the best choice because tenants are likely to use the system for quick tasks, such as paying rent, submitting a maintenance request, or sending a message. A mobile app also supports push notifications for payment reminders, message alerts, and maintenance updates.

A web version could also be useful for landlords because it provides more screen space for managing requests, tenants, payments, and events.

### Recommended Software Architecture

A client-server architecture is appropriate for this application. The mobile app and web app would act as clients, while a backend server would handle authentication, rent payments, maintenance requests, messages, and event data.

This architecture works well because shared data needs to be stored centrally and accessed by different users. It also makes it easier to secure sensitive information, such as payment records and private messages.

### Suggested Software Stack

- Frontend mobile app: React Native
- Frontend web app: React
- Backend server: Node.js with Express
- Database: PostgreSQL
- Authentication: JSON Web Tokens or OAuth
- Payments: Stripe
- Messaging and notifications: Firebase Cloud Messaging
- Hosting: AWS, Azure, or Google Cloud

This stack is suitable because it supports both mobile and web clients, provides reliable database storage, and includes common tools for payments, authentication, and notifications.

# Part 2: Critical Reflection and Evaluation

### Problem Statement

I think the AI-generated problem statement aptly summarized the targetted pain point for the application, however it mostly did so by repeating the specs given in the assignment. 

### User Stories

The AI agent did an excelent job extrapolating individual use cases from the broader application description. It even added additional user stories that, while exactly included within the application spec given by the homework, are reasonable and achievable extensions that solve for user needs (e.g. allowing tenants to view rent payment history). 

### Recommended Application Type

In general I find the AI agent's recommendation of a hybrid mobile and web application acceptable. However, I feel that the focus on prioritizing the mobile application, with the web version as a secondary extension targeted mostly at landlords, to be less ideal. Personally, I feel that for larger, more impactful payments/purchases such as rent, that the average person prefers to use a laptop or PC to a mobile device. Thus I feel that prioritzing the web version over the mobile application, for tenants as well as landlords, would be a better approach. 

### Recommended Software Architecture

I wholeheartedly agree with the decision to use a client-server architecture for this application, as P2P/serverless alternatives are simply not suitable for an application that should be inherently centralized. 

### Suggested Software Stack

I find the AI generated tech stack to be very reasonable: 
- I think using React for the web app and React native for the mobile app should simplify development and maintenence. 
- This application is not one with lofty performance demands, so a javascript backend framework makes sense. 
- A relational database such as PostgreSQL is the perfect choice for a property management application that is likely to have fairly consistent schema.
- Outsourcing payments to an external provider like Stripe provides simplicity and reliability. 
- Cloud hosting allows for scalabilty. 
