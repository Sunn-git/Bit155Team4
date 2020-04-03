package bo;

public class Ex01_Subquery {

}
/*--subquery
1. single row subquery : subquery의 결과가 1개의 row를 가질때(단일값) : 한개의 값 /단일컬럼
2. multi row subquery : subquery의 결과가 1개 이상의 row를 가질때(여러개의 값) /단일컬럼
구분하는 이유 : 사용되는 연산자의 차이
multi row (IN , NOT IN) (ANY , ALL)
ALL : sal > 1000 and sal > 2000 and ...
ANY : sal > 1000 or sal > 2000 or ...
정의(subquery)
1.괄호안에 있어야한다 (select avg(sal) from emp)
2.담일컬럼으로 구성 >> select sal, deptno from emp, >> (X) 단일컬럼이 아니다
3.단독으로 실행 가능해야 한다!

실행순서
1.subquery 먼저 실행
2.subquery의 결과를 가지고 main query 실행
*/
