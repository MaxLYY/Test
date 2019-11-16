package p;

public class Charater {
	public static void main(String[] args) {
		StringBuilder strB = new StringBuilder();
		String str=" ";
		strB.append("汉皇重色思倾国"+"御宇多年求不得"+
		"杨家有女初长成"+"养在深闺人未识"+
				"天生丽质难自弃"+"一朝选在君王侧"+
		"回眸一笑百媚生"+"六宫粉黛无颜色"+
				"春寒赐浴华清池"+"温泉水滑洗凝脂"+
		"侍儿扶起娇无力"+"始是新承恩泽时"+
				"云鬓花颜金步摇"+"芙蓉帐暖度春宵"+
		"春宵苦短日高起"+"从此君王不早朝"+
				"承欢侍宴无闲暇"+"春从春游夜专夜"+
		"后宫佳丽三千人"+"三千宠爱在一身"+
				"金屋妆成娇侍夜"+"玉楼宴罢醉和春"+
		"姊妹弟兄皆列士"+"可怜光采生门户"+
				"遂令天下父母心"+"不重生男重生女"+
		"骊宫高处入青云"+"仙乐风飘处处闻"+
				"缓歌慢舞凝丝竹"+"尽日君王看不足"+
		"渔阳鼙鼓动地来"+"惊破霓裳羽衣曲"+
				"九重城阙烟尘生"+"千乘万骑西南行");
		try{
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
		}catch(Exception e){
			System.out.println("发生异常！"+e.toString());
			e.printStackTrace();
		}
		//查找
		String str2="不";
		int count=count(strB,str2);
		System.out.println(str2+"   出现的次数为"+count+"次");
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
