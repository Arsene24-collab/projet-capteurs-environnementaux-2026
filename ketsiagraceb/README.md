Projet Capteurs Environnementaux 2026

Auteure
ketsiagraceb — Analyse des données, exceptions, statistiques, rapport.
Description du module
Ce module a pour objectif d’analyser les mesures générées par le module de génération (capteurs environnementaux). Il assure :
-la lecture du fichier CSV contenant les mesures,
-la validation des données via des exceptions personnalisées,
-le calcul de statistiques (min, max, moyenne),
-la détection d’anomalies,
-la production d’un rapport d’analyse.
Ce module fonctionne indépendamment, mais dépend du fichier data/mesures.csv généré par le module d’Arsene.
Structure du module
ketsiagraceb/
│
├── analyse/
│   ├── AnalyseTemperature.java
│   ├── AnalyseHumidite.java
│   └── AnalysePression.java
│
├── exceptions/
│   └── DonneeInvalideException.java
│
├── model/
│   └── Mesure.java
│
├── utils/
│   └── MainAnalyse.java
│
└── test.txt

Fonctionnalités principales
🔹 Analyse des mesures
-Lecture du fichier CSV
-Conversion des lignes en objets Mesure
-Validation des valeurs (température, humidité, pression)
-Exceptions personnalisées
-DonneeInvalideException Déclenchée lorsque les données sont incohérentes ou hors limites.
🔹 Calculs statistiques
-Minimum
-Maximum
-Moyenne
-Détection d’anomalies (valeurs extrêmes)
🔹 Rapport d’analyse
-Résultats écrits dans : data/rapport_analyse.txt
Instructions d’exécution

1. Vérifier la présence du fichier CSV
data/mesures.csv
2. Lancer l’analyse
   Dans IntelliJ :
   •	Ouvrir la classe :   ketsiagraceb/utils/MainAnalyse.java
   •	Exécuter le programme.
3. Consulter le rapport
   •	Le rapport est généré automatiquement dans : data/rapport_analyse.txt
   Tests
   •	Le fichier test.txt contient des données de test permettant de vérifier le comportement du module en cas de valeurs invalides ou extrêmes.

Rôle dans le projet
-Analyse complète des données environnementales
-Gestion des erreurs via exceptions
-Calculs statistiques
-Production du rapport final
-Validation de la cohérence des mesuress