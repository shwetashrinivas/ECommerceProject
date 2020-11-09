## REST APIs - Configure for Read Only

1. Don't use Spring Data Rest
    1. Manually create @RestController
    2. Manually define methods for access: @GetMapping
    3. But we lose Spring Data Rest support for paging, sorting etc

2. Use Spring Data REST
    1. Configure to disable certain HTTP methods: POST, PUT , DELETE etc.
    2. Implement RepositoryRestConfigurer