package triptych.Cards;

import triptych.Card;

public class Doom extends Card {

	public Doom(){
		name="Doom";
		element="Dark";
		type="Spell";
		description="1: Deal 500 damage.\n2: Destroy this card and one other.\n3: Deal 200 damage for every Dark card on the field.";
				}
	
	@Override
	public void firstEffect() {
			System.out.println("Doom");
	}

	@Override
	public void secondEffect() {
		// TODO Auto-generated method stub

	}

	@Override
	public void thirdEffect() {
		// TODO Auto-generated method stub

	}

}
