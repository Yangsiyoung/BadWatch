package com.example.yangsiyoung.badwatchtest.data.heros.user;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Yang Si Young on 2016-08-11.
 */
public class UserRankInfo implements Serializable {

    @SerializedName("user_id")
    public String userId;

    public void setUserId(String userId){
        this.userId = userId;
    }

    public String getUserId(){
        return userId;
    }

    @SerializedName("name")
    public String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @SerializedName("battletag")
    public String battleTag;

    public void setBattleTag(String battleTag){
        this.battleTag = battleTag;
    }

    public String getBattleTag(){
        return battleTag;
    }

    @SerializedName("level")
    public String level;

    public void setLevel(String level){
        this.level = level;
    }

    public String getLevel(){
        return level;
    }

    @SerializedName("avatar")
    public String avatarUrl;

    public void setAvatarUrl(String avatarUrl){
        this.avatarUrl = avatarUrl;
    }

    public String getAvatarUrl(){
        return avatarUrl;
    }

    @SerializedName("point")
    public String point;

    public void setPoint(String point){
        this.point = point;
    }

    public String getPoint(){
        return point;
    }

    @SerializedName("overwatch_id")
    public String overWatchId;

    public void setOverWatchId(String overWatchId){
        this.overWatchId = overWatchId;
    }

    public String getOverWatchId(){
        return overWatchId;
    }

    @SerializedName("rank_melee_lastshot")
    public String rankMeleeLastShot;

    public void setRankMeleeLastShot(String rankMeleeLastShot){
        this.rankMeleeLastShot = rankMeleeLastShot;
    }

    public String getRankMeleeLastShot(){
        return rankMeleeLastShot;
    }

    @SerializedName("rank_solo_kill")
    public String rankSoloKill;

    public void setRankSoloKill(String rankSoloKill){
        this.rankSoloKill = rankSoloKill;
    }

    public String getRankSoloKill(){
        return rankSoloKill;
    }

    @SerializedName("rank_mission_kill")
    public String rankMissionKill;

    public void setRankMissionKill(String rankMissionKill){
        this.rankMissionKill = rankMissionKill;
    }

    public String getRankMissionKill(){
        return rankMissionKill;
    }

    @SerializedName("rank_lastshot")
    public String rankLastShot;

    public void setRankLastShot(String rankLastShot){
        this.rankLastShot = rankLastShot;
    }

    public String getRankLastShot(){
        return rankLastShot;
    }

    @SerializedName("rank_deal")
    public String rankDeal;

    public void setRankDeal(String rankDeal){
        this.rankDeal = rankDeal;
    }

    public String getRankDeal(){
        return rankDeal;
    }

    @SerializedName("rank_kill")
    public String rankKill;

    public void setRankKill(String rankKill){
        this.rankKill = rankKill;
    }

    public String getRankKill(){
        return rankKill;
    }

    @SerializedName("rank_environment_kill")
    public String rankEnvironmentKill;

    public void setRankEnvironmentKill(String rankEnvironmentKill){
        this.rankEnvironmentKill = rankEnvironmentKill;
    }

    public String getRankEnvironmentKill(){
        return rankEnvironmentKill;
    }

    @SerializedName("rank_onecombo")
    public String rankOneCombo;

    public void setRankOneCombo(String rankOneCombo){
        this.rankOneCombo = rankOneCombo;
    }

    public String getRankOneCombo(){
        return rankOneCombo;
    }

    @SerializedName("rank_heal")
    public String rankHeal;

    public void setRankHeal(String rankHeal){
        this.rankHeal = rankHeal;
    }

    public String getRankHeal(){
        return rankHeal;
    }

    @SerializedName("rank_view_support")
    public String rankViewSupport;

    public void setRankViewSupport(String rankViewSupport){
        this.rankViewSupport = rankViewSupport;
    }

    public String getRankViewSupport(){
        return rankViewSupport;
    }

    @SerializedName("rank_destroy_teleport")
    public String rankDestroyTeleport;

    public void setRankDestroyTeleport(String rankDestroyTeleport){
        this.rankDestroyTeleport = rankDestroyTeleport;
    }

    public String getRankDestroyTeleport(){
        return rankDestroyTeleport;
    }

    @SerializedName("rank_most_kill")
    public String rankMostKill;

    public void setRankMostKill(String rankMostKill){
        this.rankMostKill = rankMostKill;
    }

    public String getRankMostKill(){
        return rankMostKill;
    }

    @SerializedName("rank_most_lastshot")
    public String rankMostLastShot;

    public void setRankMostLastShot(String rankMostLastShot){
        this.rankMostLastShot = rankMostLastShot;
    }

    public String getRankMostLastShot(){
        return rankMostLastShot;
    }

    @SerializedName("rank_most_deal")
    public String rankMostDeal;

    public void setRankMostDeal(String rankMostDeal){
        this.rankMostDeal = rankMostDeal;
    }

    public String getRankMostDeal(){
        return rankMostDeal;
    }

    @SerializedName("rank_most_heal")
    public String rankMostHeal;

    public void setRankMostHeal(String rankMostHeal){
        this.rankMostHeal = rankMostHeal;
    }

    public String getRankMostHeal(){
        return rankMostHeal;
    }

    @SerializedName("rank_best_defence_support")
    public String rankBestDefenceSupport;

    public void setRankBestDefenceSupport(String rankBestDefenceSupport){
        this.rankBestDefenceSupport = rankBestDefenceSupport;
    }

    public String getRankBestDefenceSupport(){
        return rankBestDefenceSupport;
    }

