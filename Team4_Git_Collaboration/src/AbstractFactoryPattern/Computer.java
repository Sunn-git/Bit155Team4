package AbstractFactoryPattern;
//추상팩토리 
//super class
//순서도 
//Computer -> PC -> Server -> ComputerAbstractFactory -> PCFactory 
//SeverFactory -> ComputerFactory -> AbstractFactoryTest
public abstract class Computer {
	
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString() {
		return "RAM = " + this.getRAM()+",HDD="+this.getHDD()+",CPU="+this.getCPU();
	}

}
