package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Zarya extends QuickCharacter{

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

    @SerializedName("quick_graviton_surge_kill")
    public String quickGravitonSurgeKill;

    public void setQuickGravitonSurgeKill(String quickGravitonSurgeKill) {
        this.quickGravitonSurgeKill = quickGravitonSurgeKill;
    }

    public String getQuickGravitonSurgeKill() {
        return quickGravitonSurgeKill;
    }

    @SerializedName("quick_best_graviton_kill_in_game")
    public String quickBestGravitonKillInGame;

    public void setQuickBestGravitonKillInGame(String quickBestGravitonKillInGame) {
        this.quickBestGravitonKillInGame = quickBestGravitonKillInGame;
    }

    public String getQuickBestGravitonKillInGame() {
        return quickBestGravitonKillInGame;
    }

    @SerializedName("quick_best_high_energy_kill_in_game")
    public String quickBestHignEnergyKillInGame;

    public void setQuickBestHignEnergyKillInGame(String quickBestHignEnergyKillInGame) {
        this.quickBestHignEnergyKillInGame = quickBestHignEnergyKillInGame;
    }

    public String getQuickBestHignEnergyKillInGame() {
        return quickBestHignEnergyKillInGame;
    }

    @SerializedName("quick_high_energy_kill")
    public String quickHignEnergyKill;

    public void setQuickHignEnergyKill(String quickHignEnergyKill) {
        this.quickHignEnergyKill = quickHignEnergyKill;
    }

    public String getQuickHignEnergyKill() {
        return quickHignEnergyKill;
    }

    @SerializedName("quick_barrier")
    public String quickBarrier;

    public void setQuickBarrier(String quickBarrier) {
        this.quickBarrier = quickBarrier;
    }

    public String getQuickBarrier() {
        return quickBarrier;
    }

    @SerializedName("quick_best_average_energy_in_game")
    public String quickBestAverageEnergyInGame;

    public void setQuickBestAverageEnergyInGame(String quickBestAverageEnergyInGame) {
        this.quickBestAverageEnergyInGame = quickBestAverageEnergyInGame;
    }

    public String getQuickBestAverageEnergyInGame() {
        return quickBestAverageEnergyInGame;
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

    @SerializedName("quick_best_barrier_in_game")
    public String quickBestBarrierInGame;

    public void setQuickBestBarrierInGame(String quickBestBarrierInGame) {
        this.quickBestBarrierInGame = quickBestBarrierInGame;
    }

    public String getQuickBestBarrierInGame() {
        return quickBestBarrierInGame;
    }
}