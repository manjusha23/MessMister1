public class Dincome
{
	private int _inId;
	private double _amt;
	private String _date;
	private String _incomeType;

	public Dincome()
	{
	
	}
	
	public Dincome(int _inId , double _amt , String _date , String _incomeType)
	{
		this._inId  = _inId;
		this._amt = _amt;
		this._date  = _date; 
		this._incomeType = _incomeType;
	}
	
	private void set_inId(int _inId)
	{
		this._inId  = _inId;
	}
	
	
	private void set_amt(double _amt)
	{
		this._amt = _amt;
	}
	
	private void set_date(String _date)
	{
		this._date  = _date;
	}
	
	public void set_incomeType(String _incomeType)
	{
		this._incomeType = _incomeType;
	}
	
	
	public int get_inId()
	{
		return _inId;
	}
	
	public double get_amt()
	{
		return _amt;
	}
	
	public String get_date()
	{
		return _date;
	}
	
	public String get__incomeType()
	{
		return _incomeType;
	}
}
