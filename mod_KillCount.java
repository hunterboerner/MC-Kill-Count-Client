package net.minecraft.src;

import net.minecraft.client.Minecraft;


public class mod_KillCount extends BaseMod {

	public mod_KillCount(){
		
	}
	
	public String players = "5";
	public String peaceful = "3";
	public String passiveAgressive = "12";
	public String hostile = "1111";
	
	@Override
	public boolean onTickInGame(float f, Minecraft mc) {
		Gui.drawRect(0,0,100,100,0x99999999);
		
	    mc.fontRenderer.drawString("Kill Counter", 1,1,1);
	    mc.fontRenderer.drawString("Kill Counter", 2,1,1);
	    mc.fontRenderer.drawString("Players: ", 1,12,1);
	    mc.fontRenderer.drawString(players, 45,12,1);
	    mc.fontRenderer.drawString("Peaceful: ", 1,24,1);
	    mc.fontRenderer.drawString(peaceful, 50,24,1);
	    mc.fontRenderer.drawString("Neutral: ", 1,36,1);
	    mc.fontRenderer.drawString(passiveAgressive, 42,36,1);
	    mc.fontRenderer.drawString("Hostile: ", 1,48,1);
	    mc.fontRenderer.drawString(hostile, 42,48,1);
	    
		return true;
	}

	
	@Override
	public String getVersion() {
		return "Kill Counter 0.5";
	}

	@Override
	public void load() {
		ModLoader.setInGameHook(this, true, false);
	}

	
	
}
