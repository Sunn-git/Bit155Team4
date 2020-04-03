package AbstractFactoryPattern;
//�߻����丮 
//super class
//������ 
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
