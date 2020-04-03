package AbstractFactoryPattern;
//sub class에 대한 팩토리 클래스
public class ServerFactory implements ComputerAvstractFactory {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public ServerFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		
	}

	@Override
	public Computer createComputer() {
		return new Server(ram,hdd,cpu)	;
	}

}