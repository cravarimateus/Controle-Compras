# Controle de Compras — API REST

> API REST que modela um fluxo real de compras corporativas — criação e gestão de pedido e cadastro de fornecedores.

---

## Tecnologias Utilizadas

| Tecnologia |
|---|
| Java |
| Spring Boot |
| Spring MVC |
| Spring Data JPA |
| Spring Validation |
| MySQL |
| Swagger / SpringDoc OpenAPI |
| Maven |

---

## Sobre o Projeto

Este projeto simula o backend de um módulo de compras corporativo. A API expõe endpoints RESTful para gerenciar pedidos de compra e fornecedores, com validações robustas, persistência em banco relacional e documentação interativa gerada automaticamente.

O domínio do projeto é baseado em experiência real com sistemas ERP de compras — o que garante que o modelo de dados e os fluxos implementados reflitam cenários corporativos reais.

---

## Funcionalidades

- **CRUD de Pedidos de Compra** — criação, listagem, atualização e exclusão com validações
- **Gestão de Fornecedores** — cadastro e gerenciamento com relacionamento aos pedidos
- **Documentação Swagger** — documentação automática e interativa via SpringDoc OpenAPI
- **Persistência JPA/Hibernate** — mapeamento de entidades com banco MySQL
- **Validações de Entrada** — Bean Validation com Spring nos endpoints REST

---

## Exemplos de Endpoints

```
GET    /pedidos              → Listar todos os pedidos
GET    /pedidos/{id}         → Buscar pedido por ID
POST   /pedidos              → Criar novo pedido
PUT    /pedidos/{id}         → Atualizar pedido existente
DELETE /pedidos/{id}         → Remover pedido

GET    /fornecedores         → Listar fornecedores
GET    /fornecedores/{id}    → Buscar fornecedor por ID
POST   /fornecedores         → Cadastrar fornecedor
PUT    /fornecedores/{id}    → Atualizar fornecedor
DELETE /fornecedores/{id}    → Remover fornecedor
```

---

## Como Executar

### Pré-requisitos
- Java 21
- MySQL
- Maven

### Passos

```bash
# 1. Clone o repositório
git clone https://github.com/cravarimateus/Controle-Compras

# 2. Configure o banco de dados em src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/compras_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update

# 3. Execute com Maven Wrapper
./mvnw spring-boot:run

# 4. Acesse a documentação Swagger
http://localhost:8080/swagger-ui.html
```

---

## Estrutura do Projeto

```
src/
├── main/
│   ├── java/com/mateus/comprasapi/
│   │   ├── controller/     # Endpoints REST
│   │   ├── service/        # Regras de negócio
│   │   ├── repository/     # Acesso a dados (JPA)
│   │   ├── model/          # Entidades JPA
│   │   └── dto/            # Objetos de transferência
│   └── resources/
│       └── application.properties
└── test/
```


