package springjpa.exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import springjpa.exam.entity.Emp;


public interface EmpRepository2 extends JpaRepository<Emp, Integer>{
	
	public List<Emp> findByEname(String name);
	public List<Emp> findByEnameIgnoreCase(String name);
	public List<Emp> findByJob(String job);
	public List<Emp> findByJobOrDeptno(String job, int dno);
	public List<Emp> findByJobAndDeptno(String job, int dno);
	public List<Emp> findDistinctByJob(String job);
	public List<Emp> findByDeptno(int dno);
	public List<Emp> findBySalGreaterThan(int inputsal);
	public List<Emp> findBySalGreaterThanEqual(int inputsal);
	public List<Emp> findBySalLessThan(int inputsal); //LessTnan -> 작다
	public List<Emp> findBySalLessThanEqual(int inputsal);
	public List<Emp> findBySalBetween(int minsal, int maxsal);
	public List<Emp> findByCommNull();
	public List<Emp> findByCommNotNull();
	public List<Emp> findByHiredateAfter(java.sql.Date d);
	public List<Emp> findByHiredateBefore(java.sql.Date d);
	public List<Emp> findByEnameStartsWith(String partname); // Ename이 argument로 시작하는
	public List<Emp> findByEnameContains(String partname); //Enam에 argument로 포함하는
	public List<Emp> findByDeptnoOrderBySalDesc(int dno);
	public List<Emp> findTop3ByDeptnoOrderBySalDesc(int dno); // 월급을 제일 많이 받는 직원을 3명 찾는다
}
