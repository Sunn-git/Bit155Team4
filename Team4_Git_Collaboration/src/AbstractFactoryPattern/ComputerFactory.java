package AbstractFactoryPattern;
//�� ����Ŭ�������� �����ϱ� ���� Ŭ���̾�Ʈ �ڵ忡 �������� �����Ǵ� ������ Ŭ������ ����.
public class ComputerFactory {
	
	public static Computer getComputer(ComputerAvstractFactory factory) {
		return factory.createComputer();
	}

}
//getComputer �տ� static �޼ҵ忡 �տ��� ������ PCFactory , ServerFactory �ν��Ͻ��� 
//�������� if-else�� ��� ���ϴ� ����Ŭ������ �ν��Ͻ��� �����Ҽ� �ְ� �ȴ�.
