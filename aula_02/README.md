<h1>Projeto Blog Pessoal - Parte 01</h1>


<h2>Configurações do Projeto</h2>



<h3>Configurações</h3>



<div align="center"><img src="https://i.imgur.com/KYQAYYY.png" title="source: imgur.com" /></div>



| Item             | Descrição                                                    |
| ---------------- | ------------------------------------------------------------ |
| **Name**         | Nome do Projeto (Geralmente em letras minúsculas)            |
| **Type**         | Define o Gerenciador de Dependências (Maven)                 |
| **Packaging**    | Define como a aplicação será empacotada (JAR)                |
| **Java Version** | Versão do Java                                               |
| **Language**     | Linguagem (Java)                                             |
| **Group**        | O domínio reverso de sua empresa ou organização. **Exemplo:** *generation.org.br* -> ***br.org.generation*** |
| **Artifact**     | O artefato a ser gerado, ou seja, o nome da aplicação que será criada (Mesmo nome do projeto) |
| **Version**      | Versão da API (não alterar)                                  |
| **Description**  | Descrição do projeto                                         |
| **Package**      | Estrutura do pacote inicial da aplicação (Group + Artifact). Exemplo: ***<u>br.org.generation.helloworld</u>*** |



<h3>Dependências</h3>



<div align="center"><img src="https://i.imgur.com/4YgPRdc.png" title="source: imgur.com" /></div>

**Spring Boot Version**: Versão do Spring (Não alterar)

Neste projeto inserimos 5 dependências:

1. ***Spring Web***
2. ***Spring Boot Dev Tools***
3. ***Validation***
4. ***Spring Data JPA***
5. ***MySQL Driver***

Clique em **Finish** para concluir.



<h2>Versão do Java - pom.xml</h2>



Alterar a linha:

```xml
	<properties>
		<java.version>17</java.version>
	</properties>
```

para:

```xml
	<properties>
		<java.version>16</java.version>
	</properties>
```



<h2>Configuração do Banco de Dados</h2>



Inserir as linhas abaixo no arquivo **application.properties**, localizado em **src/main/resources**.

```properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database=mysql
spring.datasource.url=jdbc:mysql://localhost/db_blogpessoal?createDatabaseIfNotExist=true&serverTimezone=America/Sao_Paulo&useSSl=false
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.show-sql=true

spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL8Dialect

spring.jackson.date-format=yyyy-MM-dd HH:mm:ss
spring.jackson.time-zone=Brazil/East
```



<h2>Próximas Etapas...</h2>




- [x] Criação da Camada Model
  - [x] Classe Postagem
- [x] Criação da Camada Repository
  - [x] Interface PostagemRepository
- [x] Criação da Camada Controller
  - [x] Classe PostagemController 
    - [x] Método getAll()

