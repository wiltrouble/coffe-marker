/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import coffeeMaker.SensorPot;
import coffeeMaker.WaterSensor;
import coffeeMaker.enums.SensorStateBoiler;
import coffeeMaker.enums.SensorStatePlate;
import javax.swing.JPanel;
import java.awt.Color;
/**
 *
 * @author RodrigoMenacho
 */
public class Check {
        
    public void BoilerSensor(int cupState, WaterSensor waterSensor){
        
        if (cupState>0) {
            waterSensor.setSensorState(SensorStateBoiler.IS_NOT_EMPTY);
            
        }
        else{
            waterSensor.setSensorState(SensorStateBoiler.IS_EMPTY);
        }
    }
    public void PlateSensor(int cupState, SensorPot sensorPot){
        if (cupState < 1) {
            sensorPot.setState(SensorStatePlate.WARMER_EMPTY);
	}
		
        if (cupState == 1) {
            sensorPot.setState(SensorStatePlate.EMPTY);
        }
        
        if (cupState > 1){
            sensorPot.setState(SensorStatePlate.NOT_EMPTY);
        }
    }
    
    public void setPanelPlate(JPanel panel, SensorPot sensorPot){
        if (sensorPot.getState() == SensorStatePlate.EMPTY) {
            panel.setBackground(Color.ORANGE);
        }
        if (sensorPot.getState() == SensorStatePlate.NOT_EMPTY) {
            panel.setBackground(Color.GREEN);
        }
        if (sensorPot.getState() == SensorStatePlate.WARMER_EMPTY) {
            panel.setBackground(Color.RED);
        }
    }
    
    public void setPanel(int cupState, JPanel panel){
        
        if (cupState>0) {
            panel.setBackground(Color.GREEN);
        }
        else{
            panel.setBackground(Color.RED);
        }
    }
    
    
    
}