    @SerializedName("rank_best_attack_support")
    public String rankBestAttackSupport;

    public void setRankBestAttackSupport(String rankBestAttackSupport){
        this.rankBestAttackSupport = rankBestAttackSupport;
    }

    public String getRankBestAttackSupport(){
        return rankBestAttackSupport;
    }

    @SerializedName("rank_most_mission_kill")
    public String rankMostMissionKill;

    public void setRankMostMissionKill(String rankMostMissionKill){
        this.rankMostMissionKill = rankMostMissionKill;
    }

    public String getRankMostMissionKill(){
        return rankMostMissionKill;
    }

    @SerializedName("rank_most_mission_time")
    public String rankMostMissionTime;

    public void setRankMostMissionTime(String rankMostMissionTime){
        this.rankMostMissionTime = rankMostMissionTime;
    }

    public String getRankMostMissionTime(){
        return rankMostMissionTime;
    }

    @SerializedName("rank_most_onecombo")
    public String rankMostOneCombo;

    public void setRankMostOneCombo(String rankMostOneCombo){
        this.rankMostOneCombo = rankMostOneCombo;
    }

    public String getRankMostOneCombo(){
        return rankMostOneCombo;
    }

    @SerializedName("rank_most_solo_kill")
    public String rankMostSoloKill;

    public void setRankMostSoloKill(String rankMostSoloKill){
        this.rankMostSoloKill = rankMostSoloKill;
    }

    public String getRankMostSoloKill(){
        return rankMostSoloKill;
    }

    @SerializedName("rank_most_flood_time")
    public String rankMostFloodTime;

    public void setRankMostFloodTime(String rankMostFloodTime){
        this.rankMostFloodTime = rankMostFloodTime;
    }

    public String getRankMostFloodTime(){
        return rankMostFloodTime;
    }

    @SerializedName("rank_death")
    public String rankDeath;

    public void setRankDeath(String rankDeath){
        this.rankDeath = rankDeath;
    }

    public String getRankDeath(){
        return rankDeath;
    }

    @SerializedName("rank_environment_death")
    public String rankEnvironmentDeath;

    public void setRankEnvironmentDeath(String rankEnvironmentDeath){
        this.rankEnvironmentDeath = rankEnvironmentDeath;
    }

    public String getRankEnvironmentDeath(){
        return rankEnvironmentDeath;
    }

    @SerializedName("rank_card")
    public String rankCard;

    public void setRankCard(String rankCard){
        this.rankCard = rankCard;
    }

    public String getRankCard(){
        return rankCard;
    }

    @SerializedName("rank_gold_medal")
    public String rankGoldMedal;

    public void setRankGoldMedal(String rankGoldMedal){
        this.rankGoldMedal = rankGoldMedal;
    }

    public String getRankGoldMedal(){
        return rankGoldMedal;
    }

    @SerializedName("rank_silver_medal")
    public String rankSilverMedal;

    public void setRankSilverMedal(String rankSilverMedal){
        this.rankSilverMedal = rankSilverMedal;
    }

    public String getRankSilverMedal(){
        return rankSilverMedal;
    }

    @SerializedName("rank_bronze_medal")
    public String rankBronzeMedal;

    public void setRankBronzeMedal(String rankBronzeMedal){
        this.rankBronzeMedal = rankBronzeMedal;
    }

    public String getRankBronzeMedal(){
        return rankBronzeMedal;
    }

    @SerializedName("rank_win")
    public String rankWin;

    public void setRankWin(String rankWin){
        this.rankWin = rankWin;
    }

    public String getRankWin(){
        return rankWin;
    }

    @SerializedName("rank_game_count")
    public String rankGameCount;

    public void setRankGameCount(String rankGameCount){
        this.rankGameCount = rankGameCount;
    }

    public String getRankGameCount(){
        return rankGameCount;
    }

    @SerializedName("rank_flood_time")
    public String rankFloodTime;

    public void setRankFloodTime(String rankFloodTime){
        this.rankFloodTime = rankFloodTime;
    }

    public String getRankFloodTime(){
        return rankFloodTime;
    }

    @SerializedName("rank_mission_time")
    public String rankMissionTime;

    public void setRankMissionTime(String rankMissionTime){
        this.rankMissionTime = rankMissionTime;
    }

    public String getRankMissionTime(){
        return rankMissionTime;
    }

    @SerializedName("rank_playtime")
    public String rankPlayTime;

    public void setRankPlayTime(String rankPlayTime){
        this.rankPlayTime = rankPlayTime;
    }

    public String getRankPlayTime(){
        return rankPlayTime;
    }

    @SerializedName("rank_most_melee_lastshot")
    public String rankMostMeleeLastShot;

    public void setRankMostMeleeLastShot(String rankMostMeleeLastShot){
        this.rankMostMeleeLastShot = rankMostMeleeLastShot;
    }

    public String getRankMostMeleeLastShot(){
        return rankMostMeleeLastShot;
    }

    @SerializedName("rank_defence_support")
    public String rankDefenceSupport;

    public void setRankDefenceSupport(String rankDefenceSupport){
        this.rankDefenceSupport = rankDefenceSupport;
    }

    public String getRankDefenceSupport(){
        return rankDefenceSupport;
    }

    @SerializedName("rank_attack_support")
    public String rankAttackSupport;

    public void setRankAttackSupport(String rankAttackSupport){
        this.rankAttackSupport = rankAttackSupport;
    }

    public String getRankAttackSupport(){
        return rankAttackSupport;
    }

