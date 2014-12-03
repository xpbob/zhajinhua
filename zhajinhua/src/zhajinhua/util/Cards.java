package zhajinhua.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cards {
	
   private	List<Card> listCard=new ArrayList<>();
   private int colorNum[]={1,2,3,4};
   private String color[]={null,"黑桃","梅花","方块","红桃"};
   private int numberNum[]={2,3,4,5,6,7,8,9,10,11,12,13,14};
   private String number[]={null,null,"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
   private Person[] p=null;
   public void play(Person[] m)
   {
	   System.out.println("开始洗牌");
	   init();
	   System.out.println("玩家进入");
	   personInput(m);
	   put();
	   
	   jisuan();
	   show();
   }
   public void init()
   {
	   listCard.clear();
	   for(int i=0;i<colorNum.length;i++)
	   {
		   for(int j=0;j<numberNum.length;j++)
		   {
			   
			   listCard.add(new Card(colorNum[i],color[colorNum[i]],numberNum[j],number[numberNum[j]]));
		   }
	   }
	   Collections.shuffle(listCard);
   }
   
   public void personInput(Person[] m)
   {
	   p=m;
   }
   public void put()
   {
	   for(int i=0;i<3;i++)
	   {
		   for(int j=0;j<p.length;j++)
		   {
			   p[j].getCard(listCard.get(0));
			   listCard.remove(0);
		   }
	   }
	   
   }
   public void jisuan()
   {
	   for(int i=0;i<p.length;i++)
	   {
		   p[i].jisuan();
	   }
   }
   public void show()
   
   {
	   Arrays.sort(p);
	   for(Person per:p)
	   {
		   System.out.println(per.getName());
		   per.show();
	   }
	   System.out.println("赢家是" + p[p.length-1].getName());
   }
	
   
}
