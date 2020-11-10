# JavaTest2020-11-9
姓名：刘淑君 班级：计G202 学号：2020322093
## 一、实验目的
1.学会使用abstract类和abstract方法。

2.掌握使用关键字interface去定义一个接口，了解其定义形式以及实现方法。

3.学会使用try-catch语句去处理异常，在所写的程序中根据输入情况做异常处理。

## 二、实验要求
1.在博士研究生类中实现学生和教师两个接口定义的抽象方法。

2.统计年收入和年学费，通过收入-学费，计算出需要纳税的金额。

3.查阅国家最新纳税标准（系数），通过static，final来进行定义。

4.实例化测试类时，可以采用Scanner类实现运行时输入学生信息。

5.根据输入情况，做异常处理。

## 三、实验过程
1.编写了两个管理接口

   (1)Student接口：payFee()方法和checkFee()方法   缴纳学费和查学费
   
   (2)Teacher接口：sendPay()方法和checkPay()方法  发放薪水和查薪水
   
2.编写研究生(Graduate)类

   (1)实现了上述两个接口
     
   (2)属性：Name(姓名),Age(年龄),Sex(性别),Salary(薪水),Tuition(学费)
     
3.编写测试(Test)类

   (1)实例化三名博士研究生，通过Scanner类将研究生信息输入进去
   
   (2)通过Salsry()方法计算年薪；通过Tuition()方法计算年学费；通过Income()方法计算实际年收入
   
   (3)根据国家最新纳税标准设定纳税金额，设置一个Tax()方法,使用if-else语句计算纳税金额
   
   (4)使用try-catch语句做异常处理
   
## 四、核心代码
代码一
```
public interface Student {
	public abstract void payFee(float a);//缴纳学费
	 
	 public abstract float checkFee();//查学费

}
```
代码二
```
public interface Teacher {
	public abstract void sendPay(float a);//发放薪水
	 
	public abstract float checkPay();//查询薪水

}
```
代码三
```
public String Name,Sex;//姓名，性别
	public int Age;//年龄
	float Salary,Tuition;//薪水，学费
	public  Graduate(String Name,String Sex,int Age,float Salary,float Tuition){
		this.Name=Name;
		 
		this.Sex=Sex;
		 
		this.Age=Age;
		 
		this.Salary=Salary;
		 
		this.Tuition=Tuition;

	}
```
代码四
```
float Tax(float total){                     //年纳税
    double y=0;
    if(total<=taxStandard){
        y=0;
    }else if(total>taxStandard&&total<=8000){
        y=total*0.03;
    }else if(total>=8001&&total<=17000){
        y=total*0.1;
    }else if(total>=17001&&total<=30000){
        y=total*0.2;
    } else{
        System.out.println("Too much income");
    }
   return (float) y;
}
```
代码五
```
try {
    		 ceshi.Target(a);
             System.out.println("Next");
             ceshi.Target(b);
             System.out.println("Next");
             ceshi.Target(c);
    	 }
         catch (Exception e){
             System.out.println("输入顺序错误，请重新输入！");
         }
```

## 五、系统运行截图

![](https://github.com/Liu-shujun/JavaTest2020-11-9/blob/main/%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C.PNG)

## 六、编程感想
1.学会使用关键字implements声明一个类去实现一个或多个接口

2.掌握如何去创建一个抽象类或者是一个抽象方法，了解抽象类可以重写接口中的方法也可以直接实现拥有接口中的方法

3.了解如何使用try-catch语句去处理异常



