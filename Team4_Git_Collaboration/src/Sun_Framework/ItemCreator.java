package Sun_Framework;

public abstract class ItemCreator {
	public Item create() {
		Item item;
		
		//step1
		requestItemsInfo();

		//step2
		item = createItem();
		
		//step3
		createItemLog();
		
		return item;
	} 
	 
	//������ ���� ��û
	abstract protected void requestItemsInfo();
	
	//������ �α� ����
	abstract protected void createItemLog();
	
	//������ ���� �˰���
	abstract protected Item createItem();
	
}
