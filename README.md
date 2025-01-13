run with 
```bash 
mvn spring-boot:run
```

to test register
```bash 
curl -X POST "http://localhost:8080/auth/register?username=john&password=secret" \
     -H "X-Requested-With: XMLHttpRequest" \
     -H "Content-Type: application/x-www-form-urlencoded"
```

it will log like this 
```bash 

User Registered: john
Hashed Password: $2a$10$nUcXIpXu2/lzn8a7IJI5pOEgvGABiIWFaRgr1xSrOK1OZmvbk8TSe
```

test the validation 
```bash 
curl -X POST http://localhost:8080/auth/login \
    -H "Content-Type: application/json" \
    -d '{"username": "john", "password": "secret"}'
```
