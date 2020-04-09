package Sun_Concrete;

import java.util.Date;

import Sun_Framework.Item;
import Sun_Framework.ItemCreator;

public class MpCreator extends ItemCreator{

	@Override
	protected void requestItemsInfo() {
		System.out.println("�����ͺ��̽����� ���� ������ ������ �����ɴϴ�.");
		
	}

	@Override
	protected void createItemLog() {		
		System.out.println("���� ȸ�� ������ ���� ���� �߽��ϴ�." + new Date());

		
	}

	@Override
	protected Item createItem() {
		return new MpPotion();
	}
	

}
