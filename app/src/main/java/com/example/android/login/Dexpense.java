public class Dexpense
{
	private int _exId;
	private double _amt;
	private String _date;
	private String _expenseType;
	
	public Dexpense()
	{
	
	}

	public Dexpense(int _exId , double _amt , String _date , String _expenseType)
	{
		this._exId  = _exId;
		this._amt = _amt;
		this._date  = _date; 
		this._expenseType = _expenseType;
	}
	
	private void set_exId(int _exId)
	{
		this._exId  = _exId;
	}
	
	
	private void set_amt(double _amt)
	{
		this._amt = _amt;
	}
	
	private void set_date(String _date)
	{
		this._date  = _date;
	}
	
	public void set_expenseType(String _expenseType)
	{
		this._expenseType = _expenseType;
	}
	
	
	public int get_exId()
	{
		return _exId;
	}
	
	public double get_amt()
	{
		return _amt;
	}
	
	public String get_date()
	{
		return _date;
	}
	
	public String get__expenseType()
	{
		return _expenseType;
	}
}
