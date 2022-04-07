# CRUD em Java com JDBC

## O que é JDBC

De acordo com site da [IBM](https://www.ibm.com/docs/pt-br/developer-for-zos/14.1.0?topic=support-what-is-jdbc), JDBC significa:  
"JDBC significa Java™ EE Database Connectivity. No desenvolvimento Java EE, esta é uma tecnologia bem conhecida e comumente utilizada para a implementação da interação do banco de dados."  

## Primeiros Passos

Primeiramente deve-se realizar o clone/download do repositório.  
Dentro da pasta `/src` criar uma pasta chamada `/lib`.  
Realizar o download do arquivo `.jar` do mysql connector ([link para download](https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.26)).  
Com o arquivo connector baixado, colocar o mesmo dentro da pasta `/lib` que foi criada recentemente.  
Executar o arquivo `db_teste.sql` no MySQL.

Obs.: iremos utilizar o banco de dados [MySQL](https://www.mysql.com/).

## Arquivos
Dentro da pasta `/connections` teremos 2 classes principais para conexão, uma para mapeamento e outra para conexão com o banco.

- Conexao.java
- FabricaConexao.java  

Dentro da pasta `crud`, teremos 5 classes que irá realizar a aplicação base do sistema.

- Create.java
- Delete.java
- Insert.java
- Read.java
- Update.java

Dentro da pasta `/objects` teremos a classe principal com todos os métodos necessários.

- Pessoa.java