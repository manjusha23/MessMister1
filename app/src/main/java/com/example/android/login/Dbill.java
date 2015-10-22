public class Dbill
{
	private int _billId;
	private String _billName;
	private double _dueamt;
	private boolean _hasPaid;
	private String _dueDate;
	private boolean _hasbeenLate;
	
	public Dbill()
	{ 
	
	}
	
	public Dbill(int _billId , String _billName , double _dueamt ,  boolean _hasPaid , String _dueDate , boolean _hasbeenLate )
	{
		this._billId = _billId;
		this._billName = _billName;
		this._dueamt = _dueamt;
		this._hasPaid = _hasPaid;
		this._dueDate = _dueDate;
		this._hasbeenLate  =  _hasbeenLate ;
	}
	
	public void set_billId(int _billId)
	{
		this._billId = _billId;
	}
	
	public void set_billName(String _billName)
	{
		this._billName = _billName;
	}
	
	public void set_dueamt(double _dueamt)
	{
		this._dueamt = _dueamt;
	}

	public void set_hasPaid(boolean _hasPaid)
	{ 
		this._hasPaid =  _hasPaid ;
	}
	
	public void set_dueDate( String _dueDate )
	{
		this._dueDate = _dueDate;
	}
	
	public void set_hasbeenLate(boolean _hasbeenLate)
	{
		this._hasbeenLate = _hasbeenLate;
	}
	
	
	public int get_billId()
	{
		return _billId;
	}

	public String get_billName()
	{
		return _billName;
	}
	
	public double get_dueamt()
	{
		return _dueamt;
	}
	
	public boolean get_hasPaid()
	{ 
		return _hasPaid;
	}
	
	public String get_dueDate()
	{
		return _dueDate;
	}
	
	public boolean get_hasbeenLate()
	{
		return _hasbeenLate;
	}
}
