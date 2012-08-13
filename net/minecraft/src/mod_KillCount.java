package net.minecraft.src;

import net.minecraft.client.Minecraft;


public class mod_KillCount extends BaseMod {

	public mod_KillCount(){
		
	}
	
	public String kills = "0";
	public String deaths = "0";
	
	@Override
	public boolean onTickInGame(float f, Minecraft mc) {
		Gui.drawRect(0,0,100,100,0x99999999);
		
	    mc.fontRenderer.drawString("Kill Counter", 1,1,1);
	    mc.fontRenderer.drawString("Kill Counter", 2,1,1);
	    mc.fontRenderer.drawString("Kills: ", 1,12,1);
	    mc.fontRenderer.drawString(kills, 45,12,1);
	    mc.fontRenderer.drawString("Deaths: ", 1,24,1);
	    mc.fontRenderer.drawString(deaths, 45,24,1);
	    
		return true;
	}

	
	@Override
	public String getVersion() {
		return "Kill Counter 0.5";
	}

	@Override
	public void clientCustomPayload(NetClientHandler var1, Packet250CustomPayload killData) {
		if(killData.channel.equalsIgnoreCase("killcount")){
			kills = new String (killData.data);	
		}
		if(killData.channel.equalsIgnoreCase("deathcount")){
			deaths = new String (killData.data);
		}
	}
	
	
	@Override
	public void load() {
		ModLoader.registerPacketChannel(this, "KillCount");
		ModLoader.registerPacketChannel(this, "DeathCount");
		ModLoader.setInGameHook(this, true, false);
	}

	
	
}
