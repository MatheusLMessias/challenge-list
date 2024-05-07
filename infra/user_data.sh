#!/bin/bash

sudo su
yum update -y
yum install -y docker
service docker start
usermod -a -g docker ec2-user

docker run -p 80:8080 matheusmessias/public-api:latest
