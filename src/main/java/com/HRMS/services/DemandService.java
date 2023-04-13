package com.HRMS.services;

import java.util.List;
import java.util.Optional;

import com.HRMS.model.DemandMaster;

public interface DemandService {
	
	
	List<DemandMaster> getDemand();

	Optional<DemandMaster> getDemandbyid(int id);

	DemandMaster addDemand(DemandMaster demandMaster);

	DemandMaster updateDemand(DemandMaster demandMaster, int id);

	void deleteDemand(int id);
}