    @SerializedName("reputation")
    public String rankReputation;

    public void setRankReputation(String rankReputation){
        this.rankReputation = rankReputation;
    }

    public String getRankReputation(){
        return rankReputation;
    }

    @SerializedName("rank_reaper_kill")
    public String rankReaperkill;

    public void setRankReaperkill(String rankReaperkill){
        this.rankReaperkill = rankReaperkill;
    }

    public String getRankReaperkill(){
        return rankReaperkill;
    }

    @SerializedName("rank_reaper_death")
    public String rankReaperDeath;

    public void setRankReaperDeath(String rankReaperDeath){
        this.rankReaperDeath = rankReaperDeath;
    }

    public String getRankReaperDeath(){
        return rankReaperDeath;
    }

    @SerializedName("rank_reaper_win")
    public String rankReaperWin;

    public void setRankReaperWin(String rankReaperWin){
        this.rankReaperWin = rankReaperWin;
    }

    public String getRankReaperWin(){
        return rankReaperWin;
    }

    @SerializedName("rank_reaper_game_count")
    public String rankReaperGameCount;

    public void setRankReaperGameCount(String rankReaperGameCount){
        this.rankReaperGameCount = rankReaperGameCount;
    }

    public String getRankReaperGameCount(){
        return rankReaperGameCount;
    }

    @SerializedName("rank_reaper_playtime")
    public String rankReaperPlayTime;

    public void setRankReaperPlayTime(String rankReaperPlayTime){
        this.rankReaperPlayTime = rankReaperPlayTime;
    }

    public String getRankReaperPlayTime(){
        return rankReaperPlayTime;
    }

    @SerializedName("rank_tracer_kill")
    public String rankTracerKill;

    public void setRankTracerKill(String rankTracerKill){
        this.rankTracerKill = rankTracerKill;
    }

    public String getRankTracerKill(){
        return rankTracerKill;
    }

    @SerializedName("rank_tracer_death")
    public String rankTracerDeath;

    public void setRankTracerDeath(String rankTracerDeath){
        this.rankTracerDeath = rankTracerDeath;
    }

    public String getRankTracerDeath(){
        return rankTracerDeath;
    }

    @SerializedName("rank_tracer_win")
    public String rankTracerWin;

    public void setRankTracerWin(String rankTracerWin){
        this.rankTracerWin = rankTracerWin;
    }

    public String getRankTracerWin(){
        return rankTracerWin;
    }

    @SerializedName("rank_tracer_game_count")
    public String rankTracerGameCount;

    public void setRankTracerGameCount(String rankTracerGameCount){
        this.rankTracerGameCount = rankTracerGameCount;
    }

    public String getRankTracerGameCount(){
        return rankTracerGameCount;
    }

    @SerializedName("rank_tracer_playtime")
    public String rankTracerPlayTime;

    public void setRankTracerPlayTime(String rankTracerPlayTime){
        this.rankTracerPlayTime = rankTracerPlayTime;
    }

    public String getRankTracerPlayTime(){
        return rankTracerPlayTime;
    }

    @SerializedName("rank_mercy_kill")
    public String rankMercyKill;

    public void setRankMercyKill(String rankMercyKill){
        this.rankMercyKill = rankMercyKill;
    }

    public String getRankMercyKill(){
        return rankMercyKill;
    }

    @SerializedName("rank_mercy_death")
    public String rankMercyDeath;

    public void setRankMercyDeath(String rankMercyDeath){
        this.rankMercyDeath = rankMercyDeath;
    }

    public String getRankMercyDeath(){
        return rankMercyDeath;
    }

    @SerializedName("rank_mercy_win")
    public String rankMercyWin;

    public void setRankMercyWin(String rankMercyWin){
        this.rankMercyWin = rankMercyWin;
    }

    public String getRankMercyWin(){
        return rankMercyWin;
    }

    @SerializedName("rank_mercy_game_count")
    public String rankMercyGameCount;

    public void setRankMercyGameCount(String rankMercyGameCount){
        this.rankMercyGameCount = rankMercyGameCount;
    }

    public String getRankMercyGameCount(){
        return rankMercyGameCount;
    }
    @SerializedName("rank_mercy_playtime")
    public String rankMercyPlayTime;

    public void setRankMercyPlayTime(String rankMercyPlayTime){
        this.rankMercyPlayTime = rankMercyPlayTime;
    }

    public String getRankMercyPlayTime(){
        return rankMercyPlayTime;
    }

    @SerializedName("rank_hanzo_kill")
    public String rankHanzoKill;

    public void setRankHanzoKill(String rankHanzoKill){
        this.rankHanzoKill = rankHanzoKill;
    }

    public String getRankHanzoKill(){
        return rankHanzoKill;
    }

    @SerializedName("rank_hanzo_death")
    public String rankHanzoDeath;

    public void setRankHanzoDeath(String rankHanzoDeath){
        this.rankHanzoDeath = rankHanzoDeath;
    }

    public String getRankHanzoDeath(){
        return rankHanzoDeath;
    }

    @SerializedName("rank_hanzo_win")
    public String rankHanzoWin;

    public void setRankHanzoWin(String rankHanzoWin){
        this.rankHanzoWin = rankHanzoWin;
    }

    public String getRankHanzoWin(){
        return rankHanzoWin;
    }

    @SerializedName("rank_hanzo_game_count")
    public String rankHanzoGameCount;

    public void setRankHanzoGameCount(String rankHanzoGameCount){
        this.rankHanzoGameCount = rankHanzoGameCount;
    }

