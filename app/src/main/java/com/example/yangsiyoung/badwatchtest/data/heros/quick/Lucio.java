package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Lucio extends QuickCharacter{

    @SerializedName("quick_sound_barrier")
    public String quickSoundBarrier;

    public void setQuickSoundBarrier(String quickSoundBarrier) {
        this.quickSoundBarrier = quickSoundBarrier;
    }

    public String getQuickSoundBarrier() {
        return quickSoundBarrier;
    }

    @SerializedName("quick_best_sound_barrier_in_game")
    public String quickBestSoundBarrierInGame;

    public void setQuickBestSoundBarrierInGame(String quickBestSoundBarrierInGame) {
        this.quickBestSoundBarrierInGame = quickBestSoundBarrierInGame;
    }

    public String getQuickBestSoundBarrierInGame() {
        return quickBestSoundBarrierInGame;
    }

    @SerializedName("quick_best_melee_lastshot_in_game")
    public String quickBestMeleeLastShotInGame;

    public void setQuickBestMeleeLastShotInGame(String quickBestMeleeLastShotInGame) {
        this.quickBestMeleeLastShotInGame = quickBestMeleeLastShotInGame;
    }

    public String getQuickBestMeleeLastShotInGame() {
        return quickBestMeleeLastShotInGame;
    }

    @SerializedName("quick_attack_support")
    public String quickAttackSupport;

    public void setQuickAttackSupport(String quickAttackSupport) {
        this.quickAttackSupport = quickAttackSupport;
    }

    public String getQuickAttackSupport() {
        return quickAttackSupport;
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