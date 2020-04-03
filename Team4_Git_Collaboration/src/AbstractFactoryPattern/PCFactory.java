package AbstractFactoryPattern;
//sub class에 대한 팩토리 클래스 
public class PCFactory implements ComputerAvstractFactory {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public PCFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		
	}

	@Override
	public Computer createComputer() {
		return new PC(ram,hdd,cpu);
	}
	

}