# Readme - 🇧🇷 Gerenciamento de Fazendas e suas Plantações #
<h3>English Readme is at the end of the Page</h3>

📂 Estrutura de Pastas e Organização
A aplicação Back-End está organizada seguindo este padrão, proporcionando uma estrutura limpa e escalável. As pastas principais e suas responsabilidades são as seguintes:
<li>Entity</li>
<li>Respository</li>
<li>
  Controller
  <li>DTO/Serialização</li>
</li>
<li>Service</li>
<li>Security</li>


* Controller: Controladores que lidam com as requisições HTTP e a lógica de roteamento.
* Service: Camada de serviço que contém a lógica de negócios da aplicação.
* Entity/Repository: Modelos de dados e migrações para a criação e modificação do esquema do banco de dados.
* Security: Camada para configurarção e aplicação de camadas de segurança na aplicação e controle de acesso.

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

* Lista informações:
  <li>Todas as Fazendas</li>
  <li>Todas as Plantações</li>
  <li>Todos ss Fertilizantes</li>
  <li>Fazendas pelo seu ID</li>
  <li>Plantações pelo seu ID</li>
  <li>Fertilizantes pelo seu ID</li>
  
* Inserir:
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
* Na pasta frontend faça: `npm install`
* Na pasta backend faça: `npm install`
* Inicialize o contêiner na pasta backend: `docker compose up --build`
* Popule o banco de dados, na pasta backend faça: `db:reset`
* Após o contêiner ficar online, na pasta frontend faça: `npm start`

__Sua aplicação estará pronta para uso em seu navegador ou em sua IDE (ThunderClient)__

Logins:

__Usuário Padrão__  
email: "user@user.com"  
senha: "secret_user"

__Usuário Administrador__  
email: "admin@admin.com"  
senha: "secret_admin"

Para a área de desenvolvimento: 
token usuário padrão: `Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MiwiaWF0IjoxNjk1OTEyMDk5fQ.NpTpCiL0c7noOkdrDugs5O-CIZpTVO0jq8-9cK2r_Ss`  
token usuário administrador: `Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwiaWF0IjoxNjk1OTE0MzMxfQ.VHLVD5CHJNTKrppA_-buaw2_RzooM-DSBA_uo2I8d-w`

📍 Conclusão
Este Back-End de Gerenciamento de Partidas de Futebol oferece uma estrutura organizada, funcionalidades poderosas e segurança no acesso aos dados. Certifique-se de revisar a documentação do Front-End para obter informações completas sobre o uso da aplicação como um todo.

Para quaisquer dúvidas ou problemas, sinta-se à vontade para entrar em contato com a equipe de desenvolvimento.
Agradecemos por escolher nossa aplicação de Gerenciamento de Partidas de Futebol!

🧑‍💻 Equipe de Desenvolvimento  
Eduardo Malhao - https://www.linkedin.com/in/eduardo-malhao/  

# Readme - 🇺🇸 Soccer Match Management (Back-End) #  

<!-- Olá, Tryber!
- quais arquivos/pastas foram desenvolvidos por você; 
- quais arquivos/pastas foram desenvolvidos por outra pessoa estudante;
- quais arquivos/pastas foram desenvolvidos pela Trybe.
-->
