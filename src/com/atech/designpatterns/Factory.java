package com.atech.designpatterns;

public class Factory {

	
	public static void main(String[] args) {
		SpellCaster cast = new SpellCaster();
		Spells obj1 = cast.getSpell("Hermione");
		Spells obj2 = cast.getSpell("Ron");
		Spells obj3 = cast.getSpell("harry");
		obj1.cast();
		obj2.cast();
		obj3.cast(); 
	}

}
interface Spells{
	public void cast();
}
class Harry implements Spells{
	public void cast(){
		System.out.println("Harry casts Avada Kedavra !");
	}
}
class Ron implements Spells{
	public void cast(){
		System.out.println("Ron casts Crucio !");
	}
}
class Hermione implements Spells{
	public void cast(){
		System.out.println("Hermione casts Imperio !");
	}
}
class SpellCaster{
	public Spells getSpell(String spellname){
		Spells spell = null;
		if(spellname == "Harry" || spellname == "harry"){
		spell = new Harry();
		
		}
		else if(spellname == "Ron" || spellname == "ron"){
		spell = new Ron();
		
		}
		else if(spellname == "Hermione" || spellname == "hermione"){
			spell = new Hermione();
			
		}
		return spell;
		
	}
}
