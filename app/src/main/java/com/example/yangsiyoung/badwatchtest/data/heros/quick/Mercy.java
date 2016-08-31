package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Mercy extends QuickCharacter{

    @SerializedName("quick_resurrected")
    public String quickResurrected;

    public void setQuickResurrected(String quickResurrected) {
        this.quickResurrected = quickResurrected;
    }

    public String getQuickResurrected() {
        return quickResurrected;
    }

    @SerializedName("quick_best_resurrected_in_game")
    public String quickBestResurrectedInGame;

    public void setQuickBestResurrectedInGame(String quickBestResurrectedInGame) {
        this.quickBestResurrectedInGame = quickBestResurrectedInGame;
    }

    public String getQuickBestResurrectedInGame() {
        return quickBestResurrectedInGame;
    }

    @SerializedName("quick_best_melee_lastshot_in_game")
    public String quickBestMeleeLastShotInGame;

    public void setQuickBestMeleeLastShotInGame(String quickBestMeleeLastShotInGame) {
        this.quickBestMeleeLastShotInGame = quickBestMeleeLastShotInGame;
    }

    public String getQuickBestMeleeLastShotInGame() {
        return quickBestMeleeLastShotInGame;
    }

    @SerializedName("quick_blaster_kill")
    public String quickBlasterKill;

    public void setQuickBlasterKill(String quickBlasterKill) {
        this.quickBlasterKill = quickBlasterKill;
    }

    public String getQuickBlasterKill() {
        return quickBlasterKill;
    }

    @SerializedName("quick_best_blaster_kill_in_game")
    public String quickBestBlasterKillInGame;

    public void setQuickBestBlasterKillInGame(String quickBestBlasterKillInGame) {
        this.quickBestBlasterKillInGame = quickBestBlasterKillInGame;
    }

    public String getQuickBestBlasterKillInGame() {
        return quickBestBlasterKillInGame;
    }

    @SerializedName("quick_best_attack_support_in_game")
    public String quickBestAttackSupportInGame;

    public void setQuickBestAttackSupportInGame(String quickBestAttackSupportInGame) {
        this.quickBestAttackSupportInGame = quickBestAttackSupportInGame;
    }

    public String getQuickBestAttackSupportInGame() {
        return quickBestAttackSupportInGame;
    }

    @SerializedName("quick_defence_support")
    public String quickDefenceSupport;

    public void setQuickDefenceSupport(String quickDefenceSupport) {
        this.quickDefenceSupport = quickDefenceSupport;
    }

    public String getQuickDefenceSupport() {
        return quickDefenceSupport;
    }

    @SerializedName("quick_best_defence_support_in_game")
    public String quickBestDefenceSupportInGame;

    public void setQuickBestDefenceSupportInGame(String quickBestDefenceSupportInGame) {
        this.quickBestDefenceSupportInGame = quickBestDefenceSupportInGame;
    }

    public String getQuickBestDefenceSupportInGame() {
        return quickBestDefenceSupportInGame;
    }
}