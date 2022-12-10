package com.lawrence.showingLayers.businessLogic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lawrence.showingLayers.data.Data;

@Component
public class Business {
	int sum=0;
	@Autowired
	Data toReturn;
	public int returnSum() {
		int sum=0;
		List<Integer> res = this.toReturn.getData();
		for(int i=0; i<res.size();i++)
			sum+=res.get(i);
		return sum;
	}

}

