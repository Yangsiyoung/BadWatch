package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class ZaryaRank extends RankCharacter{

    @SerializedName("rank_damage_blocked")
    public String rankDamageBlocked;

    public void setRankDamageBlocked(String rankDamageBlocked) {
        this.rankDamageBlocked = rankDamageBlocked;
    }

    public String getRankDamageBlocked() {
        return rankDamageBlocked;
    }

    @SerializedName("rank_best_damage_blocked_in_game")
    public String rankBestDamageBlockedInGame;

    public void setRankBestDamageBlockedInGame(String rankBestDamageBlockedInGame) {
        this.rankBestDamageBlockedInGame = rankBestDamageBlockedInGame;
    }

    public String getRankBestDamageBlockedInGame() {
        return rankBestDamageBlockedInGame;
    }

    @SerializedName("rank_graviton_surge_kill")
    public String rankGravitonSurgeKill;

    public void setRankGravitonSurgeKill(String rankGravitonSurgeKill) {
        this.rankGravitonSurgeKill = rankGravitonSurgeKill;
    }

    public String getRankGravitonSurgeKill() {
        return rankGravitonSurgeKill;
    }

    @SerializedName("rank_best_graviton_kill_in_game")
    public String rankBestGravitonKillInGame;

    public void setRankBestGravitonKillInGame(String rankBestGravitonKillInGame) {
        this.rankBestGravitonKillInGame = rankBestGravitonKillInGame;
    }

    public String getRankBestGravitonKillInGame() {
        return rankBestGravitonKillInGame;
    }

    @SerializedName("rank_best_high_energy_kill_in_game")
    public String rankBestHignEnergyKillInGame;

    public void setRankBestHignEnergyKillInGame(String rankBestHignEnergyKillInGame) {
        this.rankBestHignEnergyKillInGame = rankBestHignEnergyKillInGame;
    }

    public String getRankBestHignEnergyKillInGame() {
        return rankBestHignEnergyKillInGame;
    }

    @SerializedName("rank_high_energy_kill")
    public String rankHignEnergyKill;

    public void setRankHignEnergyKill(String rankHignEnergyKill) {
        this.rankHignEnergyKill = rankHignEnergyKill;
    }

    public String getRankHignEnergyKill() {
        return rankHignEnergyKill;
    }

    @SerializedName("rank_barrier")
    public String rankBarrier;

    public void setRankBarrier(String rankBarrier) {
        this.rankBarrier = rankBarrier;
    }

    public String getRankBarrier() {
        return rankBarrier;
    }

    @SerializedName("rank_best_average_energy_in_game")
    public String rankBestAverageEnergyInGame;

    public void setRankBestAverageEnergyInGame(String rankBestAverageEnergyInGame) {
        this.rankBestAverageEnergyInGame = rankBestAverageEnergyInGame;
    }

    public String getRankBestAverageEnergyInGame() {
        return rankBestAverageEnergyInGame;
    }

    @SerializedName("rank_best_melee_lastshot_in_game")
    public String rankBestMeleeLastShotInGame;

    public void setRankBestMeleeLastShotInGame(String rankBestMeleeLastShotInGame) {
        this.rankBestMeleeLastShotInGame = rankBestMeleeLastShotInGame;
    }

    public String getRankBestMeleeLastShotInGame() {
        return rankBestMeleeLastShotInGame;
    }

    @SerializedName("rank_best_onecombo")
    public String rankBestOneCombo;

    public void setRankBestOneCombo(String rankBestOneCombo) {
        this.rankBestOneCombo = rankBestOneCombo;
    }

    public String getRankBestOneCombo() {
        return rankBestOneCombo;
    }

    @SerializedName("rank_best_barrier_in_game")
    public String rankBestBarrierInGame;

    public void setRankBestBarrierInGame(String rankBestBarrierInGame) {
        this.rankBestBarrierInGame = rankBestBarrierInGame;
    }

    public String getRankBestBarrierInGame() {
        return rankBestBarrierInGame;
    }
}