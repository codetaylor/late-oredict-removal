package com.sudoplay.mc.pwcustom;

import com.codetaylor.mc.athenaeum.module.ModuleManager;
import com.sudoplay.mc.pwcustom.modules.utils.ModuleUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.*;

@Mod(
    modid = ModLateOreDictRemoval.MOD_ID,
    version = ModLateOreDictRemoval.VERSION,
    name = ModLateOreDictRemoval.NAME
    //@@DEPENDENCIES@@
)
public class ModLateOreDictRemoval {

  public static final String MOD_ID = Reference.MOD_ID;
  public static final String VERSION = Reference.VERSION;
  public static final String NAME = Reference.NAME;

  @SuppressWarnings("unused")
  @Mod.Instance
  public static ModLateOreDictRemoval INSTANCE;

  private final ModuleManager moduleManager;

  public ModLateOreDictRemoval() {

    this.moduleManager = new ModuleManager(MOD_ID);
    this.moduleManager.registerModules(
        ModuleUtils.class
    );
  }

  @Mod.EventHandler
  public void onConstructionEvent(FMLConstructionEvent event) {

    this.moduleManager.onConstructionEvent();
    this.moduleManager.routeFMLStateEvent(event);
  }

  @Mod.EventHandler
  public void onPreInitializationEvent(FMLPreInitializationEvent event) {

    this.moduleManager.routeFMLStateEvent(event);
  }

  @Mod.EventHandler
  public void onInitializationEvent(FMLInitializationEvent event) {

    this.moduleManager.routeFMLStateEvent(event);
  }

  @Mod.EventHandler
  public void onPostInitializationEvent(FMLPostInitializationEvent event) {

    this.moduleManager.routeFMLStateEvent(event);
  }

  @Mod.EventHandler
  public void onLoadCompleteEvent(FMLLoadCompleteEvent event) {

    this.moduleManager.routeFMLStateEvent(event);
  }

  @Mod.EventHandler
  public void onServerAboutToStartEvent(FMLServerAboutToStartEvent event) {

    this.moduleManager.routeFMLStateEvent(event);
  }

  @Mod.EventHandler
  public void onServerStartingEvent(FMLServerStartingEvent event) {

    this.moduleManager.routeFMLStateEvent(event);
  }

  @Mod.EventHandler
  public void onServerStartedEvent(FMLServerStartedEvent event) {

    this.moduleManager.routeFMLStateEvent(event);
  }

  @Mod.EventHandler
  public void onServerStoppingEvent(FMLServerStoppingEvent event) {

    this.moduleManager.routeFMLStateEvent(event);
  }

  @Mod.EventHandler
  public void onServerStoppedEvent(FMLServerStoppedEvent event) {

    this.moduleManager.routeFMLStateEvent(event);
  }

}
