public class FreequencyChar {

	public static char[] sort(char[] ch)
	{
		for (int i = 0; i < ch.length; i++) 
		{
			for (int j = i+1; j < ch.length; j++) 
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
				
			}
		}
		return ch;
	}
	public static void main(String[] args) {
		String s="hello friend";
		char[] ch=s.toCharArray();
		ch=sort(ch);
		int[] count=new int[s.length()];
		for (int i = 0; i < ch.length; i++)
		{
			 count[i]=1;
			for (int j = i+1; j <ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					count[i]++;
					ch[j]='0';
				}
			}
		}
		for (int i = 0; i < count.length; i++) 
		{
			if(ch[i]!=' ' && ch[i]!='0')
			{
				System.out.print(ch[i]+"="+count[i]+" ");
			}
		}

	}

}
