package com.tns.PlacementManagementSystem.service;

import com.tns.PlacementManagementSystem.entities.Certificate;

public interface ICertificateService {
	public Certificate addCertificate (Certificate certificate);
	public Certificate updateCertificate (Certificate certificate);
	public Certificate searchCertificate (int id);
	public Certificate deleteCertificate (int id);


}
