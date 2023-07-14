# Projeto Spring Boot

Este é um projeto baseado no Spring Boot. Siga as etapas abaixo para instalar e executar o projeto em sua máquina.

## Pré-requisitos

- JDK (Java Development Kit) 8 ou superior instalado e configurado corretamente.
- Maven (https://maven.apache.org/) instalado e configurado corretamente.

## Instalação

1. Clone este repositório para o seu diretório local:

git clone <URL_DO_REPOSITÓRIO>

2. Navegue até o diretório do projeto:

cd nome-do-projeto

3. Compile o projeto usando o Maven:

mvn clean install

## Executando o projeto

Após a conclusão da instalação, você pode executar o projeto usando o seguinte comando:

mvn spring-boot:run

O servidor embutido do Spring Boot será iniciado e você poderá acessar o aplicativo no seu navegador através do seguinte URL: `http://localhost:8080`.

## Contribuição

Sinta-se à vontade para contribuir para este projeto através de pull requests.

## Licença

Este projeto está licenciado sob a [Licença XYZ](URL_DA_LICENÇA).

Certifique-se de substituir <URL_DO_REPOSITÓRIO>, nome-do-projeto e URL_DA_LICENÇA pelas informações relevantes do seu projeto.

Lembre-se de personalizar as instruções conforme necessário, dependendo das peculiaridades do seu projeto.


### Desafio
Cadastro de usuário

1. Criar entidade do Usuario
    - Nome
    - e-mail
    - Data de Nascimento
    - 1 ou mais endereços sendo que 1 endereço é o default
    - Esse usuário tem q ter ativacao de desativação lógica
    - Ele esta ligado a um ou mais aplicações
    - ele tem senha de acesso

2. Listar esse usuario
3. Alterar
4. Deletar
5. Logar sendo que usuario é o e-mail