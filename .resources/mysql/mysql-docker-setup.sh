#!/usr/bin/env bash

docker stop mysql
docker rm mysql
docker run -d --name=mysql -p 3306:3306 -v /var/lib/mysql:/var/lib/mysql --env="MYSQL_ROOT_PASSWORD=password" mysql