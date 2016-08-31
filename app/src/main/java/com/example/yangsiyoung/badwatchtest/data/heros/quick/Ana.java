package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Ana extends QuickCharacter{

    @SerializedName("quick_best_melee_lastshot_in_game")
    public String quickBestMeleeLastShotInGame;

    public void setQuickBestMeleeLastShotInGame(String quickBestMeleeLastShotInGame){
        this.quickBestMeleeLastShotInGame = quickBestMeleeLastShotInGame;
    }

    public String getQuickBestMeleeLastShotInGame(){
        return quickBestMeleeLastShotInGame;
    }

    @SerializedName("quick_nano_boosts_applied")
    public String quickNanoBoostsApplied;

    public void setQuickNanoBoostsApplied(String quickNanoBoostsApplied){
        this.quickNanoBoostsApplied = quickNanoBoostsApplied;
    }

    public String getQuickNanoBoostsApplied(){
        return quickNanoBoostsApplied;
    }

    @SerializedName("quick_nano_boosts_support")
    public String quickNanoBoostsSupport;

    public void setQuickNanoBoostsSupport(String quickNanoBoostsSupport){
        this.quickNanoBoostsSupport = quickNanoBoostsSupport;
    }

    public String getQuickNanoBoostsSupport(){
        return quickNanoBoostsSupport;
    }

    @SerializedName("quick_best_nano_boosts_support_in_game")
    public String quickBestNanoBoostsSupportInGame;

    public void setQuickBestNanoBoostsSupportInGame(String quickBestNanoBoostsSupportInGame){
        this.quickBestNanoBoostsSupportInGame = quickBestNanoBoostsSupportInGame;
    }

    public String getQuickBestNanoBoostsSupportInGame(){
        return quickBestNanoBoostsSupportInGame;
    }

    @SerializedName("quick_unscoped_accuracy")
    public String quickUnscopedAccuracy;

    public void setQuickUnscopedAccuracy(String quickUnscopedAccuracy){
        this.quickUnscopedAccuracy = quickUnscopedAccuracy;
    }

    public String getQuickUnscopedAccuracy(){
        return quickUnscopedAccuracy;
    }

    @SerializedName("quick_scoped_accuracy")
    public String quickScopedAccuracy;

    public void setQuicScopedAccuracy(String quickScopedAccuracy){
        this.quickScopedAccuracy = quickScopedAccuracy;
    }

    public String getQuickScopedAccuracy(){
        return quickScopedAccuracy;
    }

    @SerializedName("quick_best_onecombo")
    public String quickBestOneCombo;

    public void setQuickBestOneCombo(String quickBestOneCombo){
        this.quickBestOneCombo = quickBestOneCombo;
    }

    public String getQuickBestOneCombo(){
        return quickBestOneCombo;
    }

    @SerializedName("quick_defence_support")
    public String quickDefenceSupport;

    public void setQuickDefenceSupport(String quickDefenceSupport){
        this.quickDefenceSupport = quickDefenceSupport;
    }

    public String getQuickDefenceSupport(){
        return quickDefenceSupport;
    }

    @SerializedName("quick_enemy_slept")
    public String quickEnemySlept;

    public void setQuickEnemySlept(String quickEnemySlept){
        this.quickEnemySlept = quickEnemySlept;
    }

    public String getQuickEnemySlept(){
        return quickEnemySlept;
    }

    @SerializedName("quick_best_enemy_slept_in_game")
    public String quickBestEnemySleptInGame;

    public void setQuickBestEnemySleptInGame(String quickBestEnemySleptInGame){
        this.quickBestEnemySleptInGame = quickBestEnemySleptInGame;
    }

    public String getQuickBestEnemySleptInGame(){
        return quickBestEnemySleptInGame;
    }

}
