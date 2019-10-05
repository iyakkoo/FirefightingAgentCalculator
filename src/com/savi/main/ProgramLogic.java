package com.savi.main;

class ProgramLogic {


    void start() {
        Area area = new Area();
        Gas gas = new Gas();
        MassCalculations massCalculations = new MassCalculations();
        AgentContainer agentContainer = new AgentContainer();

        area.calcVolume();
        gas.startGasSelection();
        massCalculations.calcGasMass(area, gas);
        agentContainer.selectContainer(gas, massCalculations);
    }
}
