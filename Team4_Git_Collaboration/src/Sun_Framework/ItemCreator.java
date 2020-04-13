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
	 
	//아이템 정보 요청
	abstract protected void requestItemsInfo();
	
	//아이템 로그 생성
	abstract protected void createItemLog();
	
	//아이템 생성 알고리즘
	abstract protected Item createItem();
	
}
