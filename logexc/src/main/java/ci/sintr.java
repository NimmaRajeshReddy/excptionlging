package ci;

public class sintr
{
	private double ipa;
	private double ari;
	private double ty;
	private double simpi;
	
	public sintr(double initialPrincipalAmount , double annualRateOfInterest , double timeInYears)
	{
		this.ipa = initialPrincipalAmount;
		this.ari = annualRateOfInterest;
		this.ty = timeInYears;
	}
	
	public void setValues(double initialPrincipalAmount , double annualRateOfInterest , double timeInYears)
	{
		this.ipa = initialPrincipalAmount;
		this.ari = annualRateOfInterest;
		this.ty = timeInYears;
	}
	
	public double calculateSimpleInterest()
	{
		simpi = (ipa * ty * ari)/100;
		return simpi;
	}
}