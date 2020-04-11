package IteratorPattern;

public interface Aggregate {
	public abstract Iterator iterator();
}

// 값이 있는지 확인해보고 ... 있으면 출력
interface Iterator {
	public abstract boolean hasNext();

	public abstract Object next();
}