#!/bin/bash

echo "Arrêt de l'application Spring Boot..."

if [ -f logs/app.pid ]; then
    PID=$(cat logs/app.pid)

    if ps -p $PID > /dev/null; then
        kill -9 $PID
        rm -f logs/app.pid
        echo "Processus $PID arrêté avec succès."
    else
        echo "Le processus avec PID $PID n'existe plus."
        rm -f logs/app.pid
    fi
else
    PID=$(ps aux | grep 'spring-boot:run' | grep -v grep | awk '{print $2}')

    if [ -z "$PID" ]; then
        echo "Aucun processus Spring Boot trouvé."
    else
        kill -9 $PID
        echo "Processus $PID arrêté avec succès."
    fi
fi