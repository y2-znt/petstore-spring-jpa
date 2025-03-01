# Projet PetStore

## Auteur
- Yoni Deserbaix

## Description du projet

Ce projet est une application de gestion d'animalerie (PetStore) développée avec Spring Boot et JPA.
L'application permet de gérer des animaleries, leurs adresses, les produits qu'elles vendent, ainsi que les animaux qu'elles hébergent (chats et poissons).

<img width="761" alt="image" src="https://github.com/user-attachments/assets/b0304d07-6c90-49b0-b5d3-997ad3e1330d" />

## Structure du projet

Le projet est organisé selon l'architecture suivante :

- `model` : Contient les entités JPA (Animal, Cat, Fish, PetStore, Product, Address, etc.)
- `repository` : Contient les interfaces de repository Spring Data JPA
- `PetstoreApplication` : Classe principale qui initialise l'application et contient des données de test

### Modèles de données

- **Animal** : Classe de base pour tous les animaux (avec héritage)
- **Cat** : Représente un chat (hérite d'Animal)
- **Fish** : Représente un poisson (hérite d'Animal)
- **PetStore** : Représente une animalerie
- **Product** : Représente un produit vendu dans une animalerie
- **Address** : Représente l'adresse d'une animalerie
- **Énumérations** :
  - `FishLivEnv` : Environnement de vie des poissons (eau douce, eau de mer)
  - `ProdType` : Type de produit (nourriture, accessoire, nettoyage)

## Prérequis

- Java 17
- Maven
- MariaDB

## Configuration de la base de données

L'application utilise MariaDB comme système de gestion de base de données. Voici les paramètres de configuration :

- URL : `jdbc:mariadb://localhost:3306/PetStoreDB`
- Utilisateur : `root`
- Mot de passe : `root`

Assurez-vous que :

1. MariaDB est installé et en cours d'exécution
2. La base de données `PetStoreDB` existe
3. L'utilisateur `root` a les droits d'accès nécessaires

## Installation et exécution

### Cloner le dépôt

```bash
git clone https://github.com/y2-znt/petstore-spring-jpa.git
cd petstore
```

### Compiler et exécuter l'application

```bash
mvn clean install
mvn spring-boot:run
```

L'application démarrera et créera automatiquement les tables nécessaires dans la base de données (grâce à `spring.jpa.hibernate.ddl-auto=update`). Des données de test seront également insérées via la méthode `run()` de la classe `PetstoreApplication`.

## Fonctionnalités

- Création et gestion d'animaleries avec leurs adresses
- Gestion des produits vendus dans chaque animalerie
- Gestion des animaux (chats et poissons) présents dans chaque animalerie
- Affichage des informations en console
