package com.tns.PlacementManagementSystem.service;

import com.tns.PlacementManagementSystem.entities.Certificate;
import com.tns.PlacementManagementSystem.repository.CertificateRepositoryImpl;
import com.tns.PlacementManagementSystem.repository.ICertificateRepository;

public class CertificateServiceImpl implements ICertificateService {

	//Step1: Establishing Connection between Service and Repo
		private ICertificateRepository certify ;
		
		public  CertificateServiceImpl()
		{
		 certify = new CertificateRepositoryImpl();
		}

	
	
	@Override
	public Certificate addCertificate(Certificate certificate) 
	{
		certify.beginTransaction();
		certify.addCertificate (certificate);
		certify.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate)
	{
		certify.beginTransaction();
		certify.updateCertificate (certificate);
		certify.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
		
		certify.beginTransaction();
		certify.searchCertificate(id);
		certify.commitTransaction();
		return null;
	}

	@Override
	public Certificate deleteCertificate(int id) {
		certify.beginTransaction();
		certify.deleteCertificate(id);
		certify.commitTransaction(); 
		return null;
	}


}
