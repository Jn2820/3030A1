package itec3030.assignments.a1.sensors.thermoset.ThermoSetX19;

import itec3030.assignments.a1.sensors.thermoset.ThermoSetX19FrontEnd.FrontEnd;
import itec3030.smarthome.standards.*;

public class ThermoSetX19 implements Thermostat{
	private ControllerInterface controllerInterface;
	private String ID;
	private Boolean enable;
	private FrontEnd UI;
	private int temperature;
		
	
	public ThermoSetX19() {
		UI = new FrontEnd(this);
		UI.pack();
		UI.setVisible(true);
	}
	

	@Override
	public void disable() {
		// TODO Auto-generated method stub
		this.enable = false;
	}

	@Override
	public void enable() {
		// TODO Auto-generated method stub
		this.enable = true;
	}

	@Override
	public boolean enabled() {
		// TODO Auto-generated method stub
		return enable;
	}

	@Override
	public ControllerInterface getController() {
		// TODO Auto-generated method stub
		
		return this.controllerInterface;
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return this.ID;
	}

	@Override
	public void setController(ControllerInterface controllerInterface) {
		// TODO Auto-generated method stub
		this.controllerInterface = controllerInterface;
		
	}

	@Override
	public void setID(String id) {
		// TODO Auto-generated method stub
		this.ID = id;
	}

	@Override
	public int getReading() {
		// TODO Auto-generated method stub
		return temperature;
	}

	@Override
	public void newTemperature(int temps) {
		this.temperature = temps;
	}

}
