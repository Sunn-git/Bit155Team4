package AbstractFactoryPattern;
//추상 팩토리 역활을 하기위해 
//인터페이스 또는 추상클래스가 필요하다. 
public interface ComputerAvstractFactory {
	public Computer createComputer(); 

}
//createComputer()는 메소드의 리턴타입이 super class인 Computer() 메소드를 오버라이딩하여
//각각의 서브 클래스를 리턴해줄수있다. <<자바의 다형성 