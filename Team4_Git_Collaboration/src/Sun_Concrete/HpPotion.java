package Sun_Concrete;

import Sun_Framework.Item;

public class HpPotion implements Item{

	@Override
	public void use() {
		System.out.println("체력 회복!");
		
	}

}
