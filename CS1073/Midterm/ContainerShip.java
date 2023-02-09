public class ContainerShip
{
	private double weight;

	private Port start;

	private Port finish;

	private boolean hazard;

	public ContainerShip (double weightIn, Port startIn, Port finishIn, boolean hazardIn)
	{
		weight = weightIn;
		start = startIn;
		finish = finishIn;
		hazard = hazardIn;
	}
	
	public double getTotalPortCharges ()
	{
		double Total = 0;

		Total = (start.getPortTax(weight) + finish.getPortTax(weight)) + (start.getEnvior() + finish.getEnvior());

		return Total;
	}
}