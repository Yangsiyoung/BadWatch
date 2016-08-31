package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Winston extends QuickCharacter{

    @SerializedName("quick_knocked_back")
    public String quickKnockedBack;

    public void setQuickKnockedBack(String quickKnockedBack) {
        this.quickKnockedBack = quickKnockedBack;
    }

    public String getQuickKnockedBack() {
        return quickKnockedBack;
    }

    @SerializedName("quick_damage_blocked")
    public String quickDamageBlocked;

    public void setQuickDamageBlocked(String quickDamageBlocked) {
        this.quickDamageBlocked = quickDamageBlocked;
    }

    public String getQuickDamageBlocked() {
        return quickDamageBlocked;
    }

    @SerializedName("quick_best_damage_blocked_in_game")
    public String quickBestDamageBlockedInGame;

    public void setQuickBestDamageBlockedInGame(String quickBestDamageBlockedInGame) {
        this.quickBestDamageBlockedInGame = quickBestDamageBlockedInGame;
    }

    public String getQuickBestDamageBlockedInGame() {
        return quickBestDamageBlockedInGame;
    }

    @SerializedName("quick_best_knocked_back_in_game")
    public String quickBestKnockedBackInGame;

    public void setQuickBestKnockedBackInGame(String quickBestKnockedBackInGame) {
        this.quickBestKnockedBackInGame = quickBestKnockedBackInGame;
    }

    public String getQuickBestKnockedBackInGame() {
        return quickBestKnockedBackInGame;
    }

    @SerializedName("quick_melee_kill")
    public String quickMeleeKill;

    public void setQuickMeleeKill(String quickMeleeKill) {
        this.quickMeleeKill = quickMeleeKill;
    }

    public String getQuickMeleeKill() {
        return quickMeleeKill;
    }

    @SerializedName("quick_best_melee_kill_in_game")
    public String quickBestMeleeKillInGame;

    public void setQuickBestMeleeKillInGame(String quickBestMeleeKillInGame) {
        this.quickBestMeleeKillInGame = quickBestMeleeKillInGame;
    }

    public String getQuickBestMeleeKillInGame() {
        return quickBestMeleeKillInGame;
    }

    @SerializedName("quick_jump_pack_kill")
    public String quickJumpPackKill;

    public void setQuickJumpPackKill(String quickJumpPackKill) {
        this.quickJumpPackKill = quickJumpPackKill;
    }

    public String getQuickJumpPackKill() {
        return quickJumpPackKill;
    }

    @SerializedName("quick_best_jump_pack_kill_in_game")
    public String quickBestJumpPackKillInGame;

    public void setQuickBestJumpPackKillInGame(String quickBestJumpPackKillInGame) {
        this.quickBestJumpPackKillInGame = quickBestJumpPackKillInGame;
    }

    public String getQuickBestJumpPackKillInGame() {
        return quickBestJumpPackKillInGame;
    }

    @SerializedName("quick_best_melee_lastshot_in_game")
    public String quickBestMeleeLastShotInGame;

    public void setQuickBestMeleeLastShotInGame(String quickBestMeleeLastShotInGame) {
        this.quickBestMeleeLastShotInGame = quickBestMeleeLastShotInGame;
    }

    public String getQuickBestMeleeLastShotInGame() {
        return quickBestMeleeLastShotInGame;
    }

    @SerializedName("quick_best_onecombo")
    public String quickBestOneCombo;

    public void setQuickBestOneCombo(String quickBestOneCombo) {
        this.quickBestOneCombo = quickBestOneCombo;
    }

    public String getQuickBestOneCombo() {
        return quickBestOneCombo;
    }

    @SerializedName("quick_primal_rage_kill")
    public String quickPrimalRageKill;

    public void setQuickPrimalRageKill(String quickPrimalRageKill) {
        this.quickPrimalRageKill = quickPrimalRageKill;
    }

    public String getQuickPrimalRageKill() {
        return quickPrimalRageKill;
    }

    @SerializedName("quick_best_primal_rage_kill_in_game")
    public String quickBestPrimalRageKillInGame;

    public void setQuickBestPrimalRageKillInGame(String quickBestPrimalRageKillInGame) {
        this.quickBestPrimalRageKillInGame = quickBestPrimalRageKillInGame;
    }

    public String getQuickBestPrimalRageKillInGame() {
        return quickBestPrimalRageKillInGame;
    }
}