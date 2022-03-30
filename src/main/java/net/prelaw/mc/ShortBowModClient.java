package net.prelaw.mc;

import net.fabricmc.api.ClientModInitializer;
import net.prelaw.mc.util.ModModelPredicateProvider;

public class ShortBowModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.registerModModels();
    }
}

