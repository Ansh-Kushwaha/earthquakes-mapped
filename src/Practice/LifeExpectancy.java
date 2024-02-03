package Practice;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.*;

public class LifeExpectancy extends PApplet{
	private UnfoldingMap map;
	private Map<String, Float> lifeExpByCountry;
	
	public void setup() {
		size(800, 600, OPENGL);
		map = new UnfoldingMap(this, 50, 50, 700, 500, new Google.GoogleMapProvider());
		background(59, 57, 59);
		MapUtils.createDefaultEventDispatcher(this, map);
		
		lifeExpByCountry = loadLifeExpectancyFromCSV("data/.csv");
	}
	
	public void draw() {
		map.draw();
	}
	
	public Map<String, Float> loadLifeExpectancyFromCSV(String filename) {
		Map<String, Float> lifeExpMap = new HashMap<Sting, Float>();
		String rows[] = 
		
		return lifeExpMap;
	}
}
