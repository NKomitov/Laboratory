#!/usr/bin/bash

args_size=$#
server=$1
database=$2
table=$3
values=$4


mysql -h $server -u "root" -Bse "USE $database; INSERT INTO $table VALUES ($values)"