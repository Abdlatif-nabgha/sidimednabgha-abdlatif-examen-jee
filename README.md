# Sidi-Abdlatif-Examen-JEE

Ce projet est une application de gestion de contrats d'assurance, développée dans le cadre de l'examen d'Architecture Distribuée et Middleware (Filières GLSID, II-BDCC).

## 🚀 Technologies Utilisées

- **Backend** : Spring Boot 3.5.x
- **Langage** : Java 21
- **Base de données** : MySQL
- **ORM** : Spring Data JPA / Hibernate
- **Mapping** : MapStruct (Interfaces)
- **Boilerplate** : Lombok
- **Documentation API** : Swagger UI / OpenAPI 3
- **Sécurité** : Spring Security (Base configurée)

## 🏗️ Architecture du Projet

L'application suit une architecture en couches standard :
1. **Couche Entité (JPA)** : Modèle de données avec héritage (`SINGLE_TABLE`) pour les contrats.
2. **Couche DAO (Repository)** : Interfaces Spring Data pour l'accès aux données.
3. **Couche Service** : Logique métier utilisant des DTOs (Records) et Mappers MapStruct.
4. **Couche Web (REST)** : Controllers exposant les APIs au format JSON.

## 📊 Modèle de Données

- **Client** : Nom, Email.
- **ContratAssurance** (Héritage) :
    - **Automobile** : Immatriculation, Marque, Modèle.
    - **Habitation** : Type logement, Adresse, Superficie.
    - **Santé** : Niveau de couverture, Nombre de personnes.
- **Paiement** : Date, Montant, Type (Mensualité, Annuel, Exceptionnel).

## ⚙️ Configuration

L'application est configurée pour fonctionner sur le port **8085**.

### Base de données (MySQL)
Assurez-vous que MySQL est en cours d'exécution et créez la base de données :
```sql
CREATE DATABASE sidi_abdlatif_examen_jee_db;
```
Les identifiants configurés dans `application.yaml` :
- **Username** : `nabgha`
- **Password** : `44026676`

## 🛠️ Installation et Exécution

1. Clonez le repository :
   ```bash
   git clone <votre-lien-repo>
   ```
2. Accédez au dossier du projet.
3. Lancez l'application avec Maven :
   ```bash
   ./mvnw spring-boot:run
   ```

## 📖 Documentation API (Swagger)

Une fois l'application lancée, la documentation interactive Swagger UI est disponible à l'adresse suivante :
[http://localhost:8085/swagger-ui/index.html](http://localhost:8085/swagger-ui/index.html)

---
**Auteur** : Abdellatif Nabgha  
**Filière** : GLSID / II-BDCC  
**Professeur** : Pr. YOUSSFI
