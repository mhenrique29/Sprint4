Nome do Projeto - Sistema de Gestão de Carros
Descrição
Este projeto tem como objetivo fornecer um sistema de gestão de carros que utiliza tecnologias modernas para atender a requisitos de autenticação, segurança, internacionalização, mensageria, monitoramento e inteligência artificial (IA). A solução foi desenvolvida para a disciplina de [Disciplina/Curso] e é apresentada com uma arquitetura robusta e modular.

Funcionalidades
1. Autenticação e Segurança
Implementação do Spring Security para autenticação e gestão de perfis de segurança, com suporte para JWT para proteger endpoints.
2. Internacionalização
Configuração do sistema para suportar internacionalização, com mensagens localizadas para pt_BR e en_US usando application.properties.
3. Mensageria
Configuração e implementação de produtores e consumidores Kafka para envio e recebimento de mensagens no sistema, garantindo uma comunicação eficaz e eficiente entre os serviços.
4. Monitoramento
Spring Boot Actuator configurado para expor endpoints como /actuator/health e /actuator/metrics para monitoramento da aplicação, permitindo o acompanhamento de métricas e status da aplicação.
5. Inteligência Artificial
Integração com o Azure Cognitive Services para fornecer funcionalidade de IA no sistema, permitindo análises avançadas e respostas inteligentes.

    /src
├── main
│   ├── java/br/com/nossosite/carros
│   │   ├── config       # Configurações de segurança, IA, e Kafka
│   │   ├── controller   # Endpoints REST
│   │   ├── model        # Classes de domínio e entidades
│   │   ├── repository   # Interfaces de acesso a dados
│   │   ├── service      # Lógica de negócios e serviços
│   └── resources
│       ├── application.properties   # Configurações principais
│       └── messages.properties      # Arquivos de internacionalização
└── test
    └── java/br/com/nossosite/carros # Testes unitários e de integração






Nome do Projeto - Sistema de Gestão de Carros
Descrição
Este projeto tem como objetivo fornecer um sistema de gestão de carros que utiliza tecnologias modernas para atender a requisitos de autenticação, segurança, internacionalização, mensageria, monitoramento e inteligência artificial (IA). A solução foi desenvolvida para a disciplina de [Disciplina/Curso] e é apresentada com uma arquitetura robusta e modular.

Funcionalidades
1. Autenticação e Segurança
Implementação do Spring Security para autenticação e gestão de perfis de segurança, com suporte para JWT para proteger endpoints.
2. Internacionalização
Configuração do sistema para suportar internacionalização, com mensagens localizadas para pt_BR e en_US usando application.properties.
3. Mensageria
Configuração e implementação de produtores e consumidores Kafka para envio e recebimento de mensagens no sistema, garantindo uma comunicação eficaz e eficiente entre os serviços.
4. Monitoramento
Spring Boot Actuator configurado para expor endpoints como /actuator/health e /actuator/metrics para monitoramento da aplicação, permitindo o acompanhamento de métricas e status da aplicação.
5. Inteligência Artificial
Integração com o Azure Cognitive Services para fornecer funcionalidade de IA no sistema, permitindo análises avançadas e respostas inteligentes.
Estrutura de Pastas
bash

/src
├── main
│   ├── java/br/com/nossosite/carros
│   │   ├── config       # Configurações de segurança, IA, e Kafka
│   │   ├── controller   # Endpoints REST
│   │   ├── model        # Classes de domínio e entidades
│   │   ├── repository   # Interfaces de acesso a dados
│   │   ├── service      # Lógica de negócios e serviços
│   └── resources
│       ├── application.properties   # Configurações principais
│       └── messages.properties      # Arquivos de internacionalização
└── test
    └── java/br/com/nossosite/carros # Testes unitários e de integração



Pré-requisitos
Java 11
Maven
Kafka (em execução)
Banco de dados Oracle
Conta no Azure Cognitive Services para API de IA
Configuração
Clone o repositório:


git clone https://github.com/seu-usuario/nome-do-repositorio.git
cd nome-do-repositorio


Adicione as configurações do banco de dados e da IA em application.properties:


