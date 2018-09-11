/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import coffeeMaker.WaterSensor;
import coffeeMaker.enums.SensorStateBoiler;
import javax.swing.JPanel;
import java.awt.Color;
/**
 *
 * @author RodrigoMenacho
 */
public class Check {
        
    public void BoilerSensor(int cupState, JPanel panel ,WaterSensor waterSensor){
        
        if (cupState>0) {
            panel.setBackground(Color.GREEN);
            waterSensor.setSensorState(SensorStateBoiler.IS_NOT_EMPTY);
            
        }
        else{
            panel.setBackground(Color.RED);
            waterSensor.setSensorState(SensorStateBoiler.IS_EMPTY);
        }
    }
    
    public void PlateSensor(int cupState, JPanel panel){
        
        if (cupState>0) {
            panel.setBackground(Color.GREEN);
        }
        else{
            panel.setBackground(Color.RED);
        }
    }
    
}
