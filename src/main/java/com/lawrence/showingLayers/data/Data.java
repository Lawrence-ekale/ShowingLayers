package com.lawrence.showingLayers.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Data {
	public List<Integer> getData() {
		return (List<Integer>) Arrays.asList(45,32,89,554);
	}

}