spring.datasource.url=jdbc:oracle:thin:@//oracle.fiap.com.br:1521/ORCL
spring.datasource.username=RM98768
spring.datasource.password=220405
spring.jpa.database-platform=org.hibernate.dialect.OracleDialect

# Azure Cognitive Services
azure.cognitive.subscription-key=SUA_CHAVE_AQUI
azure.cognitive.endpoint=URL_ENDPOINT_AQUI

Compile o projeto com o Maven:

bash
Copiar código
mvn clean install
Inicie a aplicação:

bash
Copiar código
mvn spring-boot:run





Nome do Projeto - Sistema de Gestão de Carros
Descrição
Este projeto tem como objetivo fornecer um sistema de gestão de carros que utiliza tecnologias modernas para atender a requisitos de autenticação, segurança, internacionalização, mensageria, monitoramento e inteligência artificial (IA). A solução foi desenvolvida para a disciplina de [Disciplina/Curso] e é apresentada com uma arquitetura robusta e modular.

Funcionalidades
1. Autenticação e Segurança
Implementação do Spring Security para autenticação e gestão de perfis de segurança, com suporte para JWT para proteger endpoints.
2. Internacionalização
Configuração do sistema para suportar internacionalização, com mensagens localizadas para pt_BR e en_US usando application.properties.
3. Mensageria
Configuração e implementação de produtores e consumidores Kafka para envio e recebimento de mensagens no sistema, garantindo uma comunicação eficaz e eficiente entre os serviços.
4. Monitoramento
Spring Boot Actuator configurado para expor endpoints como /actuator/health e /actuator/metrics para monitoramento da aplicação, permitindo o acompanhamento de métricas e status da aplicação.
5. Inteligência Artificial
Integração com o Azure Cognitive Services para fornecer funcionalidade de IA no sistema, permitindo análises avançadas e respostas inteligentes.
Estrutura de Pastas
bash

/src
├── main
│   ├── java/br/com/nossosite/carros
│   │   ├── config       # Configurações de segurança, IA, e Kafka
│   │   ├── controller   # Endpoints REST
│   │   ├── model        # Classes de domínio e entidades
│   │   ├── repository   # Interfaces de acesso a dados
│   │   ├── service      # Lógica de negócios e serviços
│   └── resources
│       ├── application.properties   # Configurações principais
│       └── messages.properties      # Arquivos de internacionalização
└── test
    └── java/br/com/nossosite/carros # Testes unitários e de integração
Pré-requisitos
Java 11
Maven
Kafka (em execução)
Banco de dados Oracle
Conta no Azure Cognitive Services para API de IA
Configuração
Clone o repositório:

bash

git clone https://github.com/seu-usuario/nome-do-repositorio.git
cd nome-do-repositorio
Adicione as configurações do banco de dados e da IA em application.properties:

properties

spring.datasource.url=jdbc:oracle:thin:@//oracle.fiap.com.br:1521/ORCL
spring.datasource.username=RM98768
spring.datasource.password=220405
spring.jpa.database-platform=org.hibernate.dialect.OracleDialect

# Azure Cognitive Services
azure.cognitive.subscription-key= 6hchHPOFpqgOo1PIeYxvEHIL8bOiWw3wjvkf6VxJ9Ffy06hUOmAeJQQJ99AKACZoyfiXJ3w3AAAEACOGipHv
azure.cognitive.endpoint= https://api-web-rm551459.cognitiveservices.azure.com/
Compile o projeto com o Maven:

bash
mvn clean install

Inicie a aplicação:
bash

mvn spring-boot:run

Testes

Utilize a ferramenta [Postman ou Insomnia] para realizar testes nos endpoints da API.

Teste cada endpoint de autenticação, mensageria e IA para verificar seu funcionamento.
Monitoramento

Acesse http://localhost:8080/actuator/health para verificar o status da aplicação.
Use ferramentas como Grafana para visualizar métricas expostas pelo Actuator.

![image](https://github.com/user-attachments/assets/5fc0ebeb-8b50-4ba5-af3e-fd997395e106)


Integrantes

JOÃO DEVEZA RM:551459
DIEGO MECCO RM:98768
GABRIEL EDUARDO RM:98843
MARCOS HENRIQUE RM:98348
VICENZO GUARDABASSI RM:550208










