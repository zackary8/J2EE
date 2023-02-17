# Projet JEE et Systèmes Distribués #
## Première partie du Projet : ##
## objectif ##
   Créer une application basée sur une architecture micro-service qui permet de gérer les factures contenant des produits et appartenant à un client.
 ### Travail a faire ###

        1.Créer le micro-service customer-service qui permet de gérer les client
        2.Créer le micro-service inventory-service qui permet de gérer les produits
        3. Créer la Gateway Spring cloud Gateway avec une Configuration statique du système de routage
        4. Créer l'annuaire Eureka Discrovery Service
        5. Faire une configuration dynamique des routes de la gateway
        6. Créer le service de facturation Billing-Service en utilisant Open Feign
        7. Créer un client Web Angular (Clients, Produits, Factures)
        8. Déployer le serveur keycloak :
             - Créer un Realm
             - Créer un client à sécuriser
             - Créer des utilisateurs
             - Créer des rôles
             - Affecter les rôles aux utilisateurs
             - Tester les différents modes d'authentification avec Postman en montrant les contenus de Access-Token, Refresh Token 
        9. Sécuriser les micro-services et le frontend angular en déployant les adaptateurs Keycloak
        10. Ajouter des Fonctionnalités supplémentaires de votre choix
        11. Livrable : Un Repository Github contenant :
           - Le code sources de l'ensemble des micro-services et du frontend
           - Le rapport montrant les différentes étapes dans le fichier README.MD
------------------------------------------------------------------------------------------------

### 1.Créer le micro-service customer-service qui permet de gérer les client
![1](https://user-images.githubusercontent.com/63524598/209022378-8f2c7fd0-2373-46b8-89e7-ab1a4c3b3eea.PNG)

### 2.Créer le micro-service inventory-service qui permet de gérer les produits
![2](https://user-images.githubusercontent.com/63524598/209022431-5ab3ede5-eaf5-4c34-92ec-9e5cf64fa18d.PNG)

### 3. Créer la Gateway Spring cloud Gateway avec une Configuration statique du système de routage
![3](https://user-images.githubusercontent.com/63524598/209027071-b2f50f49-8cd5-42cc-8152-dab1ae5edcf3.PNG)

![3,1](https://user-images.githubusercontent.com/63524598/209027215-3dfce026-6abb-4621-920e-66425d8c2798.PNG)

### 4. Créer l'annuaire Eureka Discrovery Service
![4](https://user-images.githubusercontent.com/63524598/209027247-18977234-f5b1-4da1-8c36-383c8f307394.PNG)

### 5. Faire une configuration dynamique des routes de la gateway

   ### 5-1 Customers 
![5,1](https://user-images.githubusercontent.com/63524598/209027375-299721e9-fa4d-42fe-b04f-a011f1f564e3.PNG)

   ### 5-2 Produits
![5;2](https://user-images.githubusercontent.com/63524598/209027466-d7107ed2-2277-491e-8fba-577edf4b038d.PNG)

   ### 5-3 Produits par ID
   ![5,4](https://user-images.githubusercontent.com/63524598/209027571-10fb1035-0800-4551-ae1c-00625b672257.PNG)

### 6. Créer le service de facturation Billing-Service en utilisant Open Feign

### 6.1  Recuperation des facteurs par id 
![6,1](https://user-images.githubusercontent.com/63524598/209027673-96a26df5-49e5-4a05-937b-8d249ffa38e9.PNG)

### 6.2	Récupérer la factures avec le détails de produits : 
![6,2](https://user-images.githubusercontent.com/63524598/209027715-4e0c5941-1145-4800-844c-d0dcaa745a7b.PNG)

### 7. Créer un client Web Angular (Clients, Produits, Factures):

  ### 7.1-Listes des produits:
![7,1](https://user-images.githubusercontent.com/63524598/209027779-8dd06a19-09af-43aa-8b8c-8227564abf80.PNG)

 ### 7.2-Les factures de chaque customer:
![7,3](https://user-images.githubusercontent.com/63524598/209027833-e397bb11-6e52-4e5b-b83a-eaffff8c134e.PNG)

### 8. Déployer le serveur keycloak Docker:
   - lancez Keycloak avec la commande suivante :
   
   docker run -p 8080:8080 -e KEYCLOAK_ADMIN=*** -e KEYCLOAK_ADMIN_PASSWORD=*** quay.io/keycloak/keycloak:20.0.2 start-dev
   
   - Créer un Realm!
   ![8,1](https://user-images.githubusercontent.com/63524598/209029140-f001a063-d32b-44c1-916f-a2a1eb7250e1.PNG)

     - Créer un client à sécuriser
![8,2](https://user-images.githubusercontent.com/63524598/209029183-1f4a57a0-6680-413a-9b9a-82c583e4feda.PNG)

     - Tester les différents modes d'authentification avec Postman en montrant les contenus de Access-Token, Refresh Token :     
   ![8 test](https://user-images.githubusercontent.com/63524598/209029190-fdb4509b-938e-4319-9a8c-babd011a51ff.PNG)

### 9. Sécuriser les micro-services et le frontend angular en déployant les adaptateurs Keycloak

### 9.1: Connecter a un user 

![9](https://user-images.githubusercontent.com/63524598/209029307-c9bf8454-c4c8-4372-a730-353265dce38b.PNG)

### 9.2 Product 
![9,1](https://user-images.githubusercontent.com/63524598/209029337-9defd00e-39fb-415c-b136-4b8f5509c8ee.PNG)

# Dernière partie à ajouter : #
 ### Travail a faire ###
1. Intégration du Bocker KAFKA
2. Création d'un micro-service qui permet de produire aléatoirement des factures et de les publier dans un Topic KAFKA
3. Permettre au Micro-service déjà développé BILLING-SERVICE de consommer les factures publier dans le Topic KAFKA et de les enregistrer dans sa base de données
4. Créer un micro-service Data-Analytics-Service qui utilise l'API KAFKA Streams pour effectuer du Real Time Stream Processing en consommant le streams de facture publiées dans le Topic KAFKA
5. Créer une Page Frontend qui permet de présenter en temps réel les courbes qui montrent les résultats produits par le service du Data Analytics
6. Déployer l'ensemble des services de l'application en utilisant des conteneur Docker : Créer les images Docker pour chaque service et et le fichier Docker-compose.yml qui permet de déployer toute l'application
------------------------------------------------------------------------------------------------
### 1. Intégration du Bocker KAFKA
### 2. Création d'un micro-service qui permet de produire aléatoirement des factures et de les publier dans un Topic KAFKA
![2](https://user-images.githubusercontent.com/63524598/219706688-7c79afb1-5ab4-4b73-a171-8634df14dab8.PNG)

### 3. Permettre au Micro-service déjà développé BILLING-SERVICE de consommer les factures publier dans le Topic KAFKA et de les enregistrer dans sa base de données
![3](https://user-images.githubusercontent.com/63524598/219706880-0881bf97-c341-438a-97a4-2360745f2207.PNG)

### 4. Créer un micro-service Data-Analytics-Service qui utilise l'API KAFKA Streams pour effectuer du Real Time Stream Processing en consommant le streams de facture publiées dans le Topic KAFKA
![4](https://user-images.githubusercontent.com/63524598/219706990-6c733f93-d537-4f32-9427-411dd0c28e11.PNG)

### 5. Créer une Page Frontend qui permet de présenter en temps réel les courbes qui montrent les résultats produits par le service du Data Analytics
![5](https://user-images.githubusercontent.com/63524598/219707016-16ea913f-1ad4-4d96-b210-5cf740335df5.PNG)






