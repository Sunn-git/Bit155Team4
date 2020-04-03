package AbstractFactoryPattern;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4Ghz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
		System.out.println("AbstractFactory PC config::"+pc);
		System.out.println("AbstractFactory server config::"+server);
		
		System.out.println("왜안되지");
		
	}

}


