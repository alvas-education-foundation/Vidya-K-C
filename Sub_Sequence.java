public class Sub_Sequence {

	public static void main(String[] args) {
		String s="this is a string";
		String s1="ng";
		int count=0;
		char[] ch1=s.toCharArray();
		char[] ch2=s1.toCharArray();
		char[] ch3=new char[ch2.length];
		for (int i = 0; i <ch2.length; i++) 
		{
			for (int j = 0; j < ch1.length && i<ch2.length; j++) 
			{
				if(ch2[i]==ch1[j])
				{
					ch3[count++]=ch1[j];
					i++;
				}
			}
		}
		int t=0;
		for (int i = 0; i < ch3.length; i++) {
			if(ch2[i]==ch3[i])
			{
				t++;
			}
		}
		if(t==ch2.length)
			System.out.println("It is a substring");
		else
			System.out.println("It is not a substring");
	}

}
