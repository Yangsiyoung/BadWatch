package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Roadhog extends QuickCharacter{

    @SerializedName("quick_best_hook_in_game")
    public String quickBestHookInGame;

    public void setQuickBestHookInGame(String quickBestHookInGame) {
        this.quickBestHookInGame = quickBestHookInGame;
    }

    public String getQuickBestHookInGame() {
        return quickBestHookInGame;
    }

    @SerializedName("quick_hook")
    public String quickHook;

    public void setQuickHook(String quickHook) {
        this.quickHook = quickHook;
    }

    public String getQuickHook() {
        return quickHook;
    }

    @SerializedName("quick_hook_attempted")
    public String quickHookAttempted;

    public void setQuickHookAttempted(String quickHookAttempted) {
        this.quickHookAttempted = quickHookAttempted;
    }

    public String getQuickHookAttempted() {
        return quickHookAttempted;
    }

    @SerializedName("quick_best_wholehog_kill_in_game")
    public String quickBestWholeHogKillInGame;

    public void setQuickBestWholeHogKillInGame(String quickBestWholeHogKillInGame) {
        this.quickBestWholeHogKillInGame = quickBestWholeHogKillInGame;
    }

    public String getQuickBestWholeHogKillInGame() {
        return quickBestWholeHogKillInGame;
    }

    @SerializedName("quick_wholehog_kill")
    public String quickWholeHogKill;

    public void setQuickWholeHogKill(String quickWholeHogKill) {
        this.quickWholeHogKill = quickWholeHogKill;
    }

    public String getQuickWholeHogKill() {
        return quickWholeHogKill;
    }

    @SerializedName("quick_best_hook_accuracy_in_game")
    public String quickBestHookAccuracyInGame;

    public void setQuickBestHookAccuracyInGame(String quickBestHookAccuracyInGame) {
        this.quickBestHookAccuracyInGame = quickBestHookAccuracyInGame;
    }

    public String getQuickBestHookAccuracyInGame() {
        return quickBestHookAccuracyInGame;
    }

    @SerializedName("quick_best_melee_lastshot_in_game")
    public String quickBestMeleeLastShotInGame;

    public void setQuickBestMeleeLastShotInGame(String quickBestMeleeLastShotInGame) {
        this.quickBestMeleeLastShotInGame = quickBestMeleeLastShotInGame;
    }

    public String getQuickBestMeleeLastShotInGame() {
        return quickBestMeleeLastShotInGame;
    }

    @SerializedName("quick_hook_accuracy")
    public String quickHookAccuracy;

    public void setQuickHookAccuracy(String quickHookAccuracy) {
        this.quickHookAccuracy = quickHookAccuracy;
    }

    public String getQuickHookAccuracy() {
        return quickHookAccuracy;
    }

    @SerializedName("quick_best_onecombo")
    public String quickBestOneCombo;

    public void setQuickBestOneCombo(String quickBestOneCombo){
        this.quickBestOneCombo = quickBestOneCombo;
    }

    public String getQuickBestOneCombo(){
        return  quickBestOneCombo;
    }
}