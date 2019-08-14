public class list implements DataStruct
{
	private int data;
	list next;
	
	list head;
	
	list()
	{
		data=0;
		next=null;
	}
	
	list(int data)
	{
		this.data=data;
		next=null;
	}
	
	public void add(int d)
	{
		if(head==null)
		{
			head=new list(d);
		}
		else
		{
			list temp=head;
			
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			
			temp.next= new list(d);
		}
	}
	
	public void display()
	{
		list temp= head;
		
		while(temp.next!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		
		System.out.print(temp.data);
	}
	
	public boolean contains(int d)
	{
		list temp=head;
		
		while(temp!=null)
		{
			if(temp.data==d)
			{
				return true;
			}
			temp=temp.next;
		}
		
		return false;
	}
}