package com.sap.refapps.espm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class LogisticsController {
	private String modeOfTransport;
	
//http://localhost:9996/api/v1/shipmentmode?shippedFrom=rk1&shippedTo=rk1
@GetMapping("/shipmentmode")
public String getShipmentMode(
		@RequestParam("shippedFrom") final String shippedFrom,
		@RequestParam("shippedTo") final String shippedTo
		)
{   
	modeOfTransport = "Air";
	if (shippedFrom.equals(shippedTo))
	{ modeOfTransport = "Land";}
	else
	{modeOfTransport =  "Air";}
	
  return modeOfTransport;
}
}