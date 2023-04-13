package com.HRMS.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.services.DemandService;
import com.HRMS.dao.DemandDAO;
import com.HRMS.model.DemandMaster;

@Service
public class DemandImpl implements DemandService{
	
	@Autowired
	private DemandDAO demanddao;

	@Override
	public List<DemandMaster> getDemand() {
		
		try {
		List<DemandMaster> alldemands = (List<DemandMaster>) this.demanddao.findAll();
		return alldemands;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Optional<DemandMaster> getDemandbyid(int id) {
		
		try {
			
			Optional<DemandMaster> findById = this.demanddao.findById(id);
			return findById;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public DemandMaster addDemand(DemandMaster demandMaster) {
		
		try {
			DemandMaster save = this.demanddao.save(demandMaster);
			return save;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public DemandMaster updateDemand(DemandMaster demandMaster, int id) {
		
		try
		{
		demandMaster.setDemand_id(id);
		DemandMaster updateDemand = this.demanddao.save(demandMaster);
		return updateDemand;
		} 
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void deleteDemand(int id) {
		
		try {
			this.demanddao.deleteById(id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
