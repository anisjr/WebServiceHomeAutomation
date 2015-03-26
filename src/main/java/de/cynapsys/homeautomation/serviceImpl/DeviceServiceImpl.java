/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.cynapsys.homeautomation.serviceImpl;

import de.cynapsys.homeautomation.entity.Device;
import de.cynapsys.homeautomation.service.DevicesService;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author mouadh
 */
@Path("DeviceService")
public class DeviceServiceImpl implements DevicesService{

    @Override
    @Produces("application/xml")
    @GET
    public List<Device> getAllDevices() {
        List<Device> listdevices = new ArrayList<>();
        
        Device d1 = new Device(1001L,"Device1","Device1 Description",00);
        Device d2 = new Device(1002L,"Device2","Device2 Description",50);
        Device d3 = new Device(1003L,"Device3","Device3 Description",80);
        
        listdevices.add(d3);listdevices.add(d2);listdevices.add(d1);
        System.out.println(listdevices);
        return listdevices;
    }

    @Override
    @GET
    @Path("/{param}")
    public boolean setValue(Device device, int value) {
        try{
            device.setCurrentValue(value);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    @GET
    @Path("/{param}")
    public int getValue(@PathParam("param") Device device) {
        System.out.println(device.getCurrentValue());
        return device.getCurrentValue();
    }
    
}
