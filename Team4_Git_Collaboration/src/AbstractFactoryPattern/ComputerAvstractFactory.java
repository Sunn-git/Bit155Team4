package AbstractFactoryPattern;
//�߻� ���丮 ��Ȱ�� �ϱ����� 
//�������̽� �Ǵ� �߻�Ŭ������ �ʿ��ϴ�. 
public interface ComputerAvstractFactory {
	public Computer createComputer(); 

}
//createComputer()�� �޼ҵ��� ����Ÿ���� super class�� Computer() �޼ҵ带 �������̵��Ͽ�
//������ ���� Ŭ������ �������ټ��ִ�. <<�ڹ��� ������ 