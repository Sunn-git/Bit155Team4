package Sun_Concrete;

import java.util.Date;

import Sun_Framework.Item;
import Sun_Framework.ItemCreator;

public class HpCreator extends ItemCreator{

	@Override
	protected void requestItemsInfo() {
		System.out.println("�����ͺ��̽����� ȸ�� ������ ������ �����ɴϴ�.");
		
	}

	@Override
	protected void createItemLog() {		
		System.out.println("ü�� ȸ�� ������ ���� ���� �߽��ϴ�." + new Date());

		
	}

	@Override
	protected Item createItem() {
		return new HpPotion();
	}
	

}
