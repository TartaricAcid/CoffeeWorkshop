package net.langball.coffee.compat.jei;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.BlankRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.langball.coffee.CoffeeWork;
import net.langball.coffee.block.BlockLoader;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

@SuppressWarnings("deprecation")
public class CategoryGrinder extends BlankRecipeCategory<IRecipeWrapper>{
	 protected final IDrawable background;
	  private final IDrawable icon;
	  public CategoryGrinder(IGuiHelper helper) {
		  ResourceLocation backgroundTexture = new ResourceLocation(CoffeeWork.MODID+":textures/gui/grinder.png");
		  this.icon = helper.createDrawableIngredient(new ItemStack(BlockLoader.Grinder));
		  this.background = helper.createDrawable(backgroundTexture, 55, 16, 82, 54);
	}
	@Override
	public IDrawable getBackground() {
		// TODO Auto-generated method stub
		return background;
	}

	@Override
	public String getModName() {
		// TODO Auto-generated method stub
		return CoffeeWork.NAME;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return I18n.format("jei.coffeework.category.grinder", new Object[0]);
	}

	@Override
	public String getUid() {
		// TODO Auto-generated method stub
		return "coffeework.grinder";
	}
	@Override
	public void setRecipe(IRecipeLayout arg0, IRecipeWrapper arg1, IIngredients arg2) {
		IGuiItemStackGroup items = arg0.getItemStacks();
		
		items.init(0, true, 0, 0);
		items.init(2, false, 60, 18);
	    
		items.set(arg2);
	}
	public IDrawable getIcon() {
		return icon;
	}

}
