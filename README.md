# Training Center Registry

Traini8: Problem Statement


## Endpoints

### 1. **Create Training Center**
- **URL:** `/trainingCenters/create`  
- **Method:** `POST`  
- **Request Body:**
```json
{
    "id": "67da61307d3cb46e7c158717",
    "centerName": "Vamshivat VOICE",
    "centerCode": "VVVVVVVVVVVV",
    "address": {
        "detailedAddress": "Kondhwa",
        "city": "Pune",
        "state": "Maharashtra",
        "pincode": "411048"
    },
    "studentCapacity": 30,
    "courceOffered": [
        "DYS"
    ],
    "createdOn": 1742364976,
    "contactEmail": "vv@gmail.com",
    "contactPhone": "1234567890"
}
```
- **Response:**
```json
{
  "message": "Training center created successfully!"
}
```

### 2. **Get Training Centers**
- **URL:** `/trainingCenters/get`  
- **Method:** `GET`  
- **Query Parameters:**
  - `centerName` (Optional) – Filter by center name  
  - `city` (Optional) – Filter by city  
  - `state` (Optional) – Filter by state  
  - `capacity` (Optional) – Filter by minimum student capacity  

**Example Request:**
```bash
curl -X GET "http://localhost:8080/trainingCenters/get?city=Pune&capacity=30"
```

**Example Response:**
```json
[
    {
        "id": "67da61307d3cb46e7c158717",
        "centerName": "Vamshivat VOICE",
        "centerCode": "VVVVVVVVVVVV",
        "address": {
            "detailedAddress": "Kondhwa",
            "city": "Pune",
            "state": "Maharashtra",
            "pincode": "411048"
        },
        "studentCapacity": 30,
        "courceOffered": [
            "DYS"
        ],
        "createdOn": 1742364976,
        "contactEmail": "vv@gmail.com",
        "contactPhone": "1234567890"
    }
]
```

---

## Setup Instructions

### 1. **Clone the repository**  
```bash
git clone https://github.com/Abhay-Jagtap4/Traini8.git
```

### 2. **Navigate to the project directory**  
```bash
cd traini8
```

### 3. **Start the application**  
```bash
./mvnw spring-boot:run
```

---

## Tech Stack
- **Java**
- **Spring Boot**
- **MongoDB**

---

## Validation Rules
| Field | Type | Validation |
|-------|------|------------|
| `centerName` | String | Required, max 40 characters |
| `centerCode` | String | Required, exactly 12 alphanumeric characters |
| `address.detailedAddress` | String | Required |
| `address.city` | String | Required |
| `address.state` | String | Required |
| `address.pincode` | String | Required |
| `studentCapacity` | Integer | Required |
| `courceOffered` | List<String> | Required |
| `contactEmail` | String | Optional, valid email |
| `contactPhone` | String | Required, valid phone number |

---

## Notes
- `CreatedOn` field is generated automatically by the system.  
- MongoDB stores the training center data.  

---