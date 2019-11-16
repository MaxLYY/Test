# Java实验报告-字符串实验
# 一、实验目的
1.掌握字符串String及其方法的使用  
2.掌握异常处理结构
# 二、实验要求
利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行达到如下功能：  
1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”  
2.允许提供输入参数，统计古诗中某个字或词出现的次数  
3.考虑操作中可能出现的异常，在程序中设计异常处理程序  
4. 注意： 输入的内容，利用main方法中的args数组传递  
# 三、实验步骤
1.创建一个Charater类  
2.写入两个方法main和count  
3.输出   

核心代码：  

创建StringBuilder对象，定义一个空的字符串，用append方法定义内容：   
StringBuilder strB = new StringBuilder();  
String str=" ";  
strB.append(..)//词的内容  

捕获异常  
try{  
..  
}catch(Exception e){  
			System.out.println("发生异常！"+e.toString());  
			e.printStackTrace();  
}  

判断  
for (int i=0;i<strB.length();i++){  
			if (i*7+7>strB.length()){  
				str=str+strB.substring(i*7,strB.length());//截取第i*7个字符  
				break;  
			}  
			//判断如果字数为奇加'，'为偶加'。'  
			if((i*7)%2==0){  
				str=str+strB.substring(i*7,i*7+7)+"，";  
			}else{  
				str=str+strB.substring(i*7,i*7+7)+"。"+"\n";  
			}  
		}  
		System.out.println(new StringBuilder(str).toString());  
   
查找某个字出现的次数  
 public static int count(StringBuilder strB,String str2){  
		int count=0;  
		int index=0;  
		while((index=strB.indexOf(str2,index))!=-1){//循环  
			index=index+str2.length();  
			count++;  
		}  
		return count;  
	}  

运行结果：  
#捕获L.PNG![]()  
#四、实验总结  

