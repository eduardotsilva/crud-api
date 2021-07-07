```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3)
```

# microserviço crud (produto)

#Desafio
1. Arquitetura Microserviços com Spring Cloud
2. RabbitMQ (Service Broker) 
3. Spring Boot e Security


#Execução
1. [Executar primeiro o microserviço-auth](https://github.com/eduardotsilva/microservico-auth/edit/main/README.md) 
2. Adicionar o token no headers como Authorization Bearer com verbo POST para o endpoint http://localhost:8081/crud/produto/
>  {
>   "nome": "Controle xbox asdas",
>  "estoque": 2,
>  "preco": 399
> }


