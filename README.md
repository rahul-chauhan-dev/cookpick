# 🛒 CookPick

CookPick is an online application that helps customers purchase grocery items at the best price in the market.

## Tech Stack

- Java 17
- Spring Boot 3.x
- Maven

## How to Run

```bash
mvn spring-boot:run
```

App runs at: `http://localhost:8080`

## API Endpoints

| Method | URL | Description |
|--------|-----|-------------|
| GET | `/greet` | Returns a welcome message with the current day |
| POST | `/product` | Add a new product |
| GET | `/product/{productName}` | Search products by name |
| GET | `/product?productName=&productVendor=` | Search products by name and vendor |

## Sample Request

**POST** `/product`

```json
{
  "productCode": 103,
  "productName": "Mango",
  "productVendor": "FreshFarm",
  "productPrice": 80.0,
  "productInStock": 100
}
```

**Response:**
```
Mango added successfully.
```
