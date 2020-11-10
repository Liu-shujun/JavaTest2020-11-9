package Test;

public class Graduate implements Student,Teacher {
	

	public String Name,Sex;//姓名，性别
	public int Age;//年龄
	float Salary,Tuition;//年龄，薪水，学费
	public  Graduate(String Name,String Sex,int Age,int Salary,int Tuition){
		this.Name=Name;
		 
		this.Sex=Sex;
		 
		this.Age=Age;
		 
		this.Salary=Salary;
		 
		this.Tuition=Tuition;

	}
	public Graduate()
	 
	{
	 
	this("","",0,0,0);
	 
	}
	
	
	@Override
	public void sendPay(float a) {
		// TODO Auto-generated method stub
		this.Salary=a;
		
	}
	@Override
	public float checkPay() {
		// TODO Auto-generated method stub
		return this.Salary;
	}
	@Override
	public void payFee(float a) {
		// TODO Auto-generated method stub
		this.Tuition=a;
		
	}
	@Override
	public float checkFee() {
		// TODO Auto-generated method stub
		return this.Tuition;
	}


}
