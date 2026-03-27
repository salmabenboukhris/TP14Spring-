#!/bin/bash

echo "Compilation du projet Spring Boot..."
mkdir -p logs

mvn clean package -DskipTests

if [ $? -ne 0 ]; then
    echo "Erreur lors de la compilation."
    exit 1
fi

echo "Déploiement de la nouvelle version..."

nohup java -jar target/*.jar > logs/deploy.log 2>&1 &
echo $! > logs/deploy.pid

echo "Nouvelle version déployée avec succès (PID : $!)"