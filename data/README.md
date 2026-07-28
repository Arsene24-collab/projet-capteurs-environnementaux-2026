# Projet Capteurs Environnementaux 2026

Ce projet simule des capteurs environnementaux (Température, Humidité, Pression), génère des mesures aléatoires et les exporte dans un fichier CSV.

## 📁 Structure du projet


## 🎯 Objectifs

- Simuler des capteurs environnementaux
- Générer des mesures réalistes
- Exporter les données dans un fichier CSV
- Structurer un projet Java propre et modulaire

## 🧩 Fonctionnement des capteurs

Chaque capteur :
- possède un nom
- une unité
- génère une valeur aléatoire dans une plage réaliste

### Capteurs disponibles
- Température (°C)
- Humidité (%)
- Pression (hPa)

## 🔧 Génération des données

La classe `GenerateurDonnees` :
- instancie les capteurs
- génère un nombre défini de mesures
- ajoute un timestamp
- retourne une liste de lignes prêtes pour l’export CSV

## 📤 Export CSV

La classe `ExportCSV` :
- crée un fichier CSV
- écrit un en-tête
- ajoute toutes les mesures générées
- gère les erreurs d’écriture

## ▶️ Exécution

Lancer la classe `Main` :

```java
List<String[]> donnees = GenerateurDonnees.generer(10);
ExportCSV.exporter("data/mesures.csv", donnees);

Résultat dans la console 
Export CSV réussi : data/mesures.csv
Programme terminé.

Exemple de données générées
timestamp,capteur,valeur,unite
1785247800069,Température,20.31,°C
1785247800070,Humidité,46.04,%
1785247800070,Pression,1020.51,hPa

