package com.helloworld.greed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CosmeController {

    @GetMapping("/cosme")
    public List<Supplement> getcosme() {
        return List.of(
                new Supplement("VitaminC", "美白",
                        List.of(
                                new InnerCares("オバジC", "2024.8"),
                                new InnerCares("ホワイトショット", "2025.7"),
                                new InnerCares("ワカサプリ", "2030.8"),
                                new InnerCares("タケダ", "2026.10")
                        ),
                        List.of(
                                new CosmeticsName("化粧水", "3000"),
                                new CosmeticsName("美容液", "15000"),
                                new CosmeticsName("クリーム", "8000")
                        )
                ),
                new Supplement("グルタチオン", "抗酸化作用",
                        List.of(
                                new InnerCares("ナウフーズ", "2025.6"),
                                new InnerCares("ホワイトフォース", "2024.12"),
                                new InnerCares("BBLABO", "2027.6"),
                                new InnerCares("ネイチャーメイド", "2024.9")
                        ),
                        List.of(
                                new CosmeticsName("化粧水", "4000"),
                                new CosmeticsName("美容液", "13000"),
                                new CosmeticsName("クリーム", "7000")
                        )
                )
        );
    }
}
