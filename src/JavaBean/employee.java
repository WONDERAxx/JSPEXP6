package JavaBean;

public class employee {
	private int id;
	private String name;
	private String job;
	private double salary;
	private int dept;
	/**
	 * @return the id
	 */
	
	public employee(){
		super();
	}
	public employee(int id,String name,String job,double salary,int dept){
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.salary = salary;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}
	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the dept
	 */
	public int getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(int dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return id + "------" + name + "------" + job + "------" + salary + "------" + dept + "\n";
    }
	
}
