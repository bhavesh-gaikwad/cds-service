# Clinical Decision Support (CDS) Application


[CDS-PatientView-Demo.mp4](https://drive.google.com/file/d/18Vgz10phZdKGyvlSXEuDIfGaE8TXP4bV/view?usp=sharing)


[PostMan-Collection](https://github.com/bhavesh-gaikwad/cds-service/tree/main/Postman-Collection)



## API Reference

#### Get all avaible services

```http
  GET /api/v1/cds-services
```


#### Select service

```http
  POST /api/v1/cds-services/{services-id}
```

## Clinical Decision Support
CDS application basically provides different services and these services can be used by our healthcare application or any EHR’s. CDS Specification standards are compulsory for CDS development ( The CDS Hooks specification is an open standard developed by HL7 International).


### Application Explanation
This is basic CDS Service application with one service. Service to generate greet patient card.
User can get all services by using GET service API. User can generate greet patient card by using POST API by selecting service (patient-greeting).
This application is just sample architecture for CDS Service Backend. 

The complexity of application differs according to service use cases.
The decision support completely depends on use case and service requirements.

___

Sample Service Reference Link:
[Official-CDS-Sandbox](http://sandbox.cds-hooks.org/)
 ___
