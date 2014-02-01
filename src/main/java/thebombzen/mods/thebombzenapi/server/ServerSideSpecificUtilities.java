package thebombzen.mods.thebombzenapi.server;

import java.io.File;

import net.minecraft.server.MinecraftServer;
import thebombzen.mods.thebombzenapi.SideSpecificUtlities;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * This class provides server-side-specific functions.
 * 
 * @author thebombzen
 */
@SideOnly(Side.SERVER)
public class ServerSideSpecificUtilities implements SideSpecificUtlities {

	@Override
	public File getMinecraftDirectory() {
		return new File(MinecraftServer.getServer().getFolderName());
	}

	@Override
	public boolean isClient() {
		return false;
	}

}
