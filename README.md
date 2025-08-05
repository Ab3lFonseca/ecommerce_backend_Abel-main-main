# 🧩 PFHTML — API REST de Produtos com Spring Boot

Projeto final da disciplina de **HTML** com backend em **Java + Spring Boot**.  
Desenvolvido para fins acadêmicos.

---

## 📄 Descrição

Este projeto é uma **API REST** para gerenciamento de produtos, utilizando:
- Java 17+
- Spring Boot
- JPA (Hibernate)
- Banco de dados **MySQL**

A API permite cadastrar, listar, ordenar e filtrar produtos.

---

## ✨ Funcionalidades

- 🆕 Cadastro de produtos
- 📋 Listagem com ordenação e filtro por nome
- 💾 Persistência de dados com MySQL
- 🔧 Configuração flexível via `application.properties`

---

## 🧱 Estrutura do Projeto

| Arquivo / Classe               | Descrição |
|-------------------------------|-----------|
| `Produto.java`                | Entidade JPA do produto |
| `ProdutoRepository.java`      | Interface do repositório JPA |
| `ProdutoController.java`      | Controller REST da aplicação |
| `application.properties`      | Configurações do banco de dados e servidor |

---

## ⚙️ Requisitos

- ☕ Java 17 ou superior  
- 🛠️ Maven 3.9+  
- 🐬 MySQL rodando localmente

---

## 🔧 Configuração

Edite o arquivo `src/main/resources/application.properties` com as credenciais do seu banco MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

---

## ▶️ Como Rodar

1. **Instale as dependências e compile o projeto:**
   ```bash
   mvn clean install
   ```

2. **Execute a aplicação:**
   ```bash
   mvn spring-boot:run
   ```

3. Acesse a API em:  
   [http://localhost:8080/produto](http://localhost:8080/produto)

---

## 📮 Endpoints

| Método | Rota           | Descrição                     |
|--------|----------------|-------------------------------|
| `GET`  | `/produto`     | Lista produtos com filtros    |
| `POST` | `/produto`     | Cadastra um novo produto      |

---

## 🧪 Testes

Execute os testes da aplicação com:
```bash
mvn test
```

---

## 👨‍💻 Autor

**Abel Fonseca** — Trabalho final acadêmico  
📅 Ano: 2024

---
