package net.langball.coffee;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=CoffeeWork.MODID, name=CoffeeWork.NAME, version=CoffeeWork.VERSION, dependencies="required:forge@[14.23.4.2764,);after:dcs_climate;after:teastory;after:ic2;after:lastsmith@[V1.2.6.3-MC1.12.2,);")
public class CoffeeWork {
	public static final String MODID = "coffeework";
    public static final String NAME = "Coffee Workshop";
    public static final String VERSION = "@version@";
    
	@Instance(CoffeeWork.MODID)
	    public static CoffeeWork instance;
	    
	@SidedProxy(clientSide = "net.langball.coffee.ClientProxy",serverSide = "net.langball.coffee.CommonProxy")
 public static CommonProxy proxy; 
	 
	   
	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}   
	   
