package com.helloworld.greed;

import java.util.List;

public class Supplement {
    private final String name;//成分名
    private final String effect;//効果
    private final List<InnerCares> innerCare;//飲む方
    private final List<CosmeticsName> cosmetic;//塗る方

    public Supplement(String name, String effect, List<InnerCares> innerCare, List<CosmeticsName> cosmetic) {
        this.name = name;
        this.effect = effect;
        this.innerCare = innerCare;
        this.cosmetic = cosmetic;
    }

    public String getName() {
        return name;
    }

    public String getEffect() {
        return effect;
    }

    public List<InnerCares> getInnerCare() {
        return innerCare;
    }

    public List<CosmeticsName> getCosmetic() {
        return cosmetic;
    }
}
