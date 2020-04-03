package AbstractFactoryPattern;
//이 서브클래스들을 생성하기 위해 클라이언트 코드에 접점으로 제공되는 컨슈머 클래스를 생성.
public class ComputerFactory {
	
	public static Computer getComputer(ComputerAvstractFactory factory) {
		return factory.createComputer();
	}

}
//getComputer 앞에 static 메소드에 앞에서 구현한 PCFactory , ServerFactory 인스턴스를 
//넣음으로 if-else가 없어도 원하는 서브클래스의 인스턴스를 생성할수 있게 된다.
