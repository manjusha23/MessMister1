public class Dnotification
{
	private int _nId;
	private String _notificationType;
	private String _notifyOn;

	public Dnotification()
	{
	
	}
	
	public Dnotification(String _notificationType , String _notifyOn )
	{
		
		this._notificationType = _notificationType;
		this._notifyOn  = _notifyOn;
	}
	
	
	public void set_nId(int _nId )
	{
		this._nId = _nId;
	}

	
	public void set_notificationType(String _notificationType)
	{
		this._notificationType = _notificationType;
	}
	
	
	public void set_notifyOn( String _notifyOn )
	{
		this._notifyOn  = _notifyOn;
	}
	
	public int get_nId()
	{ 
		return _nId;
	}
	
	public String get_notificationType()
	{
		return _notificationType;
	}
	
	public String get_notifyOn()
	{ 
		return _notifyOn;
	}
}
