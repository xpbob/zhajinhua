package zhajinhua.util;

public class Card implements Comparable{
	private String color;
	private int colorNum;
	private String number;
	private int numberNum;
	public Card(int colorNum,String color,int numberNum,String number)
	{
		this.color=color;
		this.colorNum=colorNum;
		this.number=number;
		this.numberNum=numberNum;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getColorNum() {
		return colorNum;
	}
	public void setColorNum(int colorNum) {
		this.colorNum = colorNum;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getNumberNum() {
		return numberNum;
	}
	public void setNumberNum(int numberNum) {
		this.numberNum = numberNum;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Card c=(Card)o;
		if(numberNum>c.numberNum)
		{
			return 1;
		}
		else if(numberNum<c.numberNum)
		{
			return -1;
		}
		else
		{
			if(colorNum>c.colorNum)
			{
				return 1;
			}
			else if(colorNum==c.colorNum)
			{
				return 0;
			}
			else
			{
				return -1;
			}
		}
	}
	
}
