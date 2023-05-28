public class AirConditioner{

	private boolean isOn;
	private String productName;
	private int temperature;
	
	public AirConditioner(String productName){
		this.productName = productName;
	}
	
	public void decreaseTemperature(){
	}
	
	public void setTemperature (int temperature) {
		this.temperature = temperature;
	} 
	
	public int getTemperature(){
		return temperature;	
	}
	
	public String getProductName(String productName){
		return productName;
	}
	
	public void increaseTemperature(){
	}
	
	public boolean isOn (boolean isOn){
		return isOn;
	}
	
	public void setProductName(String productName){
		this.productName = productName;
	}
	
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	
}
