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
Hashed Password: <hashedpassword>
```

test the validation 
```bash 
curl -X POST "http://localhost:8080/auth/login?username=john&password=secret&storedHashedPassword=<hashedpassword>" \
     -H "X-Requested-With: XMLHttpRequest" \
     -H "Content-Type: application/x-www-form-urlencoded"
```
