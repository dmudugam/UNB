let village=require("./village.js");

function measureRobot(state, robot, memory) {
  for (let turn = 0;; turn++) {
    if (state.parcels.length == 0) {
        return turn;
    }
    let action = robot(state, memory);
    state = state.move(action.direction);
    memory = action.memory;
  }
}

function compareRobots(robot1, memory1, robot2, memory2) {
   let totals1 = 0;
   let totals2 = 0;
   let trials = 100;
   
   for(let trial=0; trial < trials; trial++) {
   	let state = village.VillageState.random();
   	
   	totals1 += measureRobot(state, robot1, memory1)/trials;
   	totals2 += measureRobot(state, robot2, memory2)/trials;
   }
   console.log("Robot 1 average turns = " + totals1, "\nRobot 2 average turns = " + totals2);
}

compareRobots(village.routeRobot,[], village.randomRobot, []);
