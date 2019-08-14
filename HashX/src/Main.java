public class Main
{
	public static void main(String args[])
	{	
		hash h= new hash(7);
		
		h.add(52);
		h.add(21);
		h.add(10);
		h.add(9);
		h.add(8);
		h.add(11);
		h.add(34);
		h.add(6);
		h.add(23);
		h.add(67);
		
		h.display();
		
		System.out.println(h.contains(8));
	}
}