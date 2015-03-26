/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.cynapsys.homeautomation.service;

/**
 *
 * @author mouadh
 */
import de.cynapsys.homeautomation.entity.Device;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.jboss.resteasy.annotations.providers.jaxb.json.BadgerFish;

@Path("/test")
public class TestWebService {

    @GET
    @Path("aa/{param}")
    public Response getMsg(@PathParam("param") String msg) {

        String output = "Jersey say : " + msg;

        return Response.status(200).entity(output).build();

    }

    @BadgerFish
    @GET
    @Path("/get")
    @Produces("application/json")
    public List<Device> getAllDevices() {
        List<Device> listdevices = new ArrayList<>();

        Device d1 = new Device(1001L, "Device1", "Device1 Description", 00);
        Device d2 = new Device(1002L, "Device2", "Device2 Description", 50);
        Device d3 = new Device(1003L, "Device3", "Device3 Description", 80);

        listdevices.add(d3);
        listdevices.add(d2);
        listdevices.add(d1);
        System.out.println(listdevices);
        return listdevices;
    }

    @GET
    @BadgerFish
    @Path("/device")
    @Produces("application/json")
    public Device getDevice() {
        return new Device(100L, "Dev1", "Dev1 Description", 100);
    }

}
