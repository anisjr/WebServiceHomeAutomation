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
@Path("/deviceservice")
public class DeviceServiceImpl implements DevicesService{

    @Override
    @GET
    @Path("/alldevices")
    @Produces("application/json")
    public List<Device> getAllDevices() {
        ArrayList<Device> listdevices = new ArrayList<>();
        
        Device d1 = new Device(1001L,"Device1","Device1 Description",00);
        Device d2 = new Device(1002L,"Device2","Device2 Description",50);
        Device d3 = new Device(1003L,"Device3","Device3 Description",80);
        
        listdevices.add(d3);listdevices.add(d2);listdevices.add(d1);
        System.out.println(listdevices);
        return listdevices;
    }

    @Override
    @GET
    @Path("xx/{param}")
    public boolean setValue(Long deviceID, int value) {
        try{
            device.setCurrentValue(value);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }


    public int getValue(Long deviceID) {
        System.out.println(device.getCurrentValue());
        return device.getCurrentValue();
    }

    @Override
    @GET
    @Path("xx/{param}")
    public Device getDeviceByID(Long deviceID) {
        Device device = new Device(deviceID, "devideByID", "deviceByIDDescription", 80);
        return device;
    }
    
}
