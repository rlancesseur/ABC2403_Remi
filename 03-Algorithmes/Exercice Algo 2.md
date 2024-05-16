# Exercice 2a.5 : Ma bicyclette

Réalisez l’algorithme et le programme correspondant au texte ci-dessous :

S’il fait beau demain, j’irai faire une balade à bicyclette.

Je n’ai pas utilisé ma bicyclette depuis plusieurs mois, peut-être n’est-elle plus en parfait état de fonctionnement.

Si c’est le cas, je passerai chez le garagiste avant la balade. J’espère que les réparations seront immédiates sinon je devrai renoncer à la balade en bicyclette. Comme je veux de toute façon profiter du beau temps, si mon vélo n’est pas utilisable, j’irai à pied jusqu’à l’étang pour cueillir les joncs.

S’il ne fait pas beau, je consacrerai ma journée à la lecture. J’aimerais relire le 1er tome de Game of Thrones. Je pense posséder ce livre, il doit être dans la bibliothèque du salon.

Si je ne le retrouve pas, j’irai l’emprunter à la bibliothèque municipale. Si le livre n’est pas disponible, j’emprunterai un roman policier.

Je rentrerai ensuite directement à la maison.

Dès que j’aurai le livre qui me convient, je m’installerai confortablement dans un fauteuil et je me plongerai dans la lecture.

```
VARIABLES

beauTemps est un BOOLEEN
veloOk est un BOOLEEN
reparationsImmediate est un BOOLEEN
livrePossede est un BOOLEEN
livreDispoBibliotheque est un BOOLEEN


TRAITEMENT

SI beauTemps = VRAI ALORS
    ECRIRE "Je vais me ballader"

    SI veloOk = VRAI ALORS 
        ECRIRE "J'irais faire une balade à bicyclette"
    SINON
        ECRIRE "Je vais chez le garagiste"

        SI reparationImmediates = VRAI ALORS
            ECRIRE "j'irai me ballader à bicyclette"
        SINON
            ECRIRE "J'irai ceuillir des joncs" 

    FIN SI
FIN SI

SINON 
    ECRIRE "Je vais lire un livre"

    SI livrePossede = FAUX ALORS 
        ECRIRE "Je vais à la bibliothèque"

            SI livreDispoBibliothèque = VRAI ALORS
                ECRIRE "j'emprunte GoT"

                SINON
                    ECRIRE "J'emprunte un roman policier"
                
                FIN SI

            ECRIRE "Je rentre chez moi"

                SINON
                  ECRIRE "Je lis GoT"

                FIN SI

            ECRIRE "Lecture de mon livre dans le fauteuil"

        FIN SI
```
