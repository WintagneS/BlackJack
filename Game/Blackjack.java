package Game;

import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decision;
		Scanner s = new Scanner(System.in);
		int Deck[] = new int[] {1,2,3,4,5,6,7,8,9,10,10,10,10};
		int a,b,c,d;
		boolean control=false;
		System.out.println("Oppenents Cards");
		a=Deck[random()];
		b=Deck[random()];
		System.out.println(a+"  "+b);
		System.out.println("Players Cards");
		c=Deck[random()];
		d=Deck[random()];
		int e=Deck[random()];
		int f=Deck[random()];
		System.out.println(c+"  "+d);
		System.out.print("if you want to draw a card enter 1 else 0");
		decision=s.nextInt();
		if(decision==1)
		{
		
		System.out.println("New Cards are: "+ c + " " + d + " " + e);
		if(c+d+e>21)
		{
			System.out.print("You lose the game");
			control=true;
		}
		 if( c+d+e<21 || control==false ) 
		{
			System.out.print("if you want to draw a card enter 1 else 0");
			decision=s.nextInt();
			if(decision==1)
			{
			
			System.out.println("New Cards are: "+ c + " " + d + " " + e + " " + f);
			if(c+d+e+f>21)
			{
				System.out.print("You lose the game");
			}
			else 
			{
				if(Oppenent(a,b)<=21)
				{
				if(Oppenent(a,b)>=c+d+e+f)
					System.out.println("You Lose");
				else System.out.println("You Win");
				}
			}	
			}
			else
			{
				if(Oppenent(a,b)<=21)
				{
				if(Oppenent(a,b)>=c+d+e)
					System.out.println("You Lose");
				else System.out.println("You Win");
				}
			
			}
		}
			else
		{
			if(Oppenent(a,b)<=21)
			{
			if(Oppenent(a,b)>=c+d+e)
				System.out.println("You Lose");
			else System.out.println("You Win");
			}
		}
		}
		else
		{
		if(Oppenent(a,b)>=c+d)
			System.out.println("You Lose");
		else System.out.println("You Win");
		}
	}
		
	
	
	
	
	public static int Oppenent(int n1, int n2)
	{
		int Deck[] = new int[] {1,2,3,4,5,6,7,8,9,10,10,10,10};
		int m=Deck[random()];
		int n=Deck[random()];
		if(n1+n2<17)
		{
			System.out.println("Oppenent draws a Card: "+ n1 + " " + n2 + " " + m);
			if(n1+n2+m>21)
			{
				System.out.print("Your oppenent loses the game,You Win");
			}
			if(n1+n2+m>=17)
				return n1+n2+m;
			else
			{
				if(n1+n2+m<17)
				{
					System.out.println("Oppenent draws a Card: "+ n1 + " " + n2 + " " + m + " " + n);
					if(n1+n2+m+n>21)
					{
						System.out.print("Your oppenent loses the game,You Win");
					}
				} 
			}
		}
		return n1+n2+m+n;
		
	}
	public static int random()
	{
		int random = (int) (Math.random()*14);
		return random;
	}
}



