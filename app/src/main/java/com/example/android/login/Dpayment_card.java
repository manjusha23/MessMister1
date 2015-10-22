public class Dpayment_card
{
	private int _paymentId;
	private String _paymentName;
	private int _duration;
	private double _payment;
	
	public Dpayment_card()
	{
	
	}
	
	public( String _paymentName , int _duration , double _payment )
	{
		this._paymentName = _paymentName;
		this._duration  = _duration;
		this._payment = _payment;
	}
	
	public void set_paymentName( String _paymentName )
	{
		this._paymentName = _paymentName;
	}
	
	public void set_duration( int _duration )
	{
		this._duration  = _duration;
	}
	
	public void set_payment( double _payment)
	{
		this._payment = _payment;
	}

	public int get_paymentId()
	{
		return _paymentId;
	}

	public String get_paymentName()
	{
		return _paymentName
	}
	
	public int get_duration()
	{
		return _duration;
	}
	
	public double get_payment()
	{
		return _payment;
	}
}
