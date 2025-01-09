package dyingember.modid;

import dyingember.modid.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CSMPDyingEmber implements ModInitializer {
	public static final String MOD_ID = "csmp_dyingember";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();



	}
}