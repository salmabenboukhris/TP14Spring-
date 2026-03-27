# TP : Automatisation Spring Boot avec Bash

##  Objectif

L’objectif de ce TP est d’automatiser le cycle de vie d’une application Spring Boot à l’aide de scripts Bash :

* démarrage de l’application
* arrêt du serveur
* consultation des logs
* déploiement
* vérification de l’état du service
* archivage des logs



##  Structure du projet

<img width="621" height="737" alt="architecture projet" src="https://github.com/user-attachments/assets/cd99623e-a443-447d-b6df-fee5a3f14334" />


##  Exécution et validation

###  Donner les permissions

<img width="813" height="80" alt="chmod" src="https://github.com/user-attachments/assets/ffedfdd7-e6d7-426f-8a71-9c09f4188825" />

Cette commande permet de rendre les scripts exécutables.


###  Lancer l’application

<img width="942" height="113" alt="run sh" src="https://github.com/user-attachments/assets/5975f0bc-ca34-4876-a9a0-868bbe85c0d2" />

 Ce script démarre l’application Spring Boot en arrière-plan.

###  Vérifier les logs

<img width="866" height="607" alt="logs sh" src="https://github.com/user-attachments/assets/1d2d25d6-1719-44c4-8e53-26b74d1ec6ac" />


 Ce script affiche les dernières lignes du fichier de logs pour vérifier que l’application fonctionne correctement.


###  Accès via navigateur

<img width="552" height="244" alt="application " src="https://github.com/user-attachments/assets/aedba121-c3a9-433e-a880-8f5de870f640" />

 L’application est accessible via le navigateur.


###  Arrêter l’application


<img width="865" height="112" alt="stop sh" src="https://github.com/user-attachments/assets/c946b957-00fd-43b0-b7ce-a91bbf8031e0" />

 Ce script permet d’arrêter le serveur Spring Boot et libérer le port 8085.


##   Approfondissement

###  Health Check


<img width="965" height="166" alt="healthcheck sh" src="https://github.com/user-attachments/assets/4dad34a4-50ef-4d23-a347-ecb518b1aa9f" />

 Ce script vérifie si l’application est disponible.
 
<img width="877" height="217" alt="l’archivage des logs marche" src="https://github.com/user-attachments/assets/ecc798d8-4757-4eb5-80ed-5ca82aa6ae6a" />


  Cela signifie que l’application fonctionne correctement.


###  Archivage des logs


<img width="866" height="607" alt="logs sh" src="https://github.com/user-attachments/assets/f306801b-0635-4e5e-908a-5fbe924c79ca" />



