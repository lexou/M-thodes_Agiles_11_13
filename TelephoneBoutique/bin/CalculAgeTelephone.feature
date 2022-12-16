#Author: your.email@your.domain.com

@tag
Feature: Ajouter un nouveau téléphone dans notre boutique 
  En tant que vendeuse
  Nous souhaitons ajouter de nouveaux téléphones dans nos inventaires. 
  A chaque fois, on précise la date de sotie de celui ci. Ce qui nous
  donne son âge.


  Scenario Outline: Calculer l'âge de nos téléphones 
    Given un nouveau téléphone comprenant <marque>, <annéeFabrique>, <siret> 
    When son arrivée dans nos stocks
    Then l <âge> de ce téléphone doit être calculé

    Examples: 
      | marque     | annéeFabrique    | siret       | âge  |
      | "iPhone"   |     2016         | B5463-FV356 |  6   |
      | "name2"    |     2020         | vfref6-cgjg4|  2   |
