package com.cg.asset.dao;

import java.util.*;

import com.cg.asset.bean.BondBean;
import com.cg.asset.bean.CashBean;
import com.cg.asset.bean.EquityBean;
import com.cg.asset.exception.AssetException;

public class AssetDAO implements IAssetDAO{
	
	HashMap<Integer,EquityBean> EquityMap=new HashMap<Integer,EquityBean>();
	HashMap<Integer,BondBean> BondMap=new HashMap<Integer,BondBean>();
	static int CashAmount;
	static CashBean cashObj = new CashBean();
	
	public void defaultDetails() throws AssetException{
	
		EquityBean obj = new EquityBean(1,"ABC",10,5,50);
		EquityMap.put(obj.getId(), obj);
		BondBean obj1 = new BondBean(1,"Bond_1",5000,7,1,5350);
		BondMap.put(obj1.getId(),obj1);
		cashObj.setAmount(15000);
		
		
	}
	
	@Override
	public void viewAssetDetails() throws AssetException{
		
	
		for(Integer key : EquityMap.keySet()) {
			
			System.out.println("key: " + key + " value: " + EquityMap.get(key).getName() + " total amount: " + EquityMap.get(key).getTotal());
			
		}
		
		for(Integer key1 : BondMap.keySet()) {
			
			System.out.println("key: " + key1 + " value: " + BondMap.get(key1).getName() + " total amount: " + BondMap.get(key1).getTotal());
			
		}
		
		System.out.println("Amount: " + cashObj.getAmount());
		
	}


	@Override
	public void viewEquityDetails() throws AssetException{
		
		for(Integer key : EquityMap.keySet()) {
			
			System.out.println("key: " + key + " value: " + EquityMap.get(key));
			
		}	
		
	}


	@Override
	public void viewBondDetails() throws AssetException{
		
		for(Integer key1 : BondMap.keySet()) {
			
			System.out.println("key: " + key1 + " value: " + BondMap.get(key1));
			
		}	
		
	}


	@Override
	public void viewCashDetails() throws AssetException{
	
		System.out.println("Amount: " + cashObj.getAmount());
		
	}


	@Override
	public void addEquitydetails(EquityBean temp ) throws AssetException{
		
		EquityMap.put(temp.getId(), temp);
		
	}


	@Override
	public void addBondDetails(BondBean temp) throws AssetException{
		
		BondMap.put(temp.getId(), temp);
		
	}


	@Override
	public void addCashDetails(int amount) throws AssetException{
		
		cashObj.setAmount(amount);
		
	}


	@Override
	public void removeEquityDetails(int id) throws AssetException{
		
		EquityMap.remove(id);
		
	}


	@Override
	public void removeBondDetails(int id) throws AssetException{
		
		BondMap.remove(id);
		
	}


	@Override
	public void removeCashDetails() throws AssetException{
		
		cashObj.setAmount(0);
		
	}

	
	
}
