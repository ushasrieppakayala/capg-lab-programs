
public class StringEx {
	public static void main(String args[])
	{
		String str1="Ushasri";
		String str2="ChandraBhanu";
		String str3="";
		for(char c:str2.toCharArray())
		{
			if(!str1.contains(""+c))
			{
				str3+=c;
			}
		}
		System.out.println("Uncommon characters are:"+str3);
	}

}
