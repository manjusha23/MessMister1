public class Dmember
{
	private int _id;
	private String _name;
	private String _startdate;
	private String _startmonth;
	private boolean _isactive;
	private int _grpid;
	private int _rateid;
	private double _dueamt;
	private boolean _haspaid;
	private boolean _islate;

	public Dmember(String _name,String _startdate,String _startmonth,boolean _isactive,int _grpid,int _grpid,int _rateid,double _dueamt,boolean _haspaid,boolean _islate)
	{
	
		this._name = _name;
		this._startdate = _startdate;
		this._startmonth =  _startmonth;
		this._isactive = _isactive;
		this._grpid = _grpid;
		this._rateid = _rateid;
		this._dueamt = _dueamt;
		this._haspaid = _haspaid;
		this._islate = _islate;
	}

	public Dmember()
	{
	
	}
	
	public void set_id(int id)
	{
		_id = id;
	}

	public void set_name(String name)
	{
		_name = name;
	}

	public void set_startdate(String startdate)
	{
		_startdate = startdate;
	}

	public void set_startmonth(String startmonth)
	{
		_startmonth = startmonth;	
	}

	public void set_active(boolean value)
	{
		
		_active = value;
	}

	public void set_grpid(int grpid)
	{
		_grpid = grpid;	
	}

	public void set_rateid(int rateid)
	{
		_startmonth = startmonth;	
	}	
	}

	public void set_dueamt(double amt)
	{
		_dueamt = amt;
	}	

	public void set_haspaid(boolean value)
	{
		_haspaid = value;
	}

	public void set_islate(boolean value)
	{
		_islate = value;

	}

	public int get_id()
	{
		return _id;
	}

	public String get_name()
	{
		return _name;
	}
	
	public
	
	public String get_startdate()
	{
		return _startdate;
	}

	public String get_startmonth()
	{
		return _startmonth;
	}

	public boolean get_active()
	{
		return _active;
	}

	public int get_grpid()
	{
		return _grpid;	
	}

	public int get_rateid()
	{
		return _rateid;	
	}

	public double get_dueamt()
	{
		return _dueamt;	
	}

	public boolean get_haspaid()
	{
		return _haspaid;
	}

	
	public boolean get_islate()
	{
		return _islate;
	}
}
