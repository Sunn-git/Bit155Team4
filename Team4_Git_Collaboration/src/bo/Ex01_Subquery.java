package bo;

public class Ex01_Subquery {

}
/*--subquery
1. single row subquery : subquery�� ����� 1���� row�� ������(���ϰ�) : �Ѱ��� �� /�����÷�
2. multi row subquery : subquery�� ����� 1�� �̻��� row�� ������(�������� ��) /�����÷�
�����ϴ� ���� : ���Ǵ� �������� ����
multi row (IN , NOT IN) (ANY , ALL)
ALL : sal > 1000 and sal > 2000 and ...
ANY : sal > 1000 or sal > 2000 or ...
����(subquery)
1.��ȣ�ȿ� �־���Ѵ� (select avg(sal) from emp)
2.�����÷����� ���� >> select sal, deptno from emp, >> (X) �����÷��� �ƴϴ�
3.�ܵ����� ���� �����ؾ� �Ѵ�!

�������
1.subquery ���� ����
2.subquery�� ����� ������ main query ����
*/
