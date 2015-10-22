public class Drate
{
	private int _rateid;
	private String _category;
	private int _duration;
	private double _rate;

	public Drate()
	{

	}

	public Drate(String category,int duration ,double rate)
	{
		_category = category;
		_rate = rate;
		_duration = duration;
		
	}

	public void set_rateid(int id)
	{
		_rateid = id; 
	}

	public void set_category(String category)
	{
		_category = category;
	}

	
	public void set_rate(int rate)
	{
		_rate = rate;
	}
	
	
	public void set_duration(int duration)
	{
		_duration = duration;
	}


	public int get_id()
	{
		return _rateid;
	}

	public String get_category()
	{
		return _category;
	}

	public double get_rate()
	{
		return _rate;
	}
	
	public int get_duration()
	{
		return _duration;
	}

	
}
