package com.tns.PlacementManagementSystem.service;

import com.tns.PlacementManagementSystem.entities.Placement;

public interface IPlacementService {

    public abstract void addPlacement(Placement placement);
	
	public abstract void updatePlacement(Placement placement);
	
	public abstract Placement searchPlacement(int id);
	
	public abstract void cancelPlacement(int id);

	public abstract void removePlacement(int id);

}
