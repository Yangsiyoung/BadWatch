package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Pharah extends QuickCharacter{

    @SerializedName("quick_rocket_hit")
    public String quickRocketHit;

    public void setQuickRocketHit(String quickRocketHit) {
        this.quickRocketHit = quickRocketHit;
    }

    public String getQuickRocketHit() {
        return quickRocketHit;
    }

    @SerializedName("quick_barrage_kill")
    public String quickBarrageKill;

    public void setQuickBarrageKill(String quickBarrageKill) {
        this.quickBarrageKill = quickBarrageKill;
    }

    public String getQuickBarrageKill() {
        return quickBarrageKill;
    }

    @SerializedName("quick_best_rocket_hit_in_game")
    public String quickBestRocketHitInGame;

    public void setQuickBestRocketHitInGame(String quickBestRocketHitInGame) {
        this.quickBestRocketHitInGame = quickBestRocketHitInGame;
    }

    public String getQuickBestRocketHitInGame() {
        return quickBestRocketHitInGame;
    }

    @SerializedName("quick_best_barrage_kill_in_game")
    public String quickBestBarrageKillInGame;

    public void setQuickBestBarrageKillInGame(String quickBestBarrageKillInGame) {
        this.quickBestBarrageKillInGame = quickBestBarrageKillInGame;
    }

    public String getQuickBestBarrageKillInGame() {
        return quickBestBarrageKillInGame;
    }

    @SerializedName("quick_best_melee_lastshot_in_game")
    public String quickBestMeleeLastShotInGame;

    public void setQuickBestMeleeLastShotInGame(String quickBestMeleeLastShotInGame) {
        this.quickBestMeleeLastShotInGame = quickBestMeleeLastShotInGame;
    }

    public String getQuickBestMeleeLastShotInGame() {
        return quickBestMeleeLastShotInGame;
    }
}