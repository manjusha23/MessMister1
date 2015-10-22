public class Dcontact
{
	private int _memid;
	private String _contactno;
	
	public Dcontact()
	{
		
	}
	
	public Dcontact(int id,String no)
	{
		_memid = id;
		_contactno = no;
	}
	
	public void set_memeid(int id)
	{
		_memid = id;
	}
	
	public void set_contactno(String no)
	{
		_contactno = no;
	}
	
	public int get_memid()
	{
		return _memeid;
	}

	public String get_contactno()
	{
		return _contactno;
	}
}
