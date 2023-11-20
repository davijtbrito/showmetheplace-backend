# showmetheplace-backend
Backdend for the Application that uses:

1. Microservices using Spring Boot;
2. Domain Driven Design;
3. Postgress Database;

## Domains
1. Place (Id, Country, City);
2. Customer (Id, Name, Email, Phone);
3. Helper (Id, Name, Email, Phone);
4. Call (Id, Id_Customer, id_Place, DateTime);
5. Answer (Id, Id_Call, Id_Helper);
6. Rating (Id, Id_Client, Id_Helper, Rate)