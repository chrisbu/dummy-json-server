Usage:

```
mvn spring-boot:run
```



to post data:
```
curl -X POST \
  http://localhost:8080/api/users \
  -H 'accept: application/xml' \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -d '{
  "firstName":"Test",
  "lastName":"Test",
  "email":"test@test.com",
  "password":"123"
}'
```
