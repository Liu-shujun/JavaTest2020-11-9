package Test;

import java.util.Scanner;

public class test {
	static final float taxStandard=5000;
    public static void main(String args[]){
    	Graduate a=new Graduate();
    	Graduate b=new Graduate();
    	Graduate c=new Graduate();
    	 test ceshi= new test();
    	 try {
    		 ceshi.Target(a);
             System.out.println("Next");
             ceshi.Target(b);
             System.out.println("Next");
             ceshi.Target(c);
    	 }
         catch (Exception e){
             System.out.println("����˳��������������룡");
         }

     }
    

float Salary(float s){                   //��нˮ
    return s*12;
}

float Tuition(float t){                  //��ѧ��
    return t;
}

float Income(float Is,float It){       //������
    float x;
    x=Is-It;
    return x;
}

float Tax(float total){                     //����˰
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
void Target(Graduate graduate){          //�����Ϣ
    float xs,xf,tax,ns;

    test cs =new test();
    System.out.println("Please enter name,age,sex,tuition,salary!");
    Scanner cc = new Scanner(System.in);
    Scanner cc1 = new Scanner(System.in);
    Scanner cc2 = new Scanner(System.in);

 

    graduate.Name=cc.next();
    graduate.Age=cc.nextInt();
    graduate.Sex=cc.next();
    graduate.Tuition=cc.nextFloat();
    graduate.Salary=cc.nextFloat();


    xf=cs.Tuition(graduate.Tuition);
    xs=cs.Salary(graduate.Salary);
    tax=cs.Income(cs.Salary(graduate.Salary),cs.Tuition(graduate.Tuition));
    ns=cs.Tax(tax);
    
    
    graduate.payFee(graduate.Tuition);
    graduate.sendPay(graduate.Salary);

    
    System.out.println("��нΪ"+graduate.Salary+",��нΪ:"+xs+",��ѧ��Ϊ:"+xf+",����˰Ϊ:"+ns);

}
}
