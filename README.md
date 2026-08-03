# Projet Capteurs Environnementaux 2026

## Membres du groupe
- Arsene — Module de génération des données (capteurs, mesures, CSV)
- ketsiagraceb — Module d’analyse des données (exceptions, statistiques, rapport)

## Description générale
Ce projet simule un système de capteurs environnementaux produisant des mesures (température, humidité, pression), puis analyse ces données à l’aide d’un module dédié.

Le projet est divisé en deux modules indépendants :
- Module Génération (Arsene) : création des capteurs, génération de mesures réalistes, export CSV.
- Module Analyse (ketsiagraceb) : lecture des données, validation, exceptions, calculs statistiques, rapport d’analyse.

## Fonctionnalités développées

### Module Génération — Arsene
- Création de capteurs (Température, Humidité, Pression)
- Génération de mesures réalistes avec timestamp
- Export des données dans `data/mesures.csv`
- Utilitaires de génération et d’export (par ex. GenerateurDonnees, ExportCSV)

### Module Analyse — ketsiagraceb
- Lecture et traitement des données
- Exceptions personnalisées pour la validation des mesures
- Calculs statistiques (min, max, moyenne, détection d’anomalies)
- Rapport d’analyse dans `data/rapport_analyse.txt`
- Point d’entrée : `MainAnalyse.java`

## Structure du projet

```text
projet-capteurs-environnementaux-2026/
│
├── Arsene/                     
│   └── README.md               
│
├── ketsiagraceb/               
│   └── README.md               
│
├── data/
│   ├── mesures.csv
│   ├── rapport_analyse.txt
│   ├── contributions.txt
│
└── README.md                   
```


## Instructions d’exécution

### Exécuter le module de génération (Arsene)
1. Ouvrir le projet dans IntelliJ.
2. Lancer la classe principale du module de génération (ex: `Main.java` dans Arsene/).
3. Le fichier `data/mesures.csv` sera généré automatiquement.

### Exécuter le module d’analyse (ketsiagraceb)
1. Vérifier que `data/mesures.csv` existe.
2. Lancer `MainAnalyse.java` dans le dossier ketsiagraceb/.
3. Le rapport sera généré dans `data/rapport_analyse.txt`.


## Contributions

### Arsene
- Structure du projet
- Génération des données (capteurs, mesures, CSV)
- Documentation technique
- Gestion GitHub (commits, merges, synchronisation)

### ketsiagraceb
- Analyse des données
- Exceptions personnalisées
- Calculs statistiques
- Rapport d’analyse
- Tests et validation


## Collaboration GitHub
- Dépôt structuré avec dossiers personnels (`Arsene/`, `ketsiagraceb/`)
- Commits réguliers avec messages explicites
- Travail séparé dans chaque module
- Fichier `contributions.txt` listant les tâches de chaque membre
- README global + README individuels 
