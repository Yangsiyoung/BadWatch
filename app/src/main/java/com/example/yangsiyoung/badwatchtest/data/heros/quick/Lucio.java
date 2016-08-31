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

}