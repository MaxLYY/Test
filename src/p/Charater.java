package p;

public class Charater {
	public static void main(String[] args) {
		StringBuilder strB = new StringBuilder();
		String str=" ";
		strB.append("������ɫ˼���"+"��������󲻵�"+
		"�����Ů������"+"���������δʶ"+
				"��������������"+"һ��ѡ�ھ�����"+
		"����һЦ������"+"������������ɫ"+
				"������ԡ�����"+"��Ȫˮ��ϴ��֬"+
		"�̶���������"+"ʼ���³ж���ʱ"+
				"���޻��ս�ҡ"+"ܽ����ů�ȴ���"+
		"��������ո���"+"�Ӵ˾������糯"+
				"�л���������Ͼ"+"���Ӵ���ҹרҹ"+
		"�󹬼�����ǧ��"+"��ǧ�谮��һ��"+
				"����ױ�ɽ���ҹ"+"��¥�����ʹ�"+
		"��õ��ֽ���ʿ"+"����������Ż�"+
				"�������¸�ĸ��"+"������������Ů"+
		"�깬�ߴ�������"+"���ַ�Ʈ������"+
				"����������˿��"+"���վ���������"+
		"����ܱ�Ķ�����"+"��������������"+
				"���س����̳���"+"ǧ������������");
		try{
		for (int i=0;i<strB.length();i++){
			if (i*7+7>strB.length()){
				str=str+strB.substring(i*7,strB.length());//��ȡ��i*7���ַ�
				break;
			}
			//�ж��������Ϊ���'��'Ϊż��'��'
			if((i*7)%2==0){
				str=str+strB.substring(i*7,i*7+7)+"��";
			}else{
				str=str+strB.substring(i*7,i*7+7)+"��"+"\n";
			}
		}
		System.out.println(new StringBuilder(str).toString());
		}catch(Exception e){
			System.out.println("�����쳣��"+e.toString());
			e.printStackTrace();
		}
		//����
		String str2="��";
		int count=count(strB,str2);
		System.out.println(str2+"   ���ֵĴ���Ϊ"+count+"��");
	}
	
	public static int count(StringBuilder strB,String str2){
		int count=0;
		int index=0;
		while((index=strB.indexOf(str2,index))!=-1){
			index=index+str2.length();
			count++;
		}
		return count;
	}
}