    public String getRankHanzoGameCount(){
        return rankHanzoGameCount;
    }

    @SerializedName("rank_hanzo_playtime")
    public String rankHanzoPlayTime;

    public void setRankHanzoPlayTime(String rankHanzoPlayTime){
        this.rankHanzoPlayTime = rankHanzoPlayTime;
    }

    public String getRankHanzoPlayTime(){
        return rankHanzoPlayTime;
    }

    @SerializedName("rank_torbjon_kill")
    public String rankTorbjonKill;

    public void setRankTorbjonKill(String rankTorbjonKill){
        this.rankTorbjonKill = rankTorbjonKill;
    }

    public String getRankTorbjonKill(){
        return rankTorbjonKill;
    }

    @SerializedName("rank_torbjon_death")
    public String rankTorbjonDeath;

    public void setRankTorbjonDeath(String rankTorbjonDeath){
        this.rankTorbjonDeath = rankTorbjonDeath;
    }

    public String getRankTorbjonDeath(){
        return rankTorbjonDeath;
    }

    @SerializedName("rank_torbjon_win")
    public String rankTorbjonWin;

    public void setRankTorbjonWin(String rankTorbjonWin){
        this.rankTorbjonWin = rankTorbjonWin;
    }

    public String getRankTorbjonWin(){
        return rankTorbjonWin;
    }

    @SerializedName("rank_torbjon_game_count")
    public String rankTorbjonGameCount;

    public void setRankTorbjonGameCount(String rankTorbjonGameCount){
        this.rankTorbjonGameCount = rankTorbjonGameCount;
    }

    public String getRankTorbjonGameCount(){
        return rankTorbjonGameCount;
    }

    @SerializedName("rank_torbjon_playtime")
    public String rankTorbjonPlayTime;

    public void setRankTorbjonPlayTime(String rankTorbjonPlayTime){
        this.rankTorbjonPlayTime = rankTorbjonPlayTime;
    }

    public String getRankTorbjonPlayTime(){
        return rankTorbjonPlayTime;
    }

    @SerializedName("rank_reinhardt_kill")
    public String rankReinhardtKill;

    public void setRankReinhardtKill(String rankReinhardtKill){
        this.rankReinhardtKill = rankReinhardtKill;
    }

    public String getRankReinhardtKill(){
        return rankReinhardtKill;
    }

    @SerializedName("rank_reinhardt_death")
    public String rankReinhardtDeath;

    public void setRankReinhardtDeath(String rankReinhardtDeath){
        this.rankReinhardtDeath = rankReinhardtDeath;
    }

    public String getRankReinhardtDeath(){
        return rankReinhardtDeath;
    }

    @SerializedName("rank_reinhardt_win")
    public String rankReinhardtWin;

    public void setRankReinhardtWin(String rankReinhardtWin){
        this.rankReinhardtWin = rankReinhardtWin;
    }

    public String getRankReinhardtWin(){
        return rankReinhardtWin;
    }

    @SerializedName("rank_reinhardt_game_count")
    public String rankReinhardtGameCount;

    public void setRankReinhardtGameCount(String rankReinhardtGameCount){
        this.rankReinhardtGameCount = rankReinhardtGameCount;
    }

    public String getRankReinhardtGameCount(){
        return rankReinhardtGameCount;
    }

    @SerializedName("rank_reinhardt_playtime")
    public String rankReinhardtPlayTime;

    public void setRankReinhardtPlayTime(String rankReinhardtPlayTime){
        this.rankReinhardtPlayTime = rankReinhardtPlayTime;
    }

    public String getRankReinhardtPlayTime(){
        return rankReinhardtPlayTime;
    }

    @SerializedName("rank_pharah_kill")
    public String rankPharahKill;

    public void setRankPharahKill(String rankPharahKill){
        this.rankPharahKill = rankPharahKill;
    }

    public String getRankPharahKill(){
        return rankPharahKill;
    }

    @SerializedName("rank_pharah_death")
    public String rankPharahDeath;

    public void setRankPharahDeath(String rankPharahDeath){
        this.rankPharahDeath = rankPharahDeath;
    }

    public String getRankPharahDeath(){
        return rankPharahDeath;
    }

    @SerializedName("rank_pharah_win")
    public String rankPharahWin;

    public void setRankPharahWin(String rankPharahWin){
        this.rankPharahWin = rankPharahWin;
    }

    public String getRankPharahWin(){
        return rankPharahWin;
    }

    @SerializedName("rank_pharah_game_count")
    public String rankPharahGameCount;

    public void setRankPharahGameCount(String rankPharahGameCount){
        this.rankPharahGameCount = rankPharahGameCount;
    }

    public String getRankPharahGameCount(){
        return rankPharahGameCount;
    }

    @SerializedName("rank_pharah_playtime")
    public String rankPharahPlayTime;

    public void setRankPharahPlayTime(String rankPharahPlayTime){
        this.rankPharahPlayTime = rankPharahPlayTime;
    }

    public String getRankPharahPlayTimeo(){
        return rankPharahPlayTime;
    }

    @SerializedName("rank_winston_kill")
    public String rankWinstonKill;

    public void setRankWinstonKill(String rankWinstonKill){
        this.rankWinstonKill = rankWinstonKill;
    }

    public String getRankWinstonKill(){
        return rankWinstonKill;
    }

    @SerializedName("rank_winston_death")
    public String rankWinstonDeath;

    public void setRankWinstonDeath(String rankWinstonDeath){
        this.rankWinstonDeath = rankWinstonDeath;
    }

