/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.cynapsys.homeautomation.service;

import de.cynapsys.homeautomation.entity.Device;
import java.util.List;

/**
 *
 * @author mouadh
 */
public interface DevicesService {
    
    List<Device> getAllDevices();
    Device getDeviceByID(Long deviceID);
    int getValue(Long deviceID);
    boolean setValue(Long deviceID, int value);
    
}