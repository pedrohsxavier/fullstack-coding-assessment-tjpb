# 📄 Backend - Fullstack Coding Assessment

## 1️⃣ Descrição do Projeto

Este projeto é um **desafio técnico backend** desenvolvido com **Spring Boot** para gerenciar usuários e solicitações.  
A aplicação usa **PostgreSQL** como banco de dados, **Flyway** para gerenciar as migrations, e **Lombok** para reduzir o código repetitivo.

O backend fornece endpoints RESTful para cadastro e manipulação de usuários e solicitações.

---

## 2️⃣ Tecnologias Utilizadas

| Tecnologia        | Descrição |
|-------------------|-----------|
| **Java 17+**      | Linguagem de programação principal. |
| **Spring Boot 3** | Framework para criação do backend RESTful. |
| **Spring Data JPA** | Para manipulação de entidades no banco de dados. |
| **Flyway**        | Gerenciamento de migrations do banco de dados. |
| **Lombok**        | Redução de código repetitivo (getters/setters, construtores). |
| **PostgreSQL 13+** | Banco de dados relacional utilizado para persistência. |
| **Maven**         | Gerenciamento de dependências e build do backend. |

---

## 3️⃣ Configuração do Banco de Dados

- Crie o banco de dados no PostgreSQL:

```sql
CREATE DATABASE court_requests_db;
```

Configure o application.properties:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/court_requests_db
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true

Flyway
spring.flyway.enabled=true
spring.flyway.locations=classpath:db/migration
```

## 4️⃣ Rodando o Backend

* Certifique-se que o PostgreSQL está rodando e que o banco court_requests_db existe.

* Navegue até o diretório do backend:

```
cd backend
``` 

* Execute o backend com Maven:

```
mvn clean install
mvn spring-boot:run
```

O Flyway aplicará automaticamente as migrations e criará as tabelas no banco de dados.

## 5️⃣ Endpoints REST Disponíveis

| Endpoint        | Método | Descrição                   |
| --------------- | ------ | --------------------------- |
| `/usuarios`     | GET    | Lista todos os usuários     |
| `/usuarios`     | POST   | Cria um novo usuário        |
| `/solicitacoes` | GET    | Lista todas as solicitações |
| `/solicitacoes` | POST   | Cria uma nova solicitação   |
