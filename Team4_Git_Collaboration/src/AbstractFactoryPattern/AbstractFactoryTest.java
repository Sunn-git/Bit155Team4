package AbstractFactoryPattern;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4Ghz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
		System.out.println("AbstractFactory PC config::"+pc);
		System.out.println("AbstractFactory server config::"+server);
		
<<<<<<< HEAD
		System.out.println("왜안되지");
		
=======
		System.out.println("지금시간은 4시17분");

>>>>>>> 198fd6f9c013dfee397c7b38f823a90f2cc554bb
	}

}


