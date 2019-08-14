public class hash implements DataStruct
{
	private int[] arr;
	int size;
	list[] chain;
	
	hash()
	{
		size=16;
		arr=new int[size];
		chain=new list[size];
	}
	
	hash(int size)
	{
		this.size=size;
		arr=new int[size];
		chain=new list[size];
	}
	
	public void add(int d)
	{
		if(contains(d)==false)
		{
			int hashfunc = d%size;
			
			if(arr[hashfunc]==0)
			{
				arr[hashfunc]=d;
			}
			else
			{
				if(chain[hashfunc]==null)
					chain[hashfunc]=new list();
				
				chain[hashfunc].add(d);
			}
		}
	}
	
	public boolean contains(int d)
	{
		int hashfunc = d%size;
		
		if(arr[hashfunc]==d)
		{
			return true;
		}
		else
		{
			if(chain[hashfunc]==null)
				return false;
			
			return chain[hashfunc].contains(d);
		}
	}
	
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(i+" "+arr[i]);
			if(chain[i]!=null)
			{
				System.out.print("->");
				chain[i].display();
			}
			System.out.println();
		}
	}
	
}