# 🎓 Gestion des Étudiants — Spring Boot

Application web de gestion des étudiants développée avec Spring Boot, permettant d'effectuer les opérations CRUD sur les données des étudiants via une interface Thymeleaf.

---

## 🛠️ Technologies utilisées

| Technologie | Version |
|---|---|
| Java | 17 |
| Spring Boot | 4.0.6 |
| Spring MVC | — |
| Spring Data JPA | — |
| Thymeleaf | — |
| PostgreSQL | — |
| Maven | Wrapper inclus |

---

## 📋 Prérequis

Avant de lancer le projet, assurez-vous d'avoir installé :

- [Java 17+](https://adoptium.net/)
- [PostgreSQL](https://www.postgresql.org/download/)
- Maven (ou utiliser le wrapper `./mvnw` inclus)

---

## ⚙️ Configuration de la base de données

Créez une base de données PostgreSQL :

```sql
CREATE DATABASE gestion_etudiants;
```

Ensuite, configurez le fichier `src/main/resources/application.properties` :

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/gestion_etudiants
spring.datasource.username=votre_utilisateur
spring.datasource.password=votre_mot_de_passe

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

---

## 🚀 Lancement du projet

**Cloner le dépôt :**

```bash
git clone https://github.com/MedAmiiine04/gestion-etudiants-springboot.git
cd gestion-etudiants-springboot
```

**Lancer l'application :**

```bash
# Linux / macOS
./mvnw spring-boot:run

# Windows
mvnw.cmd spring-boot:run
```

L'application sera accessible à l'adresse : [http://localhost:8080](http://localhost:8080)

---

## 📁 Structure du projet

```
gestion-etudiants-springboot/
├── src/
│   ├── main/
│   │   ├── java/com/example/gestionEtudiants/
│   │   │   ├── controller/      # Contrôleurs Spring MVC
│   │   │   ├── model/           # Entités JPA (Etudiant, ...)
│   │   │   ├── repository/      # Interfaces Spring Data JPA
│   │   │   └── service/         # Logique métier
│   │   └── resources/
│   │       ├── templates/       # Vues Thymeleaf (HTML)
│   │       └── application.properties
│   └── test/
├── pom.xml
└── mvnw / mvnw.cmd
```

---

## ✨ Fonctionnalités

- ✅ Afficher la liste des étudiants
- ✅ Ajouter un nouvel étudiant
- ✅ Modifier les informations d'un étudiant
- ✅ Supprimer un étudiant
- ✅ Interface web avec Thymeleaf

---

## 🧪 Tests

```bash
./mvnw test
```

---

## 👤 Auteur

**Mohamed Amine Tayari** — [@MedAmiiine04](https://github.com/MedAmiiine04)

---

## 📄 Licence

Ce projet est open source et disponible sous la licence [MIT](LICENSE).
