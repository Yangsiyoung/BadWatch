package com.example.yangsiyoung.badwatchtest.data.heros.rank;

import com.example.yangsiyoung.badwatchtest.data.heros.common.RankCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Soldier extends RankCharacter{

    @SerializedName("rank_best_helix_rocket_kill_in_game")
    public String rankBestHelixaRoacketKillInGame;

    public void setRankBestHelixaRoacketKillInGame(String rankBestHelixaRoacketKillInGame) {
        this.rankBestHelixaRoacketKillInGame = rankBestHelixaRoacketKillInGame;
    }

    public String getRankBestHelixaRoacketKillInGame() {
        return rankBestHelixaRoacketKillInGame;
    }

    @SerializedName("rank_helix_rocket_kill")
    public String rankHelixRocketKill;

    public void setRankHelixRocketKill(String rankHelixRocketKill) {
        this.rankHelixRocketKill = rankHelixRocketKill;
    }

    public String getRankHelixRocketKill() {
        return rankHelixRocketKill;
    }

    @SerializedName("rank_tactical_visor_kill")
    public String rankTacticalVisorKill;

    public void setRankTacticalVisorKill(String rankTacticalVisorKill) {
        this.rankTacticalVisorKill = rankTacticalVisorKill;
    }

    public String getRankTacticalVisorKill() {
        return rankTacticalVisorKill;
    }

    @SerializedName("rank_best_tactical_visor_kill_in_game")
    public String rankBestTacticalVisorKillInGame;

    public void setRankBestTacticalVisorKillInGame(String rankBestTacticalVisorKillInGame) {
        this.rankBestTacticalVisorKillInGame = rankBestTacticalVisorKillInGame;
    }

    public String getRankBestTacticalVisorKillInGame() {
        return rankBestTacticalVisorKillInGame;
    }

    @SerializedName("rank_biotic_field_deployed")
    public String rankBioticFieldDeployed;

    public void setRankBioticFieldDeployed(String rankBioticFieldDeployed) {
        this.rankBioticFieldDeployed = rankBioticFieldDeployed;
    }

    public String getRankBioticFieldDeployed() {
        return rankBioticFieldDeployed;
    }

    @SerializedName("rank_biotic_field_heal")
    public String rankBioticFieldHeal;

    public void setRankBioticFieldHeal(String rankBioticFieldHeal) {
        this.rankBioticFieldHeal = rankBioticFieldHeal;
    }

    public String getRankBioticFieldHeal() {
        return rankBioticFieldHeal;
    }

    @SerializedName("rank_best_melee_lastshot_in_game")
    public String rankBestMeleeLastShotInGame;

    public void setRankBestMeleeLastShotInGame(String rankBestMeleeLastShotInGame) {
        this.rankBestMeleeLastShotInGame = rankBestMeleeLastShotInGame;
    }

    public String getRankBestMeleeLastShotInGame() {
        return rankBestMeleeLastShotInGame;
    }
}