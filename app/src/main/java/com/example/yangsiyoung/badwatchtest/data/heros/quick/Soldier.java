package com.example.yangsiyoung.badwatchtest.data.heros.quick;

import com.example.yangsiyoung.badwatchtest.data.heros.common.QuickCharacter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class Soldier extends QuickCharacter{

    @SerializedName("quick_best_helix_rocket_kill_in_game")
    public String quickBestHelixaRoacketKillInGame;

    public void setQuickBestHelixaRoacketKillInGame(String quickBestHelixaRoacketKillInGame) {
        this.quickBestHelixaRoacketKillInGame = quickBestHelixaRoacketKillInGame;
    }

    public String getQuickBestHelixaRoacketKillInGame() {
        return quickBestHelixaRoacketKillInGame;
    }

    @SerializedName("quick_helix_rocket_kill")
    public String quickHelixRocketKill;

    public void setQuickHelixRocketKill(String quickHelixRocketKill) {
        this.quickHelixRocketKill = quickHelixRocketKill;
    }

    public String getQuickHelixRocketKill() {
        return quickHelixRocketKill;
    }

    @SerializedName("quick_tactical_visor_kill")
    public String quickTacticalVisorKill;

    public void setQuickTacticalVisorKill(String quickTacticalVisorKill) {
        this.quickTacticalVisorKill = quickTacticalVisorKill;
    }

    public String getQuickTacticalVisorKill() {
        return quickTacticalVisorKill;
    }

    @SerializedName("quick_best_tactical_visor_kill_in_game")
    public String quickBestTacticalVisorKillInGame;

    public void setQuickBestTacticalVisorKillInGame(String quickBestTacticalVisorKillInGame) {
        this.quickBestTacticalVisorKillInGame = quickBestTacticalVisorKillInGame;
    }

    public String getQuickBestTacticalVisorKillInGame() {
        return quickBestTacticalVisorKillInGame;
    }

    @SerializedName("quick_biotic_field_deployed")
    public String quickBioticFieldDeployed;

    public void setQuickBioticFieldDeployed(String quickBioticFieldDeployed) {
        this.quickBioticFieldDeployed = quickBioticFieldDeployed;
    }

    public String getQuickBioticFieldDeployed() {
        return quickBioticFieldDeployed;
    }

    @SerializedName("quick_biotic_field_heal")
    public String quickBioticFieldHeal;

    public void setQuickBioticFieldHeal(String quickBioticFieldHeal) {
        this.quickBioticFieldHeal = quickBioticFieldHeal;
    }

    public String getQuickBioticFieldHeal() {
        return quickBioticFieldHeal;
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