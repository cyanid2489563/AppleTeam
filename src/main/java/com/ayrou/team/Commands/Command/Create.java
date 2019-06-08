package com.ayrou.team.Commands.Command;

import com.ayrou.team.Commands.SubCommand;
import com.ayrou.team.Main;
import com.ayrou.team.Team.TeamManager;
import org.bukkit.entity.Player;

public class Create extends SubCommand {

    @Override
    public void onCommand(Player player, String[] args) {
        if (args.length > 1) {
            if (!Main.getTeamManager().hasTeam(player.getUniqueId())) {
                new TeamManager.Builder()
                        .setName(args[1])
                        .setLeader(player.getUniqueId())
                        .create();
            }
            else player.sendMessage("你已有隊伍");
        }
        else player.sendMessage("請輸入隊伍名稱");

    }

    @Override
    public String name() {
        return "create";
    }

    @Override
    public String info() {
        return null;
    }

    @Override
    public String[] aliases() {
        return new String[0];
    }
}