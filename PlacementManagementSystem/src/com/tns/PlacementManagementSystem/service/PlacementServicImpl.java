package com.tns.PlacementManagementSystem.service;

import com.tns.PlacementManagementSystem.entities.Placement;
import com.tns.PlacementManagementSystem.repository.IPlacementRepository;
import com.tns.PlacementManagementSystem.repository.PlacementRepositoryImpl;

public class PlacementServicImpl implements IPlacementService{
private IPlacementRepository dao;
	
	public void PlacementServiceImpl() {
		dao = new PlacementRepositoryImpl();
		
	}

	@Override
	public void addPlacement(Placement placement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePlacement(Placement placement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Placement searchPlacement(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelPlacement(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePlacement(int id) {
		// TODO Auto-generated method stub
		
	}
	

}
