package Models;

import java.util.HashMap;

public class FloorRegistryImpl implements  FloorRegistry<Integer, Floor>{

    private HashMap<Integer, Floor> floorRegistry;

    public FloorRegistryImpl(){
        floorRegistry = new HashMap<>();
    }


    @Override
    public Floor getPrototype(Integer FloorNumbber) {
        return floorRegistry.get(FloorNumbber);
    }

    @Override
    public void setPrototype(Integer floorNumber, Floor value) {
        floorRegistry.put(floorNumber, value);
    }

}