    public String getRankWinstonDeath(){
        return rankWinstonDeath;
    }

    @SerializedName("rank_winston_win")
    public String rankWinstonWin;

    public void setRankWinstonWin(String rankWinstonWin){
        this.rankWinstonWin = rankWinstonWin;
    }

    public String getRankWinstonWin(){
        return rankWinstonWin;
    }

    @SerializedName("rank_winston_game_count")
    public String rankWinstonGameCount;

    public void setRankWinstonGameCount(String rankWinstonGameCount){
        this.rankWinstonGameCount = rankWinstonGameCount;
    }

    public String getRankWinstonGameCount(){
        return rankWinstonGameCount;
    }

    @SerializedName("rank_winston_playtime")
    public String rankWinstonPlayTime;

    public void setRankWinstonPlayTime(String rankWinstonPlayTime){
        this.rankWinstonPlayTime = rankWinstonPlayTime;
    }

    public String getRankWinstonPlayTime(){
        return rankWinstonPlayTime;
    }

    @SerializedName("rank_widowmaker_kill")
    public String rankWidowmakerKill;

    public void setRankWidowmakerKill(String rankWidowmakerKill){
        this.rankWidowmakerKill = rankWidowmakerKill;
    }

    public String getRankWidowmakerKill(){
        return rankWidowmakerKill;
    }

    @SerializedName("rank_widowmaker_death")
    public String rankWidowmakerDeath;

    public void setRankWidowmakerDeath(String rankWidowmakerDeath){
        this.rankWidowmakerDeath = rankWidowmakerDeath;
    }

    public String getRankWidowmakerDeath(){
        return rankWidowmakerDeath;
    }

    @SerializedName("rank_widowmaker_win")
    public String rankWidowmakerWin;

    public void setRankWidowmakerWin(String rankWidowmakerWin){
        this.rankWidowmakerWin = rankWidowmakerWin;
    }

    public String getRankWidowmakerWin(){
        return rankWidowmakerWin;
    }

    @SerializedName("rank_widowmaker_game_count")
    public String rankWidowmakerGameCount;

    public void setRankWidowmakerGameCount(String rankWidowmakerGameCount){
        this.rankWidowmakerGameCount = rankWidowmakerGameCount;
    }

    public String getRankWidowmakerGameCount(){
        return rankWidowmakerGameCount;
    }

    @SerializedName("rank_widowmaker_playtime")
    public String rankWidowmakerPlayTime;

    public void setRankWidowmakerPlayTime(String rankWidowmakerPlayTime){
        this.rankWidowmakerPlayTime = rankWidowmakerPlayTime;
    }

    public String getRankWidowmakerPlayTime(){
        return rankWidowmakerPlayTime;
    }

    @SerializedName("rank_bastion_kill")
    public String rankBastionKill;

    public void setRankBastionKill(String rankBastionKill){
        this.rankBastionKill = rankBastionKill;
    }

    public String getRankBastionKill(){
        return rankBastionKill;
    }

    @SerializedName("rank_bastion_death")
    public String rankBastionDeath;

    public void setRankBastionDeath(String rankBastionDeath){
        this.rankBastionDeath = rankBastionDeath;
    }

    public String getRankBastionDeath(){
        return rankBastionDeath;
    }

    @SerializedName("rank_bastion_win")
    public String rankBastionWin;

    public void setRankBastionWin(String rankBastionWin){
        this.rankBastionWin = rankBastionWin;
    }

    public String getRankBastionWin(){
        return rankBastionWin;
    }

    @SerializedName("rank_bastion_game_count")
    public String rankBastionGameCount;

    public void setRankBastionGameCount(String rankBastionGameCount){
        this.rankBastionGameCount = rankBastionGameCount;
    }

    public String getRankBastionGameCount(){
        return rankBastionGameCount;
    }

    @SerializedName("rank_bastion_playtime")
    public String rankBastionPlayTime;

    public void setRankBastionPlayTime(String rankBastionPlayTime){
        this.rankBastionPlayTime = rankBastionPlayTime;
    }

    public String getRankBastionPlayTime(){
        return rankBastionPlayTime;
    }

    @SerializedName("rank_symmetra_kill")
    public String rankSymmetraKill;

    public void setRankSymmetraKill(String rankSymmetraKill){
        this.rankSymmetraKill = rankSymmetraKill;
    }

    public String getRankSymmetraKill(){
        return rankSymmetraKill;
    }

    @SerializedName("rank_symmetra_death")
    public String rankSymmetraDeath;

    public void setRankSymmetraDeath(String rankSymmetraDeath){
        this.rankSymmetraDeath = rankSymmetraDeath;
    }

    public String getRankSymmetraDeath(){
        return rankSymmetraDeath;
    }

    @SerializedName("rank_symmetra_win")
    public String rankSymmetraWin;

    public void setRankSymmetraWin(String rankSymmetraWin){
        this.rankSymmetraWin = rankSymmetraWin;
    }

    public String getRankSymmetraWin(){
        return rankSymmetraWin;
    }

    @SerializedName("rank_symmetra_game_count")
    public String rankSymmetraGameCount;

    public void setRankSymmetraGameCount(String rankSymmetraGameCount){
        this.rankSymmetraGameCount = rankSymmetraGameCount;
    }

    public String getRankSymmetraGameCount(){
        return rankSymmetraGameCount;
    }

    @SerializedName("rank_symmetra_playtime")
    public String rankSymmetraPlayTime;

