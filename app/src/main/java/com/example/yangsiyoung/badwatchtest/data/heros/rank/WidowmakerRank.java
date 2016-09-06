package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class WidowmakerRank extends QuickCharacter{

    @SerializedName("quick_venom_mine_kill")
    public String quickVenomMineKill;

    public void setQuickVenomMineKill(String quickVenomMineKill) {
        this.quickVenomMineKill = quickVenomMineKill;
    }

    public String getQuickVenomMineKill() {
        return quickVenomMineKill;
    }

    @SerializedName("quick_scoped_critical")
    public String quickScopedCritical;

    public void setQuickScopedCritical(String quickScopedCritical) {
        this.quickScopedCritical = quickScopedCritical;
    }

    public String getQuickScopedCritical() {
        return quickScopedCritical;
    }

    @SerializedName("quick_best_scoped_critical_in_game")
    public String quickBestScopedCriticalInGame;

    public void setQuickBestScopedCriticalInGame(String quickBestScopedCriticalInGame) {
        this.quickBestScopedCriticalInGame = quickBestScopedCriticalInGame;
    }

    public String getQuickBestScopedCriticalInGame() {
        return quickBestScopedCriticalInGame;
    }

    @SerializedName("quick_best_venom_mine_kill_in_game")
    public String quickBestVenomMineKillInGame;

    public void setQuickBestVenomMineKillInGame(String quickBestVenomMineKillInGame) {
        this.quickBestVenomMineKillInGame = quickBestVenomMineKillInGame;
    }

    public String getQuickBestVenomMineKillInGame() {
        return quickBestVenomMineKillInGame;
    }

    @SerializedName("quick_best_view_support_in_game")
    public String quickBestViewSupportInGame;

    public void setQuickBestViewSupportInGame(String quickBestViewSupportInGame) {
        this.quickBestViewSupportInGame = quickBestViewSupportInGame;
    }

    public String getQuickBestViewSupportInGame() {
        return quickBestViewSupportInGame;
    }

    @SerializedName("quick_best_scoped_accuracy_in_game")
    public String quickBestScopedAccuracyInGame;

    public void setQuickBestScopedAccuracyInGame(String quickBestScopedAccuracyInGame) {
        this.quickBestScopedAccuracyInGame = quickBestScopedAccuracyInGame;
    }

    public String getQuickBestScopedAccuracyInGame() {
        return quickBestScopedAccuracyInGame;
    }

    @SerializedName("quick_best_melee_lastshot_in_game")
    public String quickBestMeleeLastShotInGame;

    public void setQuickBestMeleeLastShotInGame(String quickBestMeleeLastShotInGame) {
        this.quickBestMeleeLastShotInGame = quickBestMeleeLastShotInGame;
    }

    public String getQuickBestMeleeLastShotInGame() {
        return quickBestMeleeLastShotInGame;
    }

    @SerializedName("quick_scoped_accuracy")
    public String quickScopedAccuracy;

    public void setQuickScopedAccuracy(String quickScopedAccuracy) {
        this.quickScopedAccuracy = quickScopedAccuracy;
    }

    public String getQuickScopedAccuracy() {
        return quickScopedAccuracy;
    }

    @SerializedName("quick_best_onecombo")
    public String quickBestOneCombo;

    public void setQuickBestOneCombo(String quickBestOneCombo) {
        this.quickBestOneCombo = quickBestOneCombo;
    }

    public String getQuickBestOneCombo() {
        return quickBestOneCombo;
    }
}