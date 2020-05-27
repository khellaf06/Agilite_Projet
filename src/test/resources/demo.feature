Feature: Demo feature
  Scenario: reservation d un billet 
    Given Un match avec un club locale <name> <name>  et un club visiteur <name> <name> et une date <date>
    When Reservation d un billet avec le numéro de la place <numeroPlace>
    Then Un match avec un club locale et un club visiteur et une date a le billet avec le numero <numeroPlace> resrve


	Scenario: annulation d un billet
		Given Un match avec un club locale <name> <name>  et un club visiteur <name> <name>  et une date <date>
		When La supression d un billet avec le numéro de la place <numeroPlace>
		Then Un match avec un club locale et un club visiteur et une date a le billet avec le numero <numeroPlace> non reserve
		
	Scenario: modification d un billet
		Given Un match avec un club locale <name> <name>  et un club visiteur <name> <name>  et une date <date>
		When modifié l ancien numero de la place <numeroPlace> d un billet avec le nouveau numéro de la place <numeroPlace>
		Then rendre l ancien numero de place <numeroPlace> disponible et le nouveau numero de place <numeroPlace> indisponible 