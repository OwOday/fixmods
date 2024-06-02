package com.modunfucker;

import net.fabricmc.api.ModInitializer;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.bawnorton.mixinsquared.api.MixinCanceller;

public class ModUnfucker implements MixinCanceller {

    public static final Logger LOGGER = LoggerFactory.getLogger("modid");

    @Override
    public boolean shouldCancel(List<String> targetClassNames, String mixinClassName) {
        LOGGER.info("Unfuck spam " + mixinClassName + "    " + targetClassNames);
        for (int i = 0; i < targetClassNames.size(); i++) {
            if (mixinClassName.contains("mods.cybercat.gigeresque.mixins.common.entity.WardenEntityMixin")) {
                LOGGER.info("Unfuck the world: " + targetClassNames + "     " + mixinClassName);
                return true /*
                            * your own logic on whether to cancel mixins by their name or what they're
                            * targeting
                            */;
            }
        }
        return false;
    }
}