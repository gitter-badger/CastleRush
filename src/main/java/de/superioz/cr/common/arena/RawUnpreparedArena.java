package de.superioz.cr.common.arena;

import de.superioz.cr.common.ItemKit;
import de.superioz.library.java.util.classes.SimplePair;
import org.bukkit.Location;

import java.util.ArrayList;
import java.util.List;

/**
 * This class was created as a part of CastleRush (Spigot)
 *
 * @author Superioz
 */
public class RawUnpreparedArena {

    protected String name;
    protected List<Location> spawnPoints;

    protected List<Location> rawGamePlots;
    protected SimplePair<Location, Location> rawGamePlotMarker;

    protected SimplePair<Location, Location> rawGameWalls;
    protected ItemKit itemKit;

    public RawUnpreparedArena(String name){
        this.name = name;
        this.spawnPoints = new ArrayList<>();
        this.rawGamePlots = new ArrayList<>();
        this.rawGameWalls = null;
        this.itemKit = null;
    }

    public boolean addSpawnpoint(Location loc){
        if(spawnPoints.contains(loc)){
            return false;
        }
        spawnPoints.add(loc);
        return true;
    }

    public boolean removeSpawnpoint(Location loc){
        if(spawnPoints.contains(loc)){
            spawnPoints.remove(loc);
            return true;
        }
        return false;
    }

    public void addGamePlotLocation(Location loc){
        rawGamePlots.add(loc);
    }

    public ItemKit getItemKit(){
        return itemKit;
    }

    public void setItemKit(ItemKit itemKit){
        this.itemKit = itemKit;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<Location> getRawGamePlots(){
        return rawGamePlots;
    }

    public void setRawGamePlots(List<Location> rawGamePlots){
        this.rawGamePlots = rawGamePlots;
    }

    public List<Location> getSpawnPoints(){
        return spawnPoints;
    }

    public void setSpawnPoints(List<Location> spawnPoints){
        this.spawnPoints = spawnPoints;
    }

    public SimplePair<Location, Location> getRawGameWalls(){
        return rawGameWalls;
    }

    public String getName(){
        return name;
    }

    public SimplePair<Location, Location> getRawGamePlotMarker(){
        return rawGamePlotMarker;
    }

    public boolean isFinished(){
        return (getItemKit() != null)
                && (getName() != null)
                && !getName().isEmpty()
                && (getSpawnPoints().size() >= 2);
    }

}