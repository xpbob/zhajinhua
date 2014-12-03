package zhajinhua.util;

import java.util.Collection;
import java.util.TreeSet;

public class Person implements Comparable{
	private String name;
	private Collection<Card> myCard=new TreeSet<>();
	private int score;
	public Person(String name)
	{
		this.name=name;
	}
	public void jisuan()
	{
		Card[] c = null;
		c=(Card[])myCard.toArray(new Card[0]);
		if(c[0].getNumberNum()==c[1].getNumberNum() && c[1].getNumberNum()==c[2].getNumberNum())//豹子
		{
				score=c[1].getNumberNum()+224;
			
		}
		else if(c[1].getNumberNum()==c[2].getNumberNum() && c[0].getNumberNum()!=c[1].getNumberNum() )//对子
		{
				score=c[1].getNumberNum()*2+18+c[1].getColorNum()+c[2].getColorNum();
		}
		else if(c[1].getNumberNum()!=c[2].getNumberNum() && c[0].getNumberNum()==c[1].getNumberNum())//对子
		{
			score=c[1].getNumberNum()*2+18+c[1].getColorNum()+c[0].getColorNum();
		}
		else if(c[2].getNumberNum()-c[1].getNumberNum()==1 && c[1].getNumberNum()-c[0].getNumberNum()==1)//顺子
		{
			score=c[2].getNumberNum()+72+c[2].getColorNum();
			if(c[2].getColorNum()==c[1].getColorNum() && c[1].getColorNum()==c[0].getColorNum())//同花顺
			{
				score=c[2].getColorNum()+c[2].getNumberNum()+170;
			}
		}
		else if(c[2].getColorNum()==c[1].getColorNum() && c[1].getColorNum()==c[0].getColorNum())//同花
		{
			score=c[1].getNumberNum()+c[1].getColorNum()+c[0].getNumberNum()+c[0].getColorNum()+c[2].getNumberNum()+c[2].getColorNum()+116;
		}
		else//散牌
		{
			score=c[2].getNumberNum()+c[2].getColorNum();
		}
	}
	public void getCard(Card c)
	{
		myCard.add(c);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection<Card> getMyCard() {
		return myCard;
	}
	public void setMyCard(Collection<Card> myCard) {
		this.myCard = myCard;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void show()
	{
		Card[] c = null;
		c=(Card[])myCard.toArray(new Card[0]);
		for(Card onecard:c)
		{
			System.out.println(onecard.getColor()+onecard.getNumber());
		}
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
	 Person	arg=(Person)arg0;
	 if(score>arg.getScore())
	 {
		 return 1;
	 }
	 else
	 {
		 return -1;
	 }
	}

}
