package IteratorPattern;

public interface Aggregate {
	public abstract Iterator iterator();
}

// ���� �ִ��� Ȯ���غ��� ... ������ ���
interface Iterator {
	public abstract boolean hasNext();

	public abstract Object next();
}