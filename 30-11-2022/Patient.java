class Patient
{
	private String patientName;
	private int patientId;
	private String inTime;
	public void setPatientName(String patientName)
	{
		this.patientName = patientName;	
	}
	public void setPatientId(int patientId)
	{
		this.patientId = patientId;	
	}
	public void setInTime(String inTime)
	{
		this.inTime = inTime;	
	}
	public String getPatientName()
	{
		return patientName;
	}
	public int getPatientId()
	{
		return patientId;
	}
	public String getInTime()
	{
		return inTime;
	}
}