    public void setRankSymmetraPlayTime(String rankSymmetraPlayTime){
        this.rankSymmetraPlayTime = rankSymmetraPlayTime;
    }

    public String getRankSymmetraPlayTime(){
        return rankSymmetraPlayTime;
    }

    @SerializedName("rank_zenyatta_kill")
    public String rankZenyattaKill;

    public void setRankZenyattaKill(String rankZenyattaKill){
        this.rankZenyattaKill = rankZenyattaKill;
    }

    public String getRankZenyattaKill(){
        return rankZenyattaKill;
    }

    @SerializedName("rank_zenyatta_death")
    public String rankZenyattaDeath;

    public void setRankZenyattaDeath(String rankZenyattaDeath){
        this.rankZenyattaDeath = rankZenyattaDeath;
    }

    public String getRankZenyattaDeath(){
        return rankZenyattaDeath;
    }

    @SerializedName("rank_zenyatta_win")
    public String rankZenyattaWin;

    public void setRankZenyattaWin(String rankZenyattaWin){
        this.rankZenyattaWin = rankZenyattaWin;
    }

    public String getRankZenyattaWin(){
        return rankZenyattaWin;
    }

    @SerializedName("rank_zenyatta_game_count")
    public String rankZenyattaGameCount;

    public void setRankZenyattaGameCount(String rankZenyattaGameCount){
        this.rankZenyattaGameCount = rankZenyattaGameCount;
    }

    public String getRankZenyattaGameCount(){
        return rankZenyattaGameCount;
    }

    @SerializedName("rank_zenyatta_playtime")
    public String rankZenyattaPlayTime;

    public void setRankZenyattaPlayTime(String rankZenyattaPlayTime){
        this.rankZenyattaPlayTime = rankZenyattaPlayTime;
    }

    public String getRankZenyattaPlayTime(){
        return rankZenyattaPlayTime;
    }

    @SerializedName("rank_genji_kill")
    public String rankGenjiKill;

    public void setRankGenjiKill(String rankGenjiKill){
        this.rankGenjiKill = rankGenjiKill;
    }

    public String getRankGenjiKill(){
        return rankGenjiKill;
    }

    @SerializedName("rank_genji_death")
    public String rankGenjiDeath;

    public void setRankGenjiDeath(String rankGenjiDeath){
        this.rankGenjiDeath = rankGenjiDeath;
    }

    public String getRankGenjiDeath(){
        return rankGenjiDeath;
    }

    @SerializedName("rank_genji_win")
    public String rankGenjiWin;

    public void setRankGenjiWin(String rankGenjiWin){
        this.rankGenjiWin = rankGenjiWin;
    }

    public String getRankGenjiWin(){
        return rankGenjiWin;
    }

    @SerializedName("rank_genji_game_count")
    public String rankGenjiGameCount;

    public void setRankGenjiGameCount(String rankGenjiGameCount){
        this.rankGenjiGameCount = rankGenjiGameCount;
    }

    public String getRankGenjiGameCount(){
        return rankGenjiGameCount;
    }

    @SerializedName("rank_genji_playtime")
    public String rankGenjiPlayTime;

    public void setRankGenjiPlayTime(String rankGenjiPlayTime){
        this.rankGenjiPlayTime = rankGenjiPlayTime;
    }

    public String getRankGenjiPlayTime(){
        return rankGenjiPlayTime;
    }

    @SerializedName("rank_roadhog_kill")
    public String rankRoadhogKill;

    public void setRankRoadhogKill(String rankRoadhogKill){
        this.rankRoadhogKill = rankRoadhogKill;
    }

    public String getRankRoadhogKill(){
        return rankRoadhogKill;
    }

    @SerializedName("rank_roadhog_death")
    public String rankRoadhogDeath;

    public void setRankRoadhogDeath(String rankRoadhogDeath){
        this.rankRoadhogDeath = rankRoadhogDeath;
    }

    public String getRankRoadhogDeath(){
        return rankRoadhogDeath;
    }

    @SerializedName("rank_roadhog_win")
    public String rankRoadhogWin;

    public void setRankRoadhogWin(String rankRoadhogWin){
        this.rankRoadhogWin = rankRoadhogWin;
    }

    public String getRankRoadhogWin(){
        return rankRoadhogWin;
    }

    @SerializedName("rank_roadhog_game_count")
    public String rankRoadhogGameCount;

    public void setRankRoadhogGameCount(String rankRoadhogGameCount){
        this.rankRoadhogGameCount = rankRoadhogGameCount;
    }

    public String getRankRoadhogGameCount(){
        return rankRoadhogGameCount;
    }

    @SerializedName("rank_roadhog_playtime")
    public String rankRoadhogPlayTime;

    public void setRankRoadhogPlayTime(String rankRoadhogPlayTime){
        this.rankRoadhogPlayTime = rankRoadhogPlayTime;
    }

    public String getRankRoadhogPlayTime(){
        return rankRoadhogPlayTime;
    }

    @SerializedName("rank_mccree_kill")
    public String rankMccreeKill;

    public void setRankMccreeKill(String rankMccreeKill){
        this.rankMccreeKill = rankMccreeKill;
    }

    public String getRankMccreeKill(){
        return rankMccreeKill;
    }

    @SerializedName("rank_mccree_death")
    public String rankMccreeDeath;

    public void setRankMccreeDeath(String rankMccreeDeath){
        this.rankMccreeDeath = rankMccreeDeath;
    }

    public String getRankMccreeDeath(){
        return rankMccreeDeath;
    }

