package com.cg.asset.dao;

import com.cg.asset.bean.BondBean;
import com.cg.asset.bean.CashBean;
import com.cg.asset.bean.EquityBean;
import com.cg.asset.exception.AssetException;

public interface IAssetDAO {
	
	void viewAssetDetails() throws AssetException;
	
	void defaultDetails() throws AssetException;
	
	void viewEquityDetails() throws AssetException;
	
	void viewBondDetails() throws AssetException;
	
	void viewCashDetails() throws AssetException;
	
	void addEquitydetails(EquityBean temp) throws AssetException;
	
	void addBondDetails(BondBean temp) throws AssetException;
	
	void addCashDetails(int amount) throws AssetException;
	 
	void removeEquityDetails(int id) throws AssetException;
	
	void removeBondDetails(int id) throws AssetException;
	
	void removeCashDetails() throws AssetException;

	

}
