package com.savi.main;

import com.savi.gas.GasType;

class ProgramLogic {


    void start() {
        Area area = new Area();
        GasType gasType = new GasType();
        MassCalculations massCalculations = new MassCalculations();
        AgentContainer agentContainer = new AgentContainer();

        area.calcVolume();
        gasType.startGasSelection();
        massCalculations.calcGasMass(area, gasType);
        agentContainer.selectContainer(gasType, massCalculations);
    }
}
