Feature: feature pour tester la functionalite de connexion
  Comme utilisateur je veux me conecter dans le systeme

 # Scenario: verifier avec login et mot-de-passe correcte
 #   Given un utilisateur est dans la page de connexion 
 #   When il saisit son login et mot-de-passe
 #   And clique sur le button ok 
 #   Then il navigue pour la page du systeme
 
 
 Scenario Outline: verifier avec login et mot-de-passe correcte
 		 Given <utilisateur> est dans la page de connexion 
 	   When il saisit son <login> et <mdp>
# 	   And  et saisit son <mdp>
 	   And clique sur le button ok 
 	   Then il navigue pour la page du systeme
 	   
 	   Examples:
				| utilisateur  | login       |	mdp 				  |
 	      | kathia			 | kathia 		 |  r402 					|
  			| olivier 		 | olivier 		 |  r402 					|