# Readme - 🇧🇷 Gerenciamento de Fazendas e suas Plantações #
<h3>English Readme is at the end of the Page</h3>

📂 Estrutura de Pastas e Organização
A aplicação Back-End está organizada seguindo este padrão, proporcionando uma estrutura limpa e escalável. As pastas principais e suas responsabilidades são as seguintes:
<li>Entity</li>
<li>Respository</li>
<li>Controller</li>
<li>DTO/Serialização</li>
<li>Service</li>
<li>Security</li>

Controller: Controladores que lidam com as requisições HTTP e a lógica de roteamento.  
Service: Camada de serviço que contém a lógica de negócios da aplicação.  
Entity/Repository: Modelos de dados e migrações para a criação e modificação do esquema do banco de dados.  
Security: Camada para configurarção e aplicação de camadas de segurança na aplicação e controle de acesso.  

📚 Bibliotecas Utilizadas
Para o desenvolvimento deste projeto, foram utilizadas as seguintes bibliotecas:

* Spring Boot: Biblioteca
* Spring Data: adiciona persistência de dados à aplicação, trabalhando com bancos de dados diversos;
* Spring Actuator:controla de métricas e da saúde da nossa aplicação e do servidor.
* Spring Security: adiciona uma camada de segurança sobre nossa aplicação, permitindo trabalhar com conceitos de autenticação e autorização.
* JsonWebToken: Utilizado para autenticação e autorização baseada em tokens.
* Bcrypt: Biblioteca para a criptografia segura de senhas.
* Jupiter: Biblioteca responsável peloes testes de aplicação (Unitários e de Integração).


Funcionalidades
📑 Consulta e Inserção de Dados
Os usuários autenticados podem realizar as seguintes consultas:

Lista informações:  
  <li>Todas as Fazendas</li>  
  <li>Todas as Plantações</li>  
  <li>Todos ss Fertilizantes</li>  
  <li>Fazendas pelo seu ID</li>  
  <li>Plantações pelo seu ID</li>  
  <li>Fertilizantes pelo seu ID</li>
<br>
Inserir:
  <li>Usuários</li>  
  <li>Fazendas</li>  
  <li>Plantações</li>  
  <li>Fertilizantes</li>  
  <li>Plantações em determinada fazenda</li>
  <li>Fertilizantes em determinada plantação</li>

Ações Permitidas
Com base nas permissões do usuário, ele pode executar as seguintes ações:

* Criar novas fazendas.  
* Atribuir as plantações as fazendas.  
* Atribuir os fertilizantes as fazendas.  
* Recuperar as informações (Fazendas/Fertilizantes/Plantações)  

👨‍🔬 Testes
O Back-End foi submetido a Testes Unitários e Testes de Integração para garantir a qualidade do código e a funcionalidade da aplicação. A prática do TDD (Desenvolvimento Orientado por Testes) foi aplicada, e a cobertura de código foi mantida em níveis adequados.

📱 Executando a Aplicação
Para executar a aplicação Back-End, siga os seguintes passos:

Clone o repositório da aplicação.  
<!-- * Na pasta raíz faça: `mvn install -DskipTests`  
* Inicialize o Docker: `docker build -t agriculture`  
* Inicialize o container: `docker run -p 8080 agriculture`  

__Sua aplicação estará pronta para uso em sua IDE (Insomnia)__  -->
Logins para Registro:  

__Usuário Padrão__  
email: "user@user.com"  
senha: "secret_user"  
role: "ADMIN"  

__Usuário Administrador__  
email: "admin@admin.com"  
senha: "secret_admin"  
role: "USER"  

*Após o registro utilize a rota para login, para gerar seu Token e ter acesso as funcionalidades da API  

📍 Conclusão
Este Back-End de Gerenciamento de Fazendas e suas Plantações oferece uma estrutura organizada, funcionalidades poderosas e segurança no acesso aos dados.

Para quaisquer dúvidas ou problemas, sinta-se à vontade para entrar em contato com a equipe de desenvolvimento.
Agradecemos por escolher nossa aplicação de Gerenciamento de Fazendas e suas Plantações!

🧑‍💻 Equipe de Desenvolvimento  
Eduardo Malhao - https://www.linkedin.com/in/eduardo-malhao/  

# Readme - 🇺🇸 Farms and Crops Management (Back-End) #

📂 Folder Structure and Organization  
The Back-End application is organized following this pattern, providing a clean and scalable structure. The main folders and their responsibilities are as follows:
<li>Entity</li>
<li>Respository</li>
<li>Controller</li>
<li>DTO/Serialization</li>
<li>Service</li>
<li>Security</li>

Controller: Controllers that handle HTTP requests and routing logic.  
Service: Service layer that contains the application's business logic.  
Entity/Repository: Data models and migrations for creating and modifying the database schema.  
Security: Layer for configuring and applying security layers in the application and access control.  

📚 Libraries Used
For the development of this project, the following libraries were used:

* Spring Boot: Library
* Spring Data: adds data persistence to the application, working with different databases;
* Spring Actuator: controls metrics and the health of our application and server.
* Spring Security: adds a layer of security over our application, allowing us to work with authentication and authorization concepts.
* JsonWebToken: Used for token-based authentication and authorization.
* Bcrypt: Library for secure password encryption.
* Jupiter: Library responsible for application tests (Unit and Integration).


Functionalities
📑 Query and Data Insertion
Authenticated users can perform the following queries:

List information:
  <li>All Farms</li>
  <li>All Plantations</li>
  <li>All Fertilizers</li>
  <li>Farms by their ID</li>
  <li>Plantations by their ID</li>
  <li>Fertilizers by their ID</li>
<br>
Insert:
  <li>Users</li>
  <li>Farms</li>
  <li>Plantations</li>
  <li>Fertilizers</li>
  <li>Plantations on a specific farm</li>
  <li>Fertilizers in a specific plantation</li>

Allowed Actions
Based on the user's permissions, the user can perform the following actions:

* Create new farms.
* Assign plantations to farms.
* Assign fertilizers to farms.
* Retrieve information (Farms/Fertilizers/Plantations)

👨‍🔬 Tests
The Back-End was subjected to Unit Tests and Integration Tests to guarantee the quality of the code and the functionality of the application. The practice of TDD (Test Driven Development) was applied, and code coverage was maintained at adequate levels.

📱 Running the Application
 <!-- To run the Back-End application, follow these steps:

Clone the application repository.
* In the root folder do: `mvn install -DskipTests`
* Initialize Docker: `docker build -t agriculture`
* Initialize the container: `docker run -p 8080 agriculture`

__Your application will be ready to use in your IDE (Insomnia)__ -->

Registration Logins:
__Default User__  
email: "user@user.com"  
password: "secret_user"  
role: "ADMIN"  

__Administrator User__  
email: "admin@admin.com"  
password: "secret_admin"  
role: "USER"  

*After registration, use the login route to generate your Token and access the API features

📍 Conclusion
This Farm and Plantation Management Back-End offers an organized structure, powerful functionalities and secure data access.

For any questions or issues, feel free to contact the development team.
Thank you for choosing our Farm and Plantation Management application!

🧑‍💻 Development Team
Eduardo Malhao - https://www.linkedin.com/in/eduardo-malhao/
