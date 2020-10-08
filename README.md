Simply System.out() POST data to the console (and returns the same post data back to the caller)



Usage:

```
mvn spring-boot:run
```



to post data:
```
curl -X POST \
  http://localhost:8080/ \
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
