public class Dstaff
{
	private int _sId;
	private String _sName;
	private boolean _isActive;
	private double _payment;
	private String _startOfMonth;
	private double _dueAmount;
	private boolean _hasPaid;
	private boolean _isLate;
	
	public Dstaff()
	{
	
	}
	
	public Dstaff(String _sName,boolean _isActive,double _payment,String _startOfMonth,double _dueAmount,boolean _hasPaid, boolean _isLate)
	{
		
		this._sName = _sName;
		this._isActive = _isActive;
		this._payment = _payment;
		this._startOfMonth = _startOfMonth;
		this._dueAmount = _dueAmount;
		this._hasPaid =  _hasPaid;
		this._isLate = _isLate;
	}
	
	public void set_sName(String name)
	{
		_sName = name;
	}
	
	public void set_isActive(String value)
	{
		_isActive  = value;
	}
	
	public void set_payment(double payment)
	{
		_payment = payment;
	}
	
	public void set_startOfMonth(String month)
	{
		_startOfMonth = month;
	}
	
	public void set_dueAmount(double amt)
	{
		_dueAmount = amt;
	}
	
	public void set_hasPaid(boolean value)
	{
		_hasPaid = value;
	}
	
	public void set_isLate(boolean value)
	{
		_isLate = value;
	}
	
	public int get_sId()
	{
		return _sId;
	}
	
	public String get_sName()
	{
		return _sName;
	}
	
	public double get_payment()
	{
		return _payment;
	}
	
	public boolean get_isActive()
	{
		return _isActive;
	}
	
	public double get_dueAmount()
	{
		return _dueAmount;
	}
	
	public boolean get_hasPaid()
	{
		return _hasPaid;
	}
	
	public boolean get_isLate()
	{
		return _isLate;
	}
	
	public String get_startOfMonth()
	{
		return _startOfMonth;
	}
}

