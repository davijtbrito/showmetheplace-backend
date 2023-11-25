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
6. InProgress(ID, CustomerId, HelperId)
7. Rating (Id, Id_Client, Id_Helper, Rate)
8. PointsInterest (Id, PlaceId, Category, Observation)
9. Category can be "Local Business", "Natural", "Historic"

## Main Functionality
1. Customer make a call;
2. App sends notification to all helpers in the location (Place);
3. Helper receives notification and choose to answer the call or not;
4. When answering a call, the app stop sending that notification to the helpers;
5. When finishing the InProgress, the call and the answer must be closed (active = false);

### Charging for the time
1. When the helper arrives to the destination is when is starting the time;
2. The customer should confirm that the helper arrived;

### Listing the Call
1. The helper sees a list of calls in the area (showing place)