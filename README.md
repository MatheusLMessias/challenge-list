<h1 align="center">Challenge-List</h1>

### Topics
:small_blue_diamond: [About](#about-book)  
:small_blue_diamond: [Features](#features-wrench)  
:small_blue_diamond: [Running Application](#running-application-arrow_forward)  
:small_blue_diamond: [Developers Team](#developers-team-octocat)  

## About :book:
<p align="justify">
    Projeto de APIs em java + spring boot para criação, listagem, alteração e deleção em db mysql, utilizando terraform para provisionar na AWS EC2
</p>
<p align="center">
    <a href="https://www.java.com/pt-BR/" target="_blank">
        <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
    </a>
    <a href="https://spring.io/projects/spring-boot" target="_blank">
        <img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=flat-square&logo=Spring&logoColor=white" alt="Spring">
    </a>
    <a href="https://www.mysql.com/" target="_blank">
        <img src="https://shields.io/badge/MySQL-lightgrey?logo=mysql&style=plastic&logoColor=white&labelColor=blue" alt="Java">
    </a>
    <a href="https://aws.amazon.com/pt/free/?gclid=Cj0KCQjw_-GxBhC1ARIsADGgDjswVqNcYOV_bY4alWjiOLA7Mlj2eANvsgR4sa_i0e6ZZOJGiWci5T4aAr2KEALw_wcB&trk=2ee11bb2-bc40-4546-9852-2c4ad8e8f646&sc_channel=ps&ef_id=Cj0KCQjw_-GxBhC1ARIsADGgDjswVqNcYOV_bY4alWjiOLA7Mlj2eANvsgR4sa_i0e6ZZOJGiWci5T4aAr2KEALw_wcB:G:s&s_kwcid=AL!4422!3!696214219374!e!!g!!aws!15278604629!130587771740&all-free-tier.sort-by=item.additionalFields.SortRank&all-free-tier.sort-order=asc&awsf.Free%20Tier%20Types=*all&awsf.Free%20Tier%20Categories=*all" target="_blank">
        <img src="https://img.shields.io/badge/AWS-232F32?style=for-the-badge&logo=AmazonAWS&logoColor=white" alt="Java">
    </a>
</p>

## Features :wrench:
- [X] Criar
- [X] Listar
- [X] Alterar
- [X] Deletar

## Running Application :arrow_forward:
First, clone this repository:
```
git clone https://github.com/MatheusLMessias/Challenge-List.git
```
Java environment setup:
```
https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html
```
Terraform environment setup:
```
https://www.terraform.io/
```
In the project folder, install dependencies:
```
mvn clean install
```
In the project folder below
```
terraform init
```
Run app:
```
Run the application in your IDE

```
URLs:
```
Criar: localhost:8080/v1/todos/create
{
	"nome": "",
	"descricao": "",
	"prioridade":
}

Delete: localhost:8080/v1/todos/list
{}
Delete: localhost:8080/v1/todos/change/{id}
{
	"nome": "",
	"descricao": "",
	"prioridade":
}
Delete: localhost:8080/v1/todos/delete/{id}
{}

```

## Developers Team :octocat:
| [<img src="https://avatars.githubusercontent.com/u/101664656" width=115><br><sub>Matheus Messias</sub>](https://github.com/MatheusLMessias) | 
| :---: |
