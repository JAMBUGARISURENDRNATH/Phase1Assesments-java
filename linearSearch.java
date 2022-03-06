package searching;

public class linearSearch
{
	public static void main(String[] args) 
	{
		int ele=89;
		int[] a=new int[10];
		a[0]=89;
		a[1]=76;
		a[2]=763;
		a[3]=764;
		a[4]=72;
		a[5]=71;
		a[6]=78;
		a[7]=34;
		a[8]=23;
		a[9]=56;
		for(int i=1;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				System.out.println("found");
			}
			else
			{
				System.out.println("not found");
			}
		}
		
	}
}
