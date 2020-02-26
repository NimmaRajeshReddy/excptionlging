package ci;
import java.lang.Math;
public class cintr
{
	private double ipa;
	private double ari;
	private double tiy;
	private int cfpy;
	private double cmpndin;
	
	public cintr(double initialPrincipalAmount , double annualRateOfInterest , double timeInYears, int compoundingFrequencyPerYear)
	{
		this.ipa = initialPrincipalAmount;
		this.ari = annualRateOfInterest;
		this.tiy = timeInYears;
		this.cfpy = compoundingFrequencyPerYear;
	}
	
	public void setValues(double initialPrincipalAmount , double annualRateOfInterest , double timeInYears , int compoundingFrequencyPerYear)
	{
		this.ipa = initialPrincipalAmount;
		this.ari = annualRateOfInterest;
		this.tiy = timeInYears;
		this.cfpy = compoundingFrequencyPerYear;
	}
	
	public double calculateCompoundInterest()
	{
		cmpndin = (ipa * Math.pow(1 + ari / (cfpy*100) , (tiy * cfpy))) - ipa;
		return cmpndin;
	}
}