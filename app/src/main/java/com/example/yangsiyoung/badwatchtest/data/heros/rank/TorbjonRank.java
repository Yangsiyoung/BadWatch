package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class TorbjonRank extends RankCharacter{

    @SerializedName("rank_armor_pack_created")
    public String rankArmorPackCreated;

    public void setRankArmorPackCreated(String rankArmorPackCreated) {
        this.rankArmorPackCreated = rankArmorPackCreated;
    }

    public String getRankArmorPackCreated() {
        return rankArmorPackCreated;
    }

    @SerializedName("rank_torbjon_kill")
    public String rankTorbjonKill;

    public void setRankTorbjonKill(String rankTorbjonKill) {
        this.rankTorbjonKill = rankTorbjonKill;
    }

    public String getRankTorbjonKill() {
        return rankTorbjonKill;
    }

    @SerializedName("rank_turret_kill")
    public String rankTurretKill;

    public void setRankTurretKill(String rankTurretKill) {
        this.rankTurretKill = rankTurretKill;
    }

    public String getRankTurretKill() {
        return rankTurretKill;
    }

    @SerializedName("rank_best_torbjon_kill_in_game")
    public String rankBestTorbjonKillInGame;

    public void setRankBestTorbjonKillInGame(String rankBestTorbjonKillInGame) {
        this.rankBestTorbjonKillInGame = rankBestTorbjonKillInGame;
    }

    public String getRankBestTorbjonKillInGame() {
        return rankBestTorbjonKillInGame;
    }

    @SerializedName("rank_molten_core_kill")
    public String rankMoltenCoreKill;

    public void setRankMoltenCoreKill(String rankMoltenCoreKill) {
        this.rankMoltenCoreKill = rankMoltenCoreKill;
    }

    public String getRankMoltenCoreKill() {
        return rankMoltenCoreKill;
    }

    @SerializedName("rank_best_molten_core_kill_in_game")
    public String rankBestMoltenCoreKillInGame;

    public void setRankBestMoltenCoreKillInGame(String rankBestMoltenCoreKillInGame) {
        this.rankBestMoltenCoreKillInGame = rankBestMoltenCoreKillInGame;
    }

    public String getRankBestMoltenCoreKillInGame() {
        return rankBestMoltenCoreKillInGame;
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
}