    @SerializedName("rank_mccree_win")
    public String rankMccreeWin;

    public void setRankMccreeWin(String rankMccreeWin){
        this.rankMccreeWin = rankMccreeWin;
    }

    public String getRankMccreeWin(){
        return rankMccreeWin;
    }

    @SerializedName("rank_mccree_game_count")
    public String rankMccreeGameCount;

    public void setRankMccreeGameCount(String rankMccreeGameCount){
        this.rankMccreeGameCount = rankMccreeGameCount;
    }

    public String getRankMccreeGameCount(){
        return rankMccreeGameCount;
    }

    @SerializedName("rank_mccree_playtime")
    public String rankMccreePlayTime;

    public void setRankMccreePlayTime(String rankMccreePlayTime){
        this.rankMccreePlayTime = rankMccreePlayTime;
    }

    public String getRankMccreePlayTime(){
        return rankMccreePlayTime;
    }

    @SerializedName("rank_junkrat_kill")
    public String rankJunkratKill;

    public void setRankJunkratKill(String rankJunkratKill){
        this.rankJunkratKill = rankJunkratKill;
    }

    public String getRankJunkratKill(){
        return rankJunkratKill;
    }

    @SerializedName("rank_junkrat_death")
    public String rankJunkratDeath;

    public void setRankJunkratDeath(String rankJunkratDeath){
        this.rankJunkratDeath = rankJunkratDeath;
    }

    public String getRankJunkratDeath(){
        return rankJunkratDeath;
    }

    @SerializedName("rank_junkrat_win")
    public String rankJunkratWin;

    public void setRankJunkratWin(String rankJunkratWin){
        this.rankJunkratWin = rankJunkratWin;
    }

    public String getRankJunkratWin(){
        return rankJunkratWin;
    }

    @SerializedName("rank_junkrat_game_count")
    public String rankJunkratGameCount;

    public void setRankJunkratGameCount(String rankJunkratGameCount){
        this.rankJunkratGameCount = rankJunkratGameCount;
    }

    public String getRankJunkratGameCount(){
        return rankJunkratGameCount;
    }

    @SerializedName("rank_junkrat_playtime")
    public String rankJunkratPlayTime;

    public void setRankJunkratPlayTime(String rankJunkratPlayTime){
        this.rankJunkratPlayTime = rankJunkratPlayTime;
    }

    public String getRankJunkratPlayTime(){
        return rankJunkratPlayTime;
    }

    @SerializedName("rank_zarya_kill")
    public String rankZaryaKill;

    public void setRankZaryaKill(String rankZaryaKill){
        this.rankZaryaKill = rankZaryaKill;
    }

    public String getRankZaryaKill(){
        return rankZaryaKill;
    }

    @SerializedName("rank_zarya_death")
    public String rankZaryaDeath;

    public void setRankZaryaDeath(String rankZaryaDeath){
        this.rankZaryaDeath = rankZaryaDeath;
    }

    public String getRankZaryaDeath(){
        return rankZaryaDeath;
    }

    @SerializedName("rank_zarya_win")
    public String rankZaryaWin;

    public void setRankZaryaWin(String rankZaryaWin){
        this.rankZaryaWin = rankZaryaWin;
    }

    public String getRankZaryaWin(){
        return rankZaryaWin;
    }

    @SerializedName("rank_zarya_game_count")
    public String rankZaryaGameCount;

    public void setRankZaryaGameCount(String rankZaryaGameCount){
        this.rankZaryaGameCount = rankZaryaGameCount;
    }

    public String getRankZaryaGameCount(){
        return rankZaryaGameCount;
    }

    @SerializedName("rank_zarya_playtime")
    public String rankZaryaPlayTime;

    public void setRankZaryaPlayTime(String rankZaryaPlayTime){
        this.rankZaryaPlayTime = rankZaryaPlayTime;
    }

    public String getRankZaryaPlayTime(){
        return rankZaryaPlayTime;
    }

    @SerializedName("rank_soldier_kill")
    public String rankSoldierKill;

    public void setRankSoldierKill(String rankSoldierKill){
        this.rankSoldierKill = rankSoldierKill;
    }

    public String getRankSoldierKill(){
        return rankSoldierKill;
    }

    @SerializedName("rank_soldier_death")
    public String rankSoldierDeath;

    public void setRankSoldierDeath(String rankSoldierDeath){
        this.rankSoldierDeath = rankSoldierDeath;
    }

    public String getRankSoldierDeath(){
        return rankSoldierDeath;
    }

    @SerializedName("rank_soldier_win")
    public String rankSoldierWin;

    public void setRankSoldierWin(String rankSoldierWin){
        this.rankSoldierWin = rankSoldierWin;
    }

    public String getRankSoldierWin(){
        return rankSoldierWin;
    }

    @SerializedName("rank_soldier_game_count")
    public String rankSoldierGameCount;

    public void setRankSoldierGameCount(String rankSoldierGameCount){
        this.rankSoldierGameCount = rankSoldierGameCount;
    }

    public String getRankSoldierGameCount(){
        return rankSoldierGameCount;
    }

    @SerializedName("rank_soldier_playtime")
    public String rankSoldierPlayTime;

    public void setRankSoldierPlayTime(String rankSoldierPlayTime){
        this.rankSoldierPlayTime = rankSoldierPlayTime;
    }

    public String getRankSoldierPlayTime(){
        return rankSoldierPlayTime;
    }

    @SerializedName("rank_lucio_kill")
    public String rankLucioKill;

