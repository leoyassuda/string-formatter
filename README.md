# String Formatter

Simple projeto para manipulação de Strings.

## Instruções

realizar o clone do repositório
```bash
git clone git@gitlab.com:leoyassuda/string-formatter.git
``` 

### Pré-requisitos

> - Java 1.8
> - Maven 3
> - Docker 


### Compilação e geração do projeto

```bash
mvn clean install -DskipTests
```

## Executando os testes

A implementar...

### Executando a aplicação

Por padrão será executado na porta 8282 e exposta pela mesma no Docker.

Após a execução o projeto, poderá ser inserido via terminal os parâmetros do subreddit e separados por ponto e virgula.

> Realizar o build do Docker e executar 
> - **Build:** `docker build --file=Dockerfile --tag=config-stringformatter:latest --rm=true .` 
> - **Run:** `docker run -i -t --name=app-stringFormatter --publish=8282:8282 --volume=app-stringFormatter:/var/lib/formatter/config-repo config-stringformatter:latest` 
> 

## Construído com

* [Spring-boot](https://projects.spring.io/spring-boot/) - Framework
* [Maven](https://maven.apache.org/) - Dependency management and automation of compilation and tests 
* [Docker](https://www.docker.com/) - Software containerization platform 

## Autor

* **Leo Yassuda** - *Initial work* - [String-Formatter](https://gitlab.com/leoyassuda/string-formatter) - site [www.leoyas.com](https://www.leoyas.com)
