package com.cg.asset.service;

import java.util.ArrayList;

import com.cg.asset.bean.BondBean;
import com.cg.asset.bean.CashBean;
import com.cg.asset.bean.EquityBean;
import com.cg.asset.dao.AssetDAO;
import com.cg.asset.exception.AssetException;

public class AssetService implements IAssetService {

	AssetDAO dao = new AssetDAO();
	
	@Override
	public void viewAssetDetails() throws AssetException{
		
		dao.viewAssetDetails();
		
	}

	@Override
	public void defaultDetails() throws AssetException{
		
		dao.defaultDetails();
		
	}

	@Override
	public void viewEquityDetails() throws AssetException{
		
		dao.viewEquityDetails();
		
	}

	@Override
	public void viewBondDetails() throws AssetException{
		
		dao.viewBondDetails();
	}

	@Override
	public void viewCashDetails() throws AssetException{
		
		dao.viewCashDetails();
		
	}

	@Override
	public void addEquitydetails(EquityBean temp) throws AssetException{
		
		dao.addEquitydetails(temp);
		
	}

	@Override
	public void addBondDetails(BondBean temp) throws AssetException{
		
		dao.addBondDetails(temp);
		
	}

	@Override
	public void addCashDetails(int amount) throws AssetException{
		
		dao.addCashDetails(amount);
		
	}

	@Override
	public void removeEquityDetails(int id) throws AssetException{
		dao.removeEquityDetails(id);
		
	}

	@Override
	public void removeBondDetails(int id) throws AssetException{
	
		dao.removeBondDetails(id);
		
	}

	@Override
	public void removeCashDetails() throws AssetException{
		
		dao.removeCashDetails();
		
	}
	
	private boolean isValidName(String nameToBeChecked) {
		
		String pattern = "[a-zA-Z_1-9]{1,}";
		
		if(nameToBeChecked.matches(pattern)) {
			return true;
		}
		else {
			return false;
		}
		
		
		
		
	}

	@Override
	public boolean isValidEquity(EquityBean temp) throws AssetException {
		
		ArrayList<String> validationErrors = new ArrayList<String>();
		
		if(!isValidName(temp.getName())) {
			validationErrors.add("Please enter correct name format");
		}
		
		if(!validationErrors.isEmpty()) {
			throw new AssetException(validationErrors+" ");
		}
		return true;
	}

	@Override
	public boolean isValidBond(BondBean temp) throws AssetException {
		
		ArrayList<String> validationErrors = new ArrayList<String>();
		
		if(!isValidName(temp.getName())) {
			validationErrors.add("Please enter correct name format");
		}
		
		if(!validationErrors.isEmpty()) {
			throw new AssetException(validationErrors+" ");
		}
		
		return true;
	}

}