    public void setRankLucioKill(String rankLucioKill){
        this.rankLucioKill = rankLucioKill;
    }

    public String getRankLucioKill(){
        return rankLucioKill;
    }

    @SerializedName("rank_lucio_death")
    public String rankLucioDeath;

    public void setRankLucioDeath(String rankLucioDeath){
        this.rankLucioDeath = rankLucioDeath;
    }

    public String getRankLucioDeath(){
        return rankLucioDeath;
    }

    @SerializedName("rank_lucio_win")
    public String rankLucioWin;

    public void setRankLucioWin(String rankLucioWin){
        this.rankLucioWin = rankLucioWin;
    }

    public String getRankLucioWin(){
        return rankLucioWin;
    }

    @SerializedName("rank_lucio_game_count")
    public String rankLucioGameCount;

    public void setRankLucioGameCount(String rankLucioGameCount){
        this.rankLucioGameCount = rankLucioGameCount;
    }

    public String getRankLucioGameCount(){
        return rankLucioGameCount;
    }

    @SerializedName("rank_lucio_playtime")
    public String rankLucioPlayTime;

    public void setRankLucioPlayTime(String rankLucioPlayTime){
        this.rankLucioPlayTime = rankLucioPlayTime;
    }

    public String getRankLucioPlayTime(){
        return rankLucioPlayTime;
    }

    @SerializedName("rank_dva_kill")
    public String rankDvaKill;

    public void setRankDvaKill(String rankDvaKill){
        this.rankDvaKill = rankDvaKill;
    }

    public String getRankDvaKill(){
        return rankDvaKill;
    }

    @SerializedName("rank_dva_death")
    public String rankDvaDeath;

    public void setRankDvaDeath(String rankDvaDeath){
        this.rankDvaDeath = rankDvaDeath;
    }

    public String getRankDvaDeath(){
        return rankDvaDeath;
    }

    @SerializedName("rank_dva_win")
    public String rankDvaWin;

    public void setRankDvaWin(String rankDvaWin){
        this.rankDvaWin = rankDvaWin;
    }

    public String getRankDvaWin(){
        return rankDvaWin;
    }

    @SerializedName("rank_dva_game_count")
    public String rankDvaGameCount;

    public void setRankDvaGameCount(String rankDvaGameCount){
        this.rankDvaGameCount = rankDvaGameCount;
    }

    public String getRankDvaGameCount(){
        return rankDvaGameCount;
    }

    @SerializedName("rank_dva_playtime")
    public String rankDvaPlayTime;

    public void setRankDvaPlayTime(String rankDvaPlayTime){
        this.rankDvaPlayTime = rankDvaPlayTime;
    }

    public String getRankDvaPlayTime(){
        return rankDvaPlayTime;
    }

    @SerializedName("rank_mei_kill")
    public String rankMeiKill;

    public void setRankMeiKill(String rankMeiKill){
        this.rankMeiKill = rankMeiKill;
    }

    public String getRankMeiKill(){
        return rankMeiKill;
    }

    @SerializedName("rank_mei_death")
    public String rankMeiDeath;

    public void setRankMeiDeath(String rankMeiDeath){
        this.rankMeiDeath = rankMeiDeath;
    }

    public String getRankMeiDeath(){
        return rankMeiDeath;
    }

    @SerializedName("rank_mei_win")
    public String rankMeiWin;

    public void setRankMeiWin(String rankMeiWin){
        this.rankMeiWin = rankMeiWin;
    }

    public String getRankMeiWin(){
        return rankMeiWin;
    }

    @SerializedName("rank_mei_game_count")
    public String rankMeiGameCount;

    public void setRankMeiGameCount(String rankMeiGameCount){
        this.rankMeiGameCount = rankMeiGameCount;
    }

    public String getRankMeiGameCount(){
        return rankMeiGameCount;
    }

    @SerializedName("rank_mei_playtime")
    public String rankMeiPlayTime;

    public void setRankMeiPlayTime(String rankMeiPlayTime){
        this.rankMeiPlayTime = rankMeiPlayTime;
    }

    public String getRankMeiPlayTime(){
        return rankMeiPlayTime;
    }

    @SerializedName("rank_ana_kill")
    public String rankAnaKill;

    public void setRankAnaKill(String rankAnaKill){
        this.rankAnaKill = rankAnaKill;
    }

    public String getRankAnaKill(){
        return rankAnaKill;
    }

    @SerializedName("rank_ana_death")
    public String rankAnaDeath;

    public void setRankAnaDeath(String rankAnaDeath){
        this.rankAnaDeath = rankAnaDeath;
    }

    public String getRankAnaDeath(){
        return rankAnaDeath;
    }

    @SerializedName("rank_ana_win")
    public String rankAnaWin;

    public void setRankAnaWin(String rankAnaWin){
        this.rankAnaWin = rankAnaWin;
    }

    public String getRankAnaWin(){
        return rankAnaWin;
    }

    @SerializedName("rank_ana_game_count")
    public String rankAnaGameCount;

    public void setRankAnaGameCount(String rankAnaGameCount){
        this.rankAnaGameCount = rankAnaGameCount;
    }

    public String getRankAnaGameCount(){
        return rankAnaGameCount;
    }

    @SerializedName("rank_ana_playtime")
    public String rankAnaPlayTime;

    public void setRankAnaPlayTime(String rankAnaPlayTime){
        this.rankAnaPlayTime = rankAnaPlayTime;
    }

    public String getRankAnaPlayTime(){
        return rankAnaPlayTime;
    }
}
