package warCraft;

import warCraft.warriors.Archer;
import warCraft.warriors.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team <T extends Warrior> implements Iterable<T>{
    private List<T> team = new ArrayList<>();
    public void  add(T element){
        team.add(element);
    }

    @Override
    public Iterator<T> iterator() {
        return team.iterator();
    }

    public int getTeamHealth (){
        int teamHealth = 0;
        for (T t: this) {
            teamHealth += t.getHealthPoint();
        }
        return teamHealth;
    }

    public int maxAttackDistance(){
        int maxAttackDistance = 0;
        for (T t: this) {
            if (!(t instanceof Archer)) {
                continue;
            }
            if (maxAttackDistance <((Archer)t).distance()){
                maxAttackDistance = ((Archer)t).distance();
            }
        } return maxAttackDistance;
    }
    public int getTeamAttack (){
        int teamAttack = 0;
        for (T t: this) {
            teamAttack += t.getWeapon().damage();
        } return teamAttack;
    }

    public int minTeamShield (){
        int minTeamShield = 0;
        for (T t: this) {
            if (minTeamShield > t.getArmor().getShield()) minTeamShield = t.getArmor().getShield();
        } return minTeamShield;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T t: this) {
            builder.append(t).append("\n");
        }
        builder.append(String.format("TeamAttack %d ", getTeamAttack()));
        builder.append(String.format("MaxTeamDistance %d ", maxAttackDistance()));
        builder.append(String.format("TeamHealth %d ", getTeamHealth()));
        return builder.toString();
    }
}
