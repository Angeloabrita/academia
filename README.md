# Projeto Go horse Academia
![Logo](https://github.com/Angeloabrita/resume/blob/master/doc/index.png?raw=true)

Este é um projeto de aplicação web empacotado como um arquivo WAR. Ele é construído utilizando Jakarta EE 11 e várias dependências, incluindo PrimeFaces, Hibernate e PostgreSQL. O aplicativo utiliza JDK 17 e o servidor de aplicações WildFly 32.0.1.Final.

## Informações do Projeto

- **Group ID:** com.angeloabrita
- **Artifact ID:** academia
- **Versão:** 0.01
- **Empacotamento:** WAR

## Dependências

O projeto depende das seguintes bibliotecas:

- **Jakarta EE API:** 11.0.0-M1 (provided)
- **Jakarta Inject API:** 2.0.1
- **Jakarta Faces API:** 4.1.0
- **PrimeFaces:** 14.0.0 (classifier: jakarta)
- **Yasson (Eclipse JSON Binding):** 3.0.2
- **Hibernate Core:** 6.5.2.Final
- **PostgreSQL JDBC Driver:** 42.7.3
- **JUnit:** 4.13.2 (escopo: test)
- **Mockito Core:** 5.12.0 (escopo: test)

## Plugins de Build

O projeto utiliza os seguintes plugins de build:

- **Maven Compiler Plugin**
  - **Versão:** 3.12.1
  - **Configuração:**
    - **Source:** 17
    - **Target:** 17
- **Maven WAR Plugin**
  - **Versão:** 3.4.0

## Propriedades

- **Codificação de Fonte:** UTF-8
- **Versão do Jakarta EE:** 11.0.0-M1

## Configuração do Hibernate

O arquivo `hibernate.cfg.xml` deve ser configurado conforme abaixo:

```xml
<hibernate-configuration>
    <session-factory>
        <property name="hibernate.dialect">org.hibernate.dialect.PostgreSQLDialect</property>
        <property name="hibernate.connection.driver_class">org.postgresql.Driver</property>
        <!-- Atere para o bando de dados que deseja usar -->
        <property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/postgres</property>
        <!-- Altere o user name para o usuario do banco de dados -->
        <property name="hibernate.connection.username">postgres</property>
        <!-- Altere a senha para a senha do banco de dados -->
        <property name="hibernate.connection.password">Gael2020@</property>
        <property name="hibernate.hbm2ddl.auto">update</property>
        <property name="hibernate.show_sql">true</property>
        
        <mapping class="com.angeloabrita.academia.model.Aluno"/>
        <mapping class="com.angeloabrita.academia.model.ResponsavelLegal"/>
        <mapping class="com.angeloabrita.academia.model.FichaTreino"/>
        
    </session-factory>
</hibernate-configuration> 

```

# TODO

- Resolver bugs
- aplicar logica no front com PrimeFace 



