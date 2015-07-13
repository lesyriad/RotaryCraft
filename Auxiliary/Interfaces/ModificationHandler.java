package Reika.RotaryCraft.Auxiliary.Interfaces;

import Reika.RotaryCraft.Auxiliary.RecipeManagers.RecipeHandler.RecipeLevel;

public class ModificationHandler {

	public static enum ModificationSetting {
		FULL(0),
		FLEXIBLE(1),
		DEFAULT(2),
		NONE(Integer.MAX_VALUE);

		private final int minIndex;

		private ModificationSetting(int i) {
			minIndex = i;
		}

		public boolean canRemoveRecipe(RecipeLevel l) {
			return minIndex <= l.ordinal();
		}

		public static ModificationSetting getSetting() {
			return ModificationSetting.DEFAULT;
		}
	}
}
