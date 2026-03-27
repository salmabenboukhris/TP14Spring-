#!/bin/bash

echo "Affichage des 30 dernières lignes de logs :"

if [ -f logs/app.log ]; then
    tail -n 30 logs/app.log
else
    echo "Le fichier logs/app.log n'existe pas encore."
fi