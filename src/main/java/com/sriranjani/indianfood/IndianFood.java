package com.sriranjani.indianfood;

import net.fabricmc.api.ModInitializer;


import com.sriranjani.indianfood.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndianFood implements ModInitializer {
	public static final String MOD_ID = "indianfood